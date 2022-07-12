package com.meli.obterdiploma.repository;

import com.meli.obterdiploma.exception.StudentNotFoundException;
import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.util.TestUtilsGenerator;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class StudentDAOTest {

    private IStudentDAO studentDAO;

    @BeforeEach
    public void setup() {
        TestUtilsGenerator.emptyUsersFile();
        studentDAO = new StudentDAO();
    }

    @Test
    void save_saveStudent_whenNewStudent() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO savedStudent = studentDAO.save(newStudent);

        assertThat(savedStudent).isNotNull();
        assertThat(savedStudent.getId().doubleValue()).isPositive();
        assertThat(savedStudent.getStudentName()).isEqualTo(newStudent.getStudentName());
    }

    @Test
    @DisplayName("Estudante é atualizado com sucesso")
    void save_updateStudent_whenStudentWithId() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO savedStudent = studentDAO.save(newStudent);

        savedStudent.setStudentName("Novo nome");
        savedStudent.getSubjects().get(0).setName("Nova disciplina");

        StudentDTO updatedStudent = studentDAO.save(savedStudent);

        assertThat(updatedStudent).isNotNull();
        assertThat(updatedStudent.getId()).isEqualTo(savedStudent.getId());
        assertThat(updatedStudent.getStudentName()).isEqualTo(savedStudent.getStudentName());
        assertThat(updatedStudent.getSubjects().get(0).getName())
                .isEqualTo(savedStudent.getSubjects().get(0).getName());
    }

    @Test
    void save_throwException_whenStudentWithIdAndNotExist() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();

        // Dispara a exceção de um tipo quando roda um trecho do código
        StudentNotFoundException exception = Assertions.assertThrows(StudentNotFoundException.class, () -> {
            studentDAO.save(student);
        });

        assertThat(exception.getError().getDescription()).contains(student.getId().toString());
        assertThat(exception.getStatus()).isEqualTo(HttpStatus.NOT_FOUND);

    }

    @Test
    void exists_returnTrue_whenStudentExist() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO savedStudent = studentDAO.save(newStudent);

        boolean found = studentDAO.exists(savedStudent);

        assertThat(found).isTrue();
    }

    @Test
    void exists_returnFalse_whenStudentNotExist() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();

        boolean found = studentDAO.exists(student);

        assertThat(found).isFalse();
    }

    @Test
    void delete_removeStudent_whenStudentExist() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();

        StudentDTO savedStudent = studentDAO.save(newStudent);

        studentDAO.delete(savedStudent.getId());

        assertThat(studentDAO.exists(savedStudent)).isFalse();
    }

    @Test
    void delete_throwException_whenStudentNotExist() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();

        StudentNotFoundException exception = Assertions.assertThrows(StudentNotFoundException.class, () -> {
            studentDAO.delete(student.getId());
        });

        assertThat(exception.getError().getDescription()).contains(student.getId().toString());
        assertThat(exception.getStatus()).isEqualTo(HttpStatus.NOT_FOUND);
    }


    @Test
    void findById_throwException_whenStudentNotExist() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();

        StudentNotFoundException exception = Assertions.assertThrows(StudentNotFoundException.class, () -> {
            StudentDTO foundStudent = studentDAO.findById(student.getId());
        });

        assertThat(exception.getError().getDescription()).contains(student.getId().toString());
        assertThat(exception.getStatus()).isEqualTo(HttpStatus.NOT_FOUND);
    }
}