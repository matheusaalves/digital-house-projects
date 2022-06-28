package praticaIntegradora1Java3;

public class PagamentoDeServicos implements Transacao{
    @Override
    public void transacaoOk() {
        System.out.println("Transação OK Pagamento de Serviços!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação Não OK Pagamento de Serviços!");
    }
}
