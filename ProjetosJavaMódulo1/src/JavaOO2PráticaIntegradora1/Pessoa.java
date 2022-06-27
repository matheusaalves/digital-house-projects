package JavaOO2PráticaIntegradora1;

public class Pessoa {
    private String nome, id;
    private int idade;
    private double peso, altura;

    public Pessoa() {}

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = peso/java.lang.Math.pow(altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade() {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade +
                "\nid: " + this.id + "\nPeso: " + this.peso +
                "\nAltura: " + this.altura;
    }

}
