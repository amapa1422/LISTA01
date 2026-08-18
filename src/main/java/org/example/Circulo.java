package org.example;

public class Circulo extends FormaGeometrica{

    double raio = 5;

    @Override
    public void CalcularArea() {
        double area = 3.14 * raio*raio;
        System.out.println("Area " + area);
    }

    @Override
    public void CalcularPerimetro() {
        double perimetro = 2 * 3.14 * raio;
        System.out.println("Perimetro " + perimetro);
    }
}
