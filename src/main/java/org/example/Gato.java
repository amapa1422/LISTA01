package org.example;

public class Gato extends Animal{

    public Gato (String nome) {
        super(nome);
    }

    @Override
    public void EmitirSom() {
        System.out.println("O " + nome +" esta miando");
    }
}
