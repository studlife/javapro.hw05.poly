package ua.hillel.javapro.hw05.poly.figure;

public class Triangle implements Geometric {

    private double sideA;
    private double sideB;
    private double sideC;

    private Triangle(double sideA, double sideB, double sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static Triangle getInstance(double sideA, double sideB, double sideC) {
        if(sideA >= (sideB + sideC) || sideB >= (sideA + sideC) || sideC >= (sideA + sideB)) {
            System.out.println("Трикутник з такими параметрами не може існувати!");
            return null;
        } else if (!(sideA > 0) || !(sideB > 0) || !(sideC > 0)) {
            System.out.println("Сторона не можу буту рівна 0, або бути негативною");
            return null;
        }
        return new Triangle(sideA, sideB, sideC);
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }



    @Override
    public double area() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideA) * (p - sideC)) ;
    }
}
