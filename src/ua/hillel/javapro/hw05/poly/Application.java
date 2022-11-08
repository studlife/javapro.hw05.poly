package ua.hillel.javapro.hw05.poly;

import ua.hillel.javapro.hw05.poly.figure.Circle;
import ua.hillel.javapro.hw05.poly.figure.Geometric;
import ua.hillel.javapro.hw05.poly.figure.Square;
import ua.hillel.javapro.hw05.poly.figure.Triangle;

public class Application {

    public static void main(String[] args) {

        Circle figure1 = new Circle(2.5);
        Square figure2 = new Square(2, 2);
        Triangle figure3 = new Triangle(6, 4, 8);

        System.out.println(figure1.area());
        System.out.println(figure2.area());
        System.out.println(figure3.area());

        System.out.println(Geometric.sumArea(figure1, figure2, figure3));


        Geometric figure4 = new Circle(5);
        Geometric figure5 = new Square(5.5, 5.5);
        Geometric figure6 = new Triangle(2, 3, 4);

        Geometric[] array = {figure4, figure5, figure6};

        System.out.println(Geometric.sumArea(array));

    }


}
