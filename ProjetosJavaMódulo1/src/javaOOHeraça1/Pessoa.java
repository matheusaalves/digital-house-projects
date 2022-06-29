package javaOOHeraça1;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //    Para chamar um método quando printar o objeto instanciado
    @Override // Sobrescrita, só uma documentação, não precisa colocar necessariamente
    public String toString() {
        return nome + ", " + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
