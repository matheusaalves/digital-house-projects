package javaOO2PráticaIntegradora2;

public class PraticaExcecoes {
    private int a=0, b=300;

    public void razao() {
        int resultado;
        try {
            resultado = b/a;
        } catch (ArithmeticException e) {
//            System.out.println("Ocorreu um erro");
            throw new IllegalArgumentException();
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
