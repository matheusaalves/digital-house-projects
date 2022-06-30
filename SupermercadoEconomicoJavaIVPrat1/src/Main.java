import classes.Cliente;
import classes.Fatura;
import classes.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main <T>{
    public static void main(String[] args) {
        List<Cliente> clientes = inicializacaoClientes();

//        parte1(clientes);

        Fatura fatura = new Fatura();

        List<Item> itens = new ArrayList<Item>();
        itens.add(new Item("001", "Alho", 10, 3));
        itens.add(new Item("002", "Macarrão", 2, 5));
        itens.add(new Item("003", "Tijolo", 50, 10.1));
        itens.add(new Item("004", "Leite", 2, 3.7));
        itens.add(new Item("005", "Chave", 4, 1.0));

        fatura.setListaItens(itens);
        fatura.calculaTotal();
        System.out.println(fatura.getTotalCompras());
    }

    public static List<Cliente> inicializacaoClientes() {
        // Parte 1 - Criar 3 clientes
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("001", "Matheus", "Roberto"));
        clientes.add(new Cliente("002", "Weslley", "Rocha"));
        clientes.add(new Cliente("003", "Bianca", "Polegatti"));
        return clientes;
    }

    public static void parte1(List<Cliente> clientes) {
        // Parte 1 - Percorrer coleção e exibir dados
        System.out.println("-------- Todos clientes");
        clientes.stream().forEach(c -> System.out.println(c));

        // Parte 1 - Excluir cliente da lista
        System.out.println("\n-------- Com clientes removidos");
        clientes.remove(2);
        clientes.stream().forEach(c -> System.out.println(c));

        // Parte 1 - Excluir via teclado
        System.out.println("\n-------- Com clientes removidos via teclado");

        System.out.println("Digite o id do cliente a ser removido: ");

        Scanner teclado = new Scanner(System.in);
        String idClienteRemover = teclado.nextLine();

        if (clientes.stream().filter(cliente -> cliente.getId().equals(idClienteRemover)).count() > 0) {
            clientes.removeIf(cliente -> cliente.getId().equals(idClienteRemover));
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Não existe esse cliente no sistema!");
        }

        clientes.stream().forEach(c -> System.out.println(c));
    }

}
