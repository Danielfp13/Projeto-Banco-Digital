package com.bancodigital.domain;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.tipo = "poupança";
    }

    @Override
    public void imprimerExtrato() {
        System.out.println("=========Conta Poupança==========");
        super.imprimirInformacoesDeContas();
    }

}
