package classes;

import java.util.List;

public class Fatura {
    private Cliente cliente;
    private List<Item> listaItens;
    private double totalCompras;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public void calculaTotal() {
        totalCompras = listaItens.stream().mapToDouble(item -> item.getCustoUnitario() * item.getQuantidadeComprada()).sum();
    }

}
