package praticaintegradora1Java3B;

import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private List<String> habilidades;

    public Pessoa(String nome, int idade, List<String> habilidades) {
        this.nome = nome;
        this.idade = idade;
        this.habilidades = habilidades;
    }

    @Override
    public String toString(){
        return "nome: " + nome + "\nidade: " + idade + "\nhabilidade: " + habilidades;
    }
}
