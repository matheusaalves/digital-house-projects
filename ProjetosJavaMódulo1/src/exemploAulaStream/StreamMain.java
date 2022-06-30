package exemploAulaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> stream = lista.stream();

        List<Integer> listaAlterada = stream.map(n -> n * 2).collect(Collectors.toList()); // Stream não altera os dados, então essa linha não faz nada com a lista só dá o retorno

        System.out.println("-------------- Lista não alterada");
        lista.forEach(n -> System.out.println(n));
        System.out.println("-------------- Lista alterada");
        listaAlterada.forEach(n -> System.out.println(n));
        listaAlterada.forEach(System.out::println);



        double media = lista.stream().filter(n -> n % 2 == 0).map(n -> n * 2).count();
        double media2 = lista.stream().filter(n -> n % 2 == 0).map(n -> n * 2).mapToDouble(n -> n ? 1.0 : 0.0).average();
        System.out.println("--------------");
        System.out.println("Qtde pares: " + media);
        System.out.println("Qtde pares: " + media2);

    }
}
