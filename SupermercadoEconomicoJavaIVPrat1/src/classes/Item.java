package classes;

public class Item {
    private String codigo, nome;
    private int quantidadeComprada;
    private double custoUnitario;

    public Item(String codigo, String nome, int quantidadeComprada, double custoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeComprada = quantidadeComprada;
        this.custoUnitario = custoUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }
}
