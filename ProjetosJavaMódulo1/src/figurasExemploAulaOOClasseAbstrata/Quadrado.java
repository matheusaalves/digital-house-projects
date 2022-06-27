package figurasExemploAulaOOClasseAbstrata;

import exemploIntefacesAulaOO.Exibir;

public class Quadrado extends FiguraGeometrica{
    public Quadrado(Exibir exibir) {
        super(exibir);
    }

    @Override
    public String posicao() {
        return null;
    }

    @Override
    public void posicaoPrint() {
        exibir.show("Quadrado: " + getX() + ", " + getY());
    }
}
