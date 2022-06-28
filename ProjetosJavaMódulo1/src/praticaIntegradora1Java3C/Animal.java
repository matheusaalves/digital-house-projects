package praticaIntegradora1Java3C;

public abstract class Animal {
    public abstract void emitirSom();
    public abstract void comer();

    public static void comerAnimal(Animal animal) {
        animal.comer();
    }
}
