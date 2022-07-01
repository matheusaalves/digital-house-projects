package com.example.exemplo.controller;

import com.example.exemplo.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que esta classe é um controller REST
@RequestMapping("/user") // indica que o '/user' é usado para acionar este controller
public class Hello {

    @GetMapping // Este método é acionado por uma requisição GET (/user)
    public String digaHello() {
        return "Olá!";
    }

    @GetMapping("ola2") // /user/ola2
    public String digaHello2() {
        return "Olá 2!";
    }

    @GetMapping("ola2/{nome}") // /user/ola2/<nome>
    public String digaNome(@PathVariable String nome) {
        return nome;
    }

    @GetMapping("ola") // /user/ola2?nome=nome
    public String digaHello2(@RequestParam String nome) {
        return "Olá  " + nome + "!";
    }


    @GetMapping("test/{nome}/{id}") // /user/ola2?nome=nome
    public String digaHello2(@PathVariable String nome, @PathVariable int id) {
        return "Olá  " + nome + ", id " + id + "!";
    }

    @PostMapping
    public String getUser(@RequestBody User user) {
        return "Usuário recebido: " + user.toString();
    }

    @PostMapping("/response")
    public ResponseEntity<User> getUserX(@RequestBody User user) {
        if(user.getId().equals("123")) {
            UserDto userDto = new UserDto(user); // Para passar só as informações desejadas
            return new ResponseEntity(userDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}
