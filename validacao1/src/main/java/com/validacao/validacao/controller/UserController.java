package com.validacao.validacao.controller;

import com.validacao.validacao.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public ResponseEntity<UserDto> saveUser(@RequestBody @Valid UserDto userDto) {
        return new ResponseEntity<UserDto>(userDto, HttpStatus.CREATED);
    }
}
