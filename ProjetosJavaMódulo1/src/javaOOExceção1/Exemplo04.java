package javaOOExceção1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro:");

        try {
            numero = teclado.nextInt(); //Colocar letra para gerar exceção
            System.out.println("Deu bom :)");
            System.out.println(numero);
        } catch(InputMismatchException ex) {
            System.out.println("Deu ruim :(");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Aqui sempre entra, não tem como correr ;)");
        }


    }
}
