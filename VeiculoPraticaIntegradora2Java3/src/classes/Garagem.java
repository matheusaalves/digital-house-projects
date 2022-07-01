package classes;

import java.util.List;

public class Garagem {
    String id;
    List<Veiculo> veiculos;

    public Garagem(String id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
