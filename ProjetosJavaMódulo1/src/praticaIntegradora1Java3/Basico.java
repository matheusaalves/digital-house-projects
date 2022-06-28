package praticaIntegradora1Java3;

public class Basico {
    private ConsultaDeSaldo consultaDeSaldo;
    private PagamentoDeServicos pagamentoDeServicos;
    private SaqueEmDinheiro saqueEmDinheiro;

    public Basico(ConsultaDeSaldo consultaDeSaldo, PagamentoDeServicos pagamentoDeServicos, SaqueEmDinheiro saqueEmDinheiro) {
        this.consultaDeSaldo = consultaDeSaldo;
        this.pagamentoDeServicos = pagamentoDeServicos;
        this.saqueEmDinheiro = saqueEmDinheiro;
    }

    public ConsultaDeSaldo getConsultaDeSaldo() {
        return consultaDeSaldo;
    }

    public void setConsultaDeSaldo(ConsultaDeSaldo consultaDeSaldo) {
        this.consultaDeSaldo = consultaDeSaldo;
    }

    public PagamentoDeServicos getPagamentoDeServicos() {
        return pagamentoDeServicos;
    }

    public void setPagamentoDeServicos(PagamentoDeServicos pagamentoDeServicos) {
        this.pagamentoDeServicos = pagamentoDeServicos;
    }

    public SaqueEmDinheiro getSaqueEmDinheiro() {
        return saqueEmDinheiro;
    }

    public void setSaqueEmDinheiro(SaqueEmDinheiro saqueEmDinheiro) {
        this.saqueEmDinheiro = saqueEmDinheiro;
    }
}
