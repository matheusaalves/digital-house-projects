package praticaIntegradora1Java3;

public class Transferencia implements Transacao{
    @Override
    public void transacaoOk() {
        System.out.println("Transação OK Tranferência!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação Não OK Transferência!");
    }
}
