package praticaIntegradora2Java1;

public class CircuitoAvancado extends Circuito{
//    @Override
//    public double calculaValor() {
//        return this.participantes.size() * 2800;
//    }


    @Override
    public double calculaValorParticipante(Participante participante) {
        return 2800;
    }

    @Override
    public void inserirParticipante(Participante participante) {
        if(participante.getIdade() >= 18) {
            super.inserirParticipante(participante);
        } else {
            System.out.println("Não foi possível inserir o participante!\n" +
                    participante.getNome() + " " + participante.getSobrenome() + " não foi inserido.\n");
        }
    }
}
