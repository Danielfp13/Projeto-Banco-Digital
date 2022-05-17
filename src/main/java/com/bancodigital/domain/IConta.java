package com.bancodigital.domain;

public interface IConta {

    void sacar (Double valor);
    void tranferir(Conta contaDestino, Double valor);
    void depositar (Double valor);

    boolean verificarSaldo(Double valor);

    void imprimerExtrato();

}
