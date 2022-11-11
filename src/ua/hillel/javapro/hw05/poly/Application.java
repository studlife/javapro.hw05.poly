package ua.hillel.javapro.hw05.poly;

import ua.hillel.javapro.hw05.poly.figure.*;
import ua.hillel.javapro.hw05.poly.sport.*;


public class Application {

    public static void main(String[] args) {

        // Перша частина завдання
        System.out.println(" - - - - - 1.1 part  - - - - - - ");

        Circle figure1 = new Circle(2.5);
        Square figure2 = new Square(2, 2);
        Triangle figure3 = Triangle.getInstance(6, 4, 8);

        System.out.println(figure1.area());
        System.out.println(figure2.area());
        System.out.println(figure3.area());

        System.out.println(Geometric.sumArea(figure1, figure2, figure3) + " - сума площ всіх фігур");


        System.out.println(" - - - - - 1.2 part  - - - - - - ");

        Geometric figure4 = new Circle(5);
        Geometric figure5 = new Square(5.5, 5.5);
        Geometric figure6 = Triangle.getInstance(2, 3, 4);

        Geometric[] array = {figure4, figure5, figure6};

        System.out.println(Geometric.sumArea(array) + " - сума площ всіх фігур");


        // Друга частина завдання
        System.out.println(" - - - - - 2.1 part  - - - - - - ");

        Participant part1 = new Human("Oleg");
        Participant part2 = new Cat("Barsik");
        Participant part3 = new Robot("C3PO");

        part1.run();
        part1.jump();
        part2.run();
        part2.jump();
        part3.run();
        part3.jump();

        Participant[] partArray = {part1, part2, part3};



        System.out.println(" - - - - - 2.2 part  - - - - - - ");

        Obstacle obstacle1 = new Racetrack();
        Obstacle obstacle2 = new Wall();

        obstacle1.overcome(part1);
        obstacle1.overcome(part2);
        obstacle2.overcome(part1);
        obstacle2.overcome(part2);

        Obstacle[] obstacleArray = {obstacle1, obstacle2};



        System.out.println(" - - - - - 2.3 part  - - - - - - ");

        for (Obstacle o : obstacleArray) {
            for (Participant p : partArray) {
                o.overcome(p);
            }
        }


        System.out.println(" - - - - - 2 * part  - - - - - - ");


        Participant[] particArray = {
                new Human("Vova", 300, 2),
                new Cat("Murka", 400, 1),
                new Robot("Wall-e", 100, 3)
        };
        Obstacle[] obstArray = {new Racetrack(200), new Wall(2)};



        for (Obstacle o : obstArray) {
            for (Participant p : particArray) {
                if(p.isStatus()) o.newOvercome(p);
            }
        }

    }
}
