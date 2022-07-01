package com.example.exemplo.controller;

public class User {
    private String id;
    private String nome;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public User() {}

    public User(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}