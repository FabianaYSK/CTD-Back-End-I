package br.com.dh.aula22.entities;

public class Trainer {

    private String nome;

    public Trainer() {
    }

    public Trainer(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}