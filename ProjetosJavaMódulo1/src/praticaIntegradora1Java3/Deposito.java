package praticaIntegradora1Java3;

public class Deposito implements Transacao{
    @Override
    public void transacaoOk() {
        System.out.println("Transação OK Depósito!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação Não OK Depósito!");
    }
}
