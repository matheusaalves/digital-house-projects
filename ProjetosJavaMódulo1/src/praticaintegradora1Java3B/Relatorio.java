package praticaintegradora1Java3B;

public class Relatorio implements Imprimivel{
    private String texto, autor, revisor;
    private int numeroPaginas;

    public Relatorio(String texto, String autor, String revisor, int numeroPaginas) {
        this.texto = texto;
        this.autor = autor;
        this.revisor = revisor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void imprimir() {
        System.out.println("Texto: " + texto + "\nAutor: " + autor +
                            "\nRevisor: " + revisor +  "\nNúmero Página: "
                            + numeroPaginas);
    }
}
