package classes;

public class Cliente {
    private String id, nome, sobrenome;

    public Cliente(String id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + "(" + id + ")";
    }
}
