package com.meli.obterdiploma.controller;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.service.IStudentService;
import com.meli.obterdiploma.util.TestUtilsGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.verification.AtLeast;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@SpringBootTest
class StudentControllerTest {

    @InjectMocks
    private StudentController controller;

    @Mock
    IStudentService studentService;

    @BeforeEach
    public void setup() {
        BDDMockito.when(studentService.create(ArgumentMatchers.any(StudentDTO.class)))
                .thenReturn(TestUtilsGenerator.getStudentWithId());

        BDDMockito.when(studentService.read(ArgumentMatchers.anyLong()))
                .thenReturn(TestUtilsGenerator.getStudentWithId());

        BDDMockito.doNothing().when(studentService).delete(ArgumentMatchers.anyLong());
    }

    @Test
    void registerStudent() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();

        ResponseEntity<StudentDTO> response = controller.registerStudent(newStudent);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getId())
                .isNotNull()
                .isPositive();
    }

    @Test
    void getStudent() {
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId();

        StudentDTO studentFound = controller.getStudent(studentDTO.getId());

        verify(studentService, atLeastOnce()).read(studentDTO.getId());

        assertThat(studentFound.getId()).isEqualTo(studentDTO.getId());
        assertThat(studentFound.getStudentName()).isEqualTo(studentDTO.getStudentName());
        assertThat(studentFound.getId())
                .isNotNull()
                .isPositive();

    }

    @Test
    void modifyStudent() {
    }

    @Test
    void removeStudent() {
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId();

        ResponseEntity<Void> response = controller.removeStudent(studentDTO.getId());

        verify(studentService, atLeastOnce()).delete(studentDTO.getId());
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
        assertNull(response.getBody());
    }

    @Test
    void listStudents() {
    }
}