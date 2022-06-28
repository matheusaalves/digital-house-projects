package praticaIntegradora1Java3;

public class Colaborador {
    private SaqueEmDinheiro saqueEmDinheiro;
    private ConsultaDeSaldo consultaDeSaldo;

    public Colaborador(SaqueEmDinheiro saqueEmDinheiro, ConsultaDeSaldo consultaDeSaldo) {
        this.saqueEmDinheiro = saqueEmDinheiro;
        this.consultaDeSaldo = consultaDeSaldo;
    }

    public SaqueEmDinheiro getSaqueEmDinheiro() {
        return saqueEmDinheiro;
    }

    public void setSaqueEmDinheiro(SaqueEmDinheiro saqueEmDinheiro) {
        this.saqueEmDinheiro = saqueEmDinheiro;
    }

    public ConsultaDeSaldo getConsultaDeSaldo() {
        return consultaDeSaldo;
    }

    public void setConsultaDeSaldo(ConsultaDeSaldo consultaDeSaldo) {
        this.consultaDeSaldo = consultaDeSaldo;
    }
}
