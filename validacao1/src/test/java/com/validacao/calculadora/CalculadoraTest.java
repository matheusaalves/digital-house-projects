package com.validacao.calculadora;

import com.validacao.util.CalculadoraCreate;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setup() {
        calculadora = CalculadoraCreate.create();
    }

    @Test
    @DisplayName("Valida parâmetros diferente de zero")
    void dividir() {
        double expected = calculadora.getN1() / calculadora.getN2();
        double resultado = calculadora.dividir();

        // Não é necessário usar o Assertions, se importar da forma que foi importado
//        Assertions.assertEquals(expected, resultado);

        assertEquals(expected, resultado);
    }

    @Test
    @DisplayName("Valida parâmetro igual a zero")
    void dividir_ReturnZero_WherParamEqualZero() {
        double expected = -1;
        calculadora.setN2(0);

        double resultado = calculadora.dividir();

        assertEquals(expected, resultado);
    }


}
