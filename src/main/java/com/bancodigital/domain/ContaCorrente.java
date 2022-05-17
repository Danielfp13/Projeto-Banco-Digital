package com.bancodigital.domain;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.tipo = "corrente";
    }

    @Override
    public void imprimerExtrato() {
        System.out.println("=========Conta Corrente ==========");
        super.imprimirInformacoesDeContas();
    }
}