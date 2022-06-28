package praticaIntegradora1Java3C;

public class AnimaisMain {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();

        System.out.println("-------");

        Animal.comerAnimal(cachorro);
        Animal.comerAnimal(gato);
        Animal.comerAnimal(vaca);
    }
}
