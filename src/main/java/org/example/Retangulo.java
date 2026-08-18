package org.example;

public class Retangulo extends FormaGeometrica{

    double base = 5;
    double altura = 3;

    @Override
    public void CalcularArea() {
        double area = base * altura;
        System.out.println("Area " + area);
    }

    @Override
    public void CalcularPerimetro() {
        double perimetro = 2 * (base * altura);
        System.out.println("Perimetro " + perimetro);
    }
}
