package org.example;

public class Carro extends Veiculo{

    @Override
    public void mover() {
        System.out.println("O carro esta se movendo");
    }

    @Override
    public void MostrarCor() {
        System.out.print("O carro é ");
        super.MostrarCor();
    }
}
