package com.satc.satcloja.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemCompra extends Item {
    @ManyToOne
    @JoinColumn(name = "compra_id")
    private Compra compra;

    public ItemCompra(Produto produto, Double valorUnitario, Double quantidade, Double desconto) {
        super(produto, valorUnitario, quantidade, desconto);
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
