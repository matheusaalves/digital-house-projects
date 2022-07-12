package com.meli.obterdiploma.service;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ObterDiplomaServiceTest {

    @Mock
    private StudentRepository studentRepo;

    @InjectMocks
    private ObterDiplomaService diplomaService;

    @BeforeEach
    public void setup() {
        diplomaService = new ObterDiplomaService();
        StudentDTO student = new StudentDTO();
    }

    @Test
    void getGreetingMessage_ReturnMessage_WhenStudentNameAndAverageHaveValue() {
        Long id = new Long(1);
        StudentDTO student = diplomaService.analyzeScores(id);
        System.out.println(student);
        String msg = student.getMessage();

        assertEquals("Oi papai!", msg);
    }
}