package figurasExemploAulaOOClasseAbstrata;

import exemploIntefacesAulaOO.Exibir;

public abstract class FiguraGeometrica {
    public abstract String posicao();
    public abstract void posicaoPrint();
//    public abstract double calculaArea();

    private int x, y;
    public Exibir exibir;

    public FiguraGeometrica(Exibir exibir) {
        this.exibir = exibir;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
