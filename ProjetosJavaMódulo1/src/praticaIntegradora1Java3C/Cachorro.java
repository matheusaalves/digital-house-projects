package praticaIntegradora1Java3C;

public class Cachorro extends Animal implements Carnivoro{
    @Override
    public void emitirSom() {
        System.out.println("Au au au!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Cachorro comendo carne!");
    }

    @Override
    public void comer() {
        this.comerCarne();
    }
}
