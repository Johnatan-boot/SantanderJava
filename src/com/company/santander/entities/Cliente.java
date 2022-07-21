package com.company.santander.entities;

public class Cliente {

    private String  nome;
    private String   cpf;
    private String  dataNascimento;
    private String  telefone;
    private String  email;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String dataNascimento, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }
}
