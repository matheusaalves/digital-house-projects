package praticaIntegradora1Java3C;

public class Gato extends Animal implements Carnivoro{
    @Override
    public void emitirSom() {
        System.out.println("Miaaaaaaaau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Gato comendo carne!");
    }

    @Override
    public void comer() {
        this.comerCarne();
    }
}
