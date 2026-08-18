package org.example;

public class Estagiario extends Funcionario{

    double salario = 1200;
    double descontos = 245;

    @Override
    public void CalcularSalario() {
        double liquido = salario - descontos;
        System.out.println("Salario estagiario R$" + liquido);
    }

    @Override
    public void Descansar() {
        System.out.print("O estagiario ");
        super.Descansar();
    }
}
