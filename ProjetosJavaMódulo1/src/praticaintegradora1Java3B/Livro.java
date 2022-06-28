package praticaintegradora1Java3B;

public class Livro implements Imprimivel{
    private int numeroPaginas;
    private String nomeAutor, titulo, genero;

    public Livro(int numeroPaginas, String nomeAutor, String titulo, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("Número de páginas: " + numeroPaginas +
                            "\nNome Autor: " + nomeAutor + "\nTitulo: " +
                            titulo + "\nGenero: " + genero);
    }
}
