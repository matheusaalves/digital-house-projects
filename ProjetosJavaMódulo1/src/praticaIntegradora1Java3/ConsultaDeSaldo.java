package praticaIntegradora1Java3;

public class ConsultaDeSaldo implements Transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Transação OK Consulta de Saldo!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação Não OK Consulta de Saldo!");
    }
}
