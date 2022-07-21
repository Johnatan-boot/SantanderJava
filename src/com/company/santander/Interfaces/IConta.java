package com.company.santander.Interfaces;

import com.company.santander.entities.Conta;

public interface IConta {

       void sacar(double valor);
       void depositar(double valor);
       void  transferir(double valor, Conta contaDestino);
       void imprimirExtrato();
}
