package com.meli.obterdiploma.service;

import com.meli.obterdiploma.model.StudentDTO;

import javax.validation.Valid;

public interface IObterDiplomaService {

    StudentDTO analyzeScores(StudentDTO rq);
}
