package figurasExemploAulaOOClasseAbstrata;

import utilExemploInterfaceAulaOO.ExibirTela;
import exemploIntefacesAulaOO.Exibir;

public class AppFiguras {
    public static void main(String[] args) {
        ExibirTela ex1 = new ExibirTela();
        Exibir ex2 = new ExibirTela();

        FiguraGeometrica f1 = new Circulo(ex1);
        FiguraGeometrica f2 = new Quadrado(ex1);

        Circulo c1 = new Circulo(ex2);

        f1.posicaoPrint();
        f2.posicaoPrint();

    }
}
