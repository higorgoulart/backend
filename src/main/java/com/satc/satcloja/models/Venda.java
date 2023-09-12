package com.satc.satcloja.models;

import com.satc.satcloja.enums.FormaPagamento;
import com.satc.satcloja.enums.TipoOperacao;
import com.satc.satcloja.interfaces.OperacaoFinanceira;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Venda extends EntityId implements OperacaoFinanceira {
    @Column(name = "dt_venda")
    private LocalDate dataVenda;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pgto")
    private FormaPagamento formaPagamento;

    @Column(name = "observacao")
    private String observacao;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
    private List<ItemVenda> itens = new ArrayList<>();

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void addItem(ItemVenda item) {
        item.setVenda(this);
        this.itens.add(item);
    }

    public void removeItem(ItemVenda item) {
        this.itens.remove(item);
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataVenda();
    }

    @Override
    public Double getValorOperacao() {
        return this.getItens().stream().mapToDouble(ItemVenda::getValorCalculado).sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.CREDITO;
    }
}
