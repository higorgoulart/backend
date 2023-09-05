package com.satc.satcloja.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Fornecedor extends Pessoa {
    @Column(name = "cnpj", nullable = false)
    private String cnpj;

    @Column(name = "ie", nullable = false)
    private String ie;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.getCnpj();
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj='" + cnpj + '\'' +
                ", ie='" + ie + '\'' +
                "} " + super.toString();
    }
}
