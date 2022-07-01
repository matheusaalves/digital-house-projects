import classes.Garagem;
import classes.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Exercício 2
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("Ford", "Fiesta", 1000));
        veiculos.add(new Veiculo("Ford", "Focus", 1200));
        veiculos.add(new Veiculo("Ford", "Explorer", 2500));

        veiculos.add(new Veiculo("Fiat", "Uno", 500));
        veiculos.add(new Veiculo("Fiat", "Cronos", 1000));
        veiculos.add(new Veiculo("Fiat", "Torino", 1250));

        veiculos.add(new Veiculo("Chevrolet", "Aveo", 1250));
        veiculos.add(new Veiculo("Chevrolet", "Spin", 2500));

        veiculos.add(new Veiculo("Toyota", "Corola", 1200));
        veiculos.add(new Veiculo("Toyota", "Fortuner", 3000));

        veiculos.add(new Veiculo("Renault", "Logan", 950));

        Garagem g1 = new Garagem("001", veiculos);

        // Exercício 3
//        g1.getVeiculos().stream()
//                .sorted((v1, v2) -> v1.getPreco() > v2.getPreco() ? 1 : -1)
//                .forEach(System.out::println);

        // Exercício 4
//        g1.getVeiculos().stream()
//                .sorted((v1, v2) -> v1.getMarca().compareTo(v2.getMarca()))
//                .forEach(System.out::println);

        // Exercício 5
        Stream listaVeiculosBaratos = g1.getVeiculos().stream()
                .filter(v -> v.getPreco() < 1000);

        Stream listaVeiculosCaros = g1.getVeiculos().stream()
                .filter(v ->  v.getPreco() >= 1000);

        System.out.println("---------- Carros baratos");
        listaVeiculosBaratos.forEach(System.out::println);
        System.out.println("---------- Carros caros");
        listaVeiculosCaros.forEach(System.out::println);

        double precoMedio = g1.getVeiculos().stream()
                .mapToDouble(v -> v.getPreco())
                .average().getAsDouble();

        System.out.println("--------- Preço médio");
        System.out.println(precoMedio);
    }
}
