package com.bancodigital.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Conta implements IConta{
    protected static final Integer AGENCIAPADRAO = 1;
    private static int SEQUENCIAL = 1;
    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private  Cliente cliente;

    protected String tipo;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIAPADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0;
        this.cliente = cliente;
    }
    @Override
    public void sacar(Double valor) {
        if (verificarSaldo(valor)) this.saldo -= valor;
        else System.out.println("Saldo insuficiente");
    }

    @Override
    public void tranferir(Conta contaDestino, Double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public boolean verificarSaldo(Double valor) {
        boolean temSaldo = valor <= this.saldo? true : false;
        return temSaldo;
    }

    protected void imprimirInformacoesDeContas() {
        System.out.println(String.format("Titular: %s" , this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d" , this.agencia));
        System.out.println(String.format("Número: %d" , this.numero));
        System.out.println(String.format("Saldo: %.2f" , this.saldo));
    }
}
