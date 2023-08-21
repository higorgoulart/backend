package org.example;

import org.example.models.*;

public class Application {
    public static void main(String[] args) {
        var dell = new Fornecedor();

        dell.setNome("Dell LTDA");
        dell.setCnpj("");
        dell.setIe("111151-10");
        dell.setEmail("dell@yahoo.com.br");
        dell.setTelefone("48 99999-9999");
        dell.setEndereco("Rua dos Bobos, Nº 0");

        System.out.println(dell);

        var cliente = new Cliente();

        cliente.setNome("Higor");
        cliente.setCpf("000.000.000-00");
        cliente.setRg("00.000.000-0");
        cliente.setEmail("higor@yahoo.com.br");
        cliente.setTelefone("48 99999-9999");
        cliente.setEndereco("Rua dos Bobos, Nº 0");

        System.out.println(cliente);

        var produto1 = new Produto("", "", 0.0);
        produto1.setNome("Claudio");
        var produto2 = new Produto("", "", 0.0);
        produto2.setNome("Claudio 2");

        var venda = new Venda();

        venda.setCliente(cliente);

        venda.addItem(new ItemVenda(produto1));
        venda.addItem(new ItemVenda(produto2));

        System.out.println(venda.getItens());
    }
}