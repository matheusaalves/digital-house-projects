import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import classes.Pessoa;
import classes.Dados;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Dados.getPessoas();

        // Listar todas as pessoas
//        pessoas.stream()
//                .forEach(System.out::println);


        // Listar as 10 primeiras pessoas
//        pessoas.stream()
//                .limit(10)
//                .forEach(System.out::println);

        // Listar as pessoas que são do Brasil
//        pessoas.stream()
//                .filter(p->p.getPais().equals("Brazil"))
//                .forEach(System.out::println);

        // Listar as pessoas do Brasil com o nome Uppercase e suas idades
//        pessoas.stream()
//                .filter(p->p.getPais().equals("Brazil"))
//                .map(p -> p.getNome().toUpperCase() + ", " + p.getIdade())
//                .forEach(System.out::println);

        // Listar as pessoas do Brasil com o nome Uppercase e suas idades(Outra forma de usar o map)
//        pessoas.stream()
//                .filter(p->p.getPais().equals("Brazil"))
//                .map(p -> {
//                    return p.getNome().toUpperCase() + ", " + p.getIdade();
//                })
//                .forEach(System.out::println);

        // Listar pessoas do Brasil em ordem de nome
//        pessoas.stream()
//                .filter( p->p.getPais().equals("Brazil") )
//                .sorted((p1, p2)-> p1.getNome().compareTo(p2.getNome()))
//                .forEach(System.out::println);

        // Lista o primeiro elemento dentre os objetos
//        Pessoa p1 = pessoas.stream().findFirst().get();
//        System.out.println(p1);


        // Ordenando pessoas por método padrão
//            pessoas.stream()
//                .filter( p->p.getPais().equals("Brazil") )
//                .sorted()
//                .forEach(System.out::println);

        // Conte quantas pessoas tem mais de 45 anos
//        long quantidade = pessoas.stream()
//                .filter(p -> p.getIdade() > 45)
//                .count();
//        System.out.println("Existe " + quantidade + " pessoas com mais de 45 anos");


        OptionalDouble media = pessoas.stream()
                .mapToInt(p -> p.getIdade())
                .average();
        System.out.println("Média de idadee: " + media.getAsDouble());



    }
}