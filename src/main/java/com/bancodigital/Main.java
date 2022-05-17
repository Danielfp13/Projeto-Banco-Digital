package com.bancodigital;

import com.bancodigital.domain.*;

public class Main {
    public static void main(String[] args) {

        Banco banco = Banco.getInstance();

        Cliente cli1 = new Cliente( "Maria");

        Cliente cli2 = new Cliente( "João");
        Conta cc = new ContaCorrente(cli1);
        banco.adicionarConta(cc);
        Conta cp = new ContaPoupanca(cli1);
        banco.adicionarConta(cp);
        Conta cc2 = new ContaCorrente(cli2);
        banco.adicionarConta(cc2);
        cc.depositar(123.65);
        cc.imprimerExtrato();
        cp.imprimerExtrato();
        cc2.imprimerExtrato();
        cc.tranferir(cc2,50.0);
        cc.imprimerExtrato();
        cp.imprimerExtrato();
        cc2.imprimerExtrato();
        banco.listarDonosDeContas();

    }
}