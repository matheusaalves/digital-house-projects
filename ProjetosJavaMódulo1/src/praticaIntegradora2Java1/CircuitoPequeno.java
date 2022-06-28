package praticaIntegradora2Java1;

import java.util.ArrayList;

public class CircuitoPequeno extends Circuito{
//    @Override
//    public double calculaValor() {
//        double valorTotal = 0;
//        for (Participante participante : this.participantes) {
//            if (participante.idade >= 18) {
//                valorTotal += 1500;
//            } else {
//                valorTotal += 1300;
//            }
//        }
//        return valorTotal;
//    }

    @Override
    public double calculaValorParticipante(Participante participante) {
        if (participante.getIdade() >= 18) {
            return 1500;
        } else {
            return 1300;
        }
    }

}
