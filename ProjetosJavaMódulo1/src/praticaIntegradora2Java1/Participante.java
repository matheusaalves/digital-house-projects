package praticaIntegradora2Java1;

public class Participante {
    private String rg, nome, sobrenome, numeroCelular, numeroEmergencia, grupoSanguineo;
    private int idade, numeroParticipante;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNumeroParticipante(int numeroParticipante) {
        this.numeroParticipante = numeroParticipante;
    }

    public Participante(
            String rg, String nome, String sobrenome,
            String numeroCelular, String numeroEmergencia,
            String grupoSanguineo, int idade
    ) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroCelular = numeroCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Participante: " +
                "rg='" + rg + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", numeroEmergencia='" + numeroEmergencia + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", idade=" + idade +
                ", numeroParticipante=" + numeroParticipante;
    }

}
