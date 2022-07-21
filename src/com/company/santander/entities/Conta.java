package com.company.santander.entities;

import com.company.santander.Interfaces.IConta;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    protected int numeroConta;
    protected Integer agencia;
    protected String contaPopanca;
    protected String contaCorrente;
    protected Double saldo;

    @Override
    public void sacar(double valor) {
      saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void informacoesExtrato() {
        System.out.println("========== Extrato Para Conta Corrente =================");
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numeroConta));
        System.out.println(String.format("Saldo: %.2f",this.saldo));

        System.out.println("========== Extrato Para Conta Popanca =================");
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numeroConta));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }


    public Conta(int numeroConta, Integer agencia, String contaPopanca, String contaCorrente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.contaPopanca = contaPopanca;
        this.contaCorrente = contaCorrente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public String getContaPopanca() {
        return contaPopanca;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }



}
