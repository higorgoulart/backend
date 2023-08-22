package org.example;

import org.example.models.*;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        var fornecedor = new Fornecedor();
        fornecedor.setNome("Dell Ltda");

        var cliente = new Cliente();
        cliente.setNome("Bruno Kurzawe");

        var produto = new Produto("Computador", "I5 8gb");
        var servico = new Servico("Instalação Office", 2.0, 100.00);

        var compra = new Compra();
        compra.setDataCompra(LocalDate.now());
        compra.setFornecedor(fornecedor);
        var itemC1 = new ItemCompra(produto, 1000.00, 10.0, 10.0);
        compra.addItem(itemC1);

        var venda = new Venda();
        venda.setDataVenda(LocalDate.now());
        venda.setCliente(cliente);
        var item = new ItemVenda(produto, 1500.00, 1.0, 10.0);
        venda.addItem(item);

        var venda2 = new Venda();
        venda2.setDataVenda(LocalDate.now());
        venda2.setCliente(cliente);
        var item2 = new ItemVenda(produto, 1500.00, 1.0, 10.0);
        venda2.addItem(item2);
        var item3 = new ItemVenda(servico, 150.00, 1.0, 10.0);
        venda2.addItem(item3);

        var locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setDataLocacao(LocalDate.now());
        var itemL1 = new ItemLocacao(produto, 150.00, 10.0, 0.0);
        locacao.addItem(itemL1);

        var balanco = new Balanco();
        balanco.setId(352578L);
        balanco.setDataBalanco(LocalDate.now());
        balanco.setResponsavel("Maria Luiza");
        balanco.addOperacao(venda);
        balanco.addOperacao(venda2);
        balanco.addOperacao(compra);
        balanco.addOperacao(locacao);
        balanco.imprimirBalanco();
    }
}