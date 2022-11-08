package ua.hillel.javapro.hw05.poly.figure;

public class Circle implements Geometric {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {

        return 3.14 * (radius * radius);
    }
}
