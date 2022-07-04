package com.javaspring1.praticaintegradora1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaspring1.praticaintegradora1.interfaces.Conversor;

import javax.websocket.server.PathParam;

@RequestMapping("/numeros_romanos") // indica que o '/user' é usado para acionar este controller
@RestController
public class ConversorNumeroRomanos implements Conversor {
    private final int NUMEROS_INTEIROS[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private final String NUMEROS_ROMANOS[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    @GetMapping("{numero}")
    public String converter(@PathVariable int numero) {
        StringBuilder roman = new StringBuilder();

        for(int i=0;i<NUMEROS_INTEIROS.length;i++) {
            while(numero >= NUMEROS_INTEIROS[i]) {
                numero -= NUMEROS_INTEIROS[i];
                roman.append(NUMEROS_ROMANOS[i]);
            }
        }

        return roman.toString();
    }
}
