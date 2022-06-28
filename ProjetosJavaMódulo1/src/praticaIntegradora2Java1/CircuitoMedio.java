package praticaIntegradora2Java1;

public class CircuitoMedio extends Circuito{
//    @Override
//    public double calculaValor() {
//        double valorTotal = 0;
//        for (Participante participante : this.participantes) {
//            if (participante.idade >= 18) {
//                valorTotal += 2300;
//            } else {
//                valorTotal += 2000;
//            }
//        }
//    }

    @Override
    public double calculaValorParticipante(Participante participante) {
            if (participante.getIdade() >= 18) {
                return 2300;
            } else {
                return 2000;
            }
    }
}
