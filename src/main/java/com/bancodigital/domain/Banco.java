package com.bancodigital.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Banco {

    private static Banco minhaInstancia;
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    private Banco(){
        this.nome = "Banco Digital";
    }

    public static Banco getInstance() {
        if( minhaInstancia == null ) {
            minhaInstancia = new Banco();
        }
        return minhaInstancia;
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public void listarDonosDeContas(){
        System.out.println("============ Lista de Clientes ========== ");
        System.out.println();
        for ( Conta x : contas){
            System.out.println(" Titular: " +x.getCliente().getNome() + " Tipo de Conta: " + x.getTipo() );
        }
    }

}
