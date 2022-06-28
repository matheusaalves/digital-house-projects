package praticaintegradora1Java3B;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Matheus", 27, new ArrayList<String>(Arrays.asList("Java", "Python", "Rails")));
        Imprimivel curriculo = new Curriculo(pessoa);
        Imprimivel livro = new Livro(10, "Adam Slander", "Macacos me mordam", "Comédia");
        Imprimivel relatorio = new Relatorio("Texto enorme", "Raimundo Dias", "Arnaldo Cesar", 42);

        System.out.println("------ Currículo");
        curriculo.imprimir();
        System.out.println("------ Livro");
        livro.imprimir();
        System.out.println("------ Relatório");
        relatorio.imprimir();


    }
}
