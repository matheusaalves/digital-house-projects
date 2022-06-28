package praticaintegradora1Java3B;

public class Curriculo implements Imprimivel{
    private Pessoa pessoa;

    public Curriculo(Pessoa pesssoa) {
        this.pessoa = pesssoa;
    }

    @Override
    public void imprimir() {
        System.out.println(this.pessoa.toString());
    }
}
