package com.bancodigital.domain;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.tipo = "poupan�a";
    }

    @Override
    public void imprimerExtrato() {
        System.out.println("=========Conta Poupan�a==========");
        super.imprimirInformacoesDeContas();
    }

}
