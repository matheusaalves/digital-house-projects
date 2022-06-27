package figurasExemploAulaOOClasseAbstrata;

import exemploIntefacesAulaOO.Exibir;

public class Circulo extends FiguraGeometrica {
    public Circulo(Exibir exibir) {
        super(exibir);
    }

    @Override
    public String posicao() {
        return "Posição";
    }

    @Override
    public void posicaoPrint () {
        exibir.show("Círculo: " + getX() + ", " + getY());
    }
}
