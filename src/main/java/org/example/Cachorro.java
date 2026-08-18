package org.example;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void EmitirSom() {
        System.out.println("O "+nome+" esta latindo");
    }
}
