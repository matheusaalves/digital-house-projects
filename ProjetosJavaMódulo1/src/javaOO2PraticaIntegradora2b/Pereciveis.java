package javaOO2PraticaIntegradora2b;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double resultado = quantidadeDeProdutos * getPreco();
        if (diasParaVencer == 1) {
            return resultado/4;
        } else if (diasParaVencer == 2) {
            return resultado/3;
        } else if (diasParaVencer == 3) {
            return resultado/2;
        }
        else {
            return resultado;
        }
    }
}
