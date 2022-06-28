package praticaIntegradora2Java1;

public class CorridaMain {
    public static void main(String[] args) {
        Participante p1 = new Participante("00000001", "Matheus", "Roberto",
                "61-985406557", "61-33786365", "AB",
                27);
        Participante p2 = new Participante("00000002", "João", "Pedro",
                "61-985406577", "61-33784465", "A",
                22);
        Participante p3 = new Participante("00000003", "João", "Carlos",
                "61-985406577", "61-33784465", "B",
                17);
        Participante p4 = new Participante("00000004", "Maria", "Luiza",
                "61-985406577", "61-33784465", "O",
                15);

        Circuito c1 = new CircuitoPequeno();
        Circuito c2 = new CircuitoMedio();
        Circuito c3 = new CircuitoAvancado();

        c1.inserirParticipante(p1);
        c1.inserirParticipante(p2);
        c1.inserirParticipante(p3);

        c2.inserirParticipante(p1);
        c2.inserirParticipante(p2);
        c2.inserirParticipante(p3);
        c2.inserirParticipante(p4);

        System.out.println("---------- Circuito Pequeno");
        System.out.println("Valor total: " + c1.getValorTotal());
        c1.mostrarParticipantes();

        System.out.println("\n---------- Circuito Médio");
        System.out.println("Valor total: " + c2.getValorTotal());
        c2.mostrarParticipantes();

        System.out.println("\n---------- Circuito Avançado");
        c3.inserirParticipante(p1);
        c3.inserirParticipante(p3);
        c3.inserirParticipante(p4);

        System.out.println("Valor total: " + c3.getValorTotal());
        c3.mostrarParticipantes();

        System.out.println("\n---------- Circuito Avançado [Remoção]");
        c3.removerParticipante(p1);
        c3.mostrarParticipantes();

    }
}
