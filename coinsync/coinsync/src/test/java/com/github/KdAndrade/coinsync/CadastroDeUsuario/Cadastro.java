package com.github.KdAndrade.coinsync.CadastroDeUsuario;

public class Cadastro {

    private String nome;
    private String email;

    public Cadastro(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
