package com.validacao.calculadora;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculadora {
    private double n1, n2;

    public double dividir() {
        if (n2 == 0) {
            return -1;
        } else {
            return n1/n2;
        }
    }
}
