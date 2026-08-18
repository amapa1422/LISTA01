package org.example;

public class Gerente extends Funcionario{

    double salario = 5000;
    double desconto = 350;

    @Override
    public void CalcularSalario() {
        double liquido = salario - desconto;
        System.out.println("Salario Gerente R$" + liquido);
    }

    @Override
    public void Descansar() {
        System.out.print("O gerente ");
        super.Descansar();
    }
}
