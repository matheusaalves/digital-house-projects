package praticaIntegradora1Java3;

public class SaqueEmDinheiro implements Transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Transação OK Saque em dinheiro!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação Não OK Saque em dinheiro!");
    }
}
