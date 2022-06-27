package JavaOO2PráticaIntegradora1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Maria Luiza", 27, "A0001");
        Pessoa p3 = new Pessoa("Matheus", 27, "A0002", 85.7, 1.84);

        System.out.println(p3.toString());
        System.out.print("Status imc: ");
        int imc = p3.calcularIMC();
        if(imc == -1) {
            System.out.println("Abaixo do Peso!");
        } else if(imc == 0) {
            System.out.println("Pessoa Saudável!");
        } else {
            System.out.println("Sobrepeso!");
        }

        System.out.println("É maior de idade? " + (p3.ehMaiorIdade() ? "Sim!" : "Não!"));

    }
}
