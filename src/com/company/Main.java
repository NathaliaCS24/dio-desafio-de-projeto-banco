package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Banco nomeBanco = new Banco();
        nomeBanco.setNome("FLUBANK");
        System.out.println(nomeBanco.getNomeBanco());

        Banco endereco = new Banco();
        endereco.setEndereco("Av das Galáxias, 666, Espaço Sideral - Universo");
        System.out.println(endereco.getEndereco());
        System.out.println(" ");


        Cliente nome = new Cliente();
        nome.setNome("Maria da Silva");
        System.out.print("Nome do Cliente: ");
        System.out.println(nome.getNome());

        Cliente cpf = new Cliente();
        cpf.setCpf("050.665.584-87");
        System.out.print("CPF: ");
        System.out.println(cpf.getCpf());
        System.out.println(" ");


        Conta cc = new ContaCorrente();
        cc.depositar(450);

        Conta cp = new ContaPoupanca();
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        System.out.println(" ");

        cp.imprimirExtrato();





    }

}
