package praticaIntegradora1Java3C;

public class Vaca extends Animal implements Herbivoro{
    @Override
    public void emitirSom() {
        System.out.println("Muuuuuuuu!");
    }

    @Override
    public void comerPasto() {
        System.out.println("Vaca comendo pasto!");
    }

    @Override
    public void comer() {
        this.comerPasto();
    }
}
