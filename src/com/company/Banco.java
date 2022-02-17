package com.company;

public class Banco {

    protected String nomeBanco;
    protected String endereco;

    public String getNomeBanco() {
       return nomeBanco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
