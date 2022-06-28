package praticaIntegradora2Java1;

import java.util.ArrayList;

public abstract class Circuito {
    private ArrayList<Participante> participantes = new ArrayList<Participante>();
    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    //    public abstract double calculaValor();
    public abstract double calculaValorParticipante(Participante participante);

    public void mostrarParticipantes() {
        for (Participante participante : participantes) {
            System.out.println(participante.toString());
        }
    }
    public void inserirParticipante(Participante participante) {
        participantes.add(participante);
        valorTotal += calculaValorParticipante(participante);
        participante.setNumeroParticipante(participantes.size());
    }

    public void removerParticipante(Participante participante) {
        participantes.remove(participante);
        valorTotal -= calculaValorParticipante(participante);
        participante.setNumeroParticipante(participantes.size());
    }
}
