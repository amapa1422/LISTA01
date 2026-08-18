package org.example;

public class Main {

    public static void p(String texto){
        System.out.println();
    }

    public static void l(String texto){
        System.out.println("*------------------------------------*");
    }

     static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.mover();
        moto.mover();
        l("");
        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();

        piano.tocar();
        guitarra.tocar();
        l("");

        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();

        System.out.println("CIRUCULO ");
        circulo.CalcularArea ();
        circulo.CalcularPerimetro();
        p("");
        System.out.println("RETANGULO");
        retangulo.CalcularArea();
        retangulo.CalcularPerimetro();
        l("");

        Estagiario estagiario = new Estagiario();
        Gerente gerente = new Gerente();

        estagiario.CalcularSalario();
        gerente.CalcularSalario();
        l("");

        Gato gato = new Gato("Alfredo");
        Cachorro cachorro = new Cachorro("Moisés");

        gato.EmitirSom();
        cachorro.EmitirSom();
        l("");

        estagiario.Descansar();
        gerente.Descansar();
        l("");

        moto.MostrarCor();
        carro.MostrarCor();
        l("");

        Deposito deposito = new Deposito();
        Saque saque = new Saque();

        deposito.RealizarTransacao();
        saque.RealizarTransacao();
        l("");

        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();

        guerreiro.Atacar();
        mago.Atacar();
    }
}
