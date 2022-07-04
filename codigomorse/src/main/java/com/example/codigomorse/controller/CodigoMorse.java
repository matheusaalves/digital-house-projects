package com.example.codigomorse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/codigo_morse")
@RestController
public class CodigoMorse {
    private Map<String, String> dicionario = new HashMap<String, String> () {{
        put(".-", "A");
        put("-...", "B");
        put("-.-.", "C");
        put("-..", "D");
        put(".", "E");
        put("..-.", "F");
        put("--.", "G");
        put("....", "H");
        put("..", "I");
        put(".---", "J");
        put("-.-", "K");
        put(".-..", "L");
        put("--", "M");
        put("-.", "N");
        put("---", "O");
        put(".--.", "P");
        put("--.-", "Q");
        put(".-.", "R");
        put("...", "S");
        put("-", "T");
        put("..-", "U");
        put("...-", "V");
        put(".--", "W");
        put("-..-", "X");
        put("-.--", "Y");
        put("--..", "Z");

        put(".----", "1");
        put("..---", "2");
        put("...--", "3");
        put("....-", "4");
        put(".....", "5");
        put("-....", "6");
        put("--...", "7");
        put("---..", "8");
        put("----.", "9");
        put("-----", "0");

        put("..--..", "?");
        put("-.-.--", "!");
        put(".-.-.-", ".");
        put("--..--", ",");
    }};

    @GetMapping("/{codigo}")
    public ResponseEntity<String> converterCodigo(@PathVariable String codigo) {
        String frase = "";
        for(String cod : codigo.split("   ")) {
            for(String s : cod.split(" ")) {
                frase += dicionario.get(s);
            }
            frase += " ";
        }
        return ResponseEntity.ok(frase);
    }
}
