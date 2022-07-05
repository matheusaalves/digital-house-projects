package com.dh.meli.spring02.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) //Define qual tipo de erro será enviado
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }


}
