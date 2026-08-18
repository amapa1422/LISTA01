package org.example;

public abstract class Animal {
    public abstract void EmitirSom();

    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
