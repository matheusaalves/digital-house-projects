package com.validacao.validacao.handle;

import com.validacao.validacao.exception.ValidationExceptionDetails;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<FieldError> errors = ex.getBindingResult().getFieldErrors();
        return new ResponseEntity<>(
                // No fields ele pega o array de erros e concatena com ; transformando em string
                ValidationExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .title("Campos inválidos")
                        .message(ex.getClass().getName())
                        .fields(errors.stream().map(FieldError::getField)
                                .collect(Collectors.joining(";")))
                        .fieldsMessages(errors.stream().map(FieldError::getDefaultMessage)
                                .collect(Collectors.joining(";")))
                        .build()
                , status
        );
//        return super.handleMethodArgumentNotValid(ex, headers, status, request);
    }
}
