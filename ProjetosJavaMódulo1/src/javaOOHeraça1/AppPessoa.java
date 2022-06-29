package javaOOHeraça1;

import java.util.Scanner;

public class AppPessoa {

    public static void main(String[] args) {
//        Estudante e1 = new Estudante("Juninho", "Curso");
//        System.out.println(e1);
//        e1.testinho();
//        Pessoa p = new Estudante("Juninho pessoa", "Cursinho");
//        System.out.println(p);


        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = Integer.parseInt(teclado.nextLine());

        Estudante e2 = new Estudante(nome, idade, "Curso");
        System.out.println(e2);


    }
}
