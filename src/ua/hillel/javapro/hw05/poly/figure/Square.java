package ua.hillel.javapro.hw05.poly.figure;

public class Square implements Geometric{

    private double sideA;
    private double sideB;

    public Square(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double area() {

        return sideA * sideB;
    }
}
