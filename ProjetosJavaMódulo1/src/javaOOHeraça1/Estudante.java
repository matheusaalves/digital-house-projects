package javaOOHeraça1;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override // Sobrescrita, só uma documentação, não precisa colocar necessariamente
    public String toString() {
        return super.toString() + ", " + curso;
    }

    public void testinho() {
        System.out.println("TESTEEEEE");
    }
}