package com.company.santander.entities;

public class Banco {
    /*Porque usar Orientacao a OBJETOS?
    Programacao Estruturada foca em funcoes Operações e dados
    Paradigma Orientado a Objetos Modelagem de entidades e nas Interacoes entre elas
    Vantagens:
    Melor Coesao
    Melhor Acoplamento
    Diminuição do Gap Semantico
    Coletor de Lixo

    POO É UM PARADIGMA DE ANALISE PROJETO E PROGRAMACAO DE SISTEMAS DE
    SOFTWARES BASEADO NA COMPOSICAO DE INTERACAO ENTRE DIVERSAS unidades de
    software, chamado de objetos.


    Abstração
    Processo em que se Isolam Caracteristicas de um Objeto,
    considerando que os que tenham em comum certos Grupos de
    Objetos
    Encapsulamento
    Capacidade de Esconder Complexidades e Proteger dados.
    * */
    private String  nome;
    private String   cnpj;

    public Banco() {
    }

    public Banco(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }


    //Metodos

    public static  void sacar(){

    }

    public static  void depositar(){

    }

    public static  void EmitirExtrato(){

    }



}
