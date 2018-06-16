package com.example.agromax.com.example.agromax.model;

public class Pessoa {
    int idServer;
    int id;
    int cpf;
    String nome;
    String email;
    int telefone;
    String data;

    public Pessoa(){

    }

    public Pessoa(int _idServer, int _id, int _cpf, String _nome, String _email, int _telefone, String _data){
        this.idServer = _idServer;
        this.id = _id;
        this.cpf = _cpf;
        this.nome = _nome;
        this.email = _email;
        this.telefone = _telefone;
        this.data = _data;

    }
}
