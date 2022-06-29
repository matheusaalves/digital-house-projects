package javaOO2;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(12, 34, 11);

        relogio.mostrarHoraCompleta();

        relogio.setHora(25);

        relogio.mostrarHoraCompleta();
    }
}
