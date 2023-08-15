package org.example.models;

public class Servico extends ItemVendavel {
    private Double quantidadeHoras;

    public Servico(String descricao, Double quantidadeHoras, Double valorUnitario) {
        super.setDescricao(descricao);
        super.setValorUnitario(valorUnitario);

        this.quantidadeHoras = quantidadeHoras;
    }

    public Double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}
