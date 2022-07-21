package com.company.santander;

import com.company.santander.entities.Conta;
import com.company.santander.entities.ContaCorrente;
import com.company.santander.entities.ContaPopanca;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        //cc.depositar(100);

        Conta cp = new ContaPopanca();

       cc.imprimirExtrato();
       cp.imprimirExtrato();

    }
}
