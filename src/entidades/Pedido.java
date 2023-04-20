package entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Ingresso{
    private Cliente cliente;
    private List<Ingresso> ingressos = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private double valorf;


    public Pedido() {
    }

    public Pedido(List pedido) {
        this.pedidos = pedido;
    }
    public Pedido(String nomeJogo, Double valor, Integer quantidade, Cliente cliente, List<Ingresso> ingressos) {
        super(nomeJogo, valor, quantidade);
        this.cliente = cliente;
        this.ingressos = ingressos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public Double calcula() {
        return this.valorf = super.getValor() * getQuantidade();

    }
    public Double getValorF() {
        return valorf;
    }
}
