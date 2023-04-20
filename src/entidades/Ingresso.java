package entidades;

public class Ingresso {
    private String nomeJogo;
    private Double valor;
    private Integer quantidade;

    public Ingresso() {
    }

    public Ingresso(String nomeJogo, Double valor, Integer quantidade) {
        this.nomeJogo = nomeJogo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
