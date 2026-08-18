package org.example;

public class Moto extends Veiculo{

    @Override
    public void mover() {
        System.out.println("A moto esta se movendo");
    }

    @Override
    public void MostrarCor() {
        System.out.print("A moto é ");
        super.MostrarCor();
    }
}
