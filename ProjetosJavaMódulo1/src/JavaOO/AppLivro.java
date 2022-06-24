package JavaOO;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro1, livro2;
        livro1 = new Livro();
        livro2 = new Livro();

        livro1.nome = "teste";
        livro1.autor = "teste_autor";
        livro2.nome = "teste2";
        livro2.autor = "teste2_autor";

        System.out.println(livro1.nome);
        System.out.println(livro2.nome);
    }
}
