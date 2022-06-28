package javaOO2PraticaIntegradora2b;

public class Distribuidora {
    public static void main(String[] args) {
        Produto p[] = {
                new Pereciveis("Goiaba", 1.1, 2),
                new Pereciveis("Pera", 1.0, 1),
                new Pereciveis("Banana", 2.3, 3),
                new NaoPereciveis("Arroz", 12.5),
                new NaoPereciveis("Feijão", 6.5),
                new NaoPereciveis("Macarrão", 7.5),
        };

        double totalPereciveis=0, totalNaoPereciveis=0;

        totalPereciveis = p[2].calcular(5);
        totalNaoPereciveis = p[5].calcular(5);

        System.out.println("Não perecível total: R$" + totalNaoPereciveis);
        System.out.println("Perecível total: R$" + totalPereciveis);
        System.out.println("Preço total: R$" + (totalPereciveis + totalNaoPereciveis));
    }
}
