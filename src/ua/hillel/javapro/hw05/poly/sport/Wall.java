package ua.hillel.javapro.hw05.poly.sport;

public class Wall implements Obstacle {

    private int width = 0;

    public Wall() {}  // Залишаемо цей конструктор для завдання без *

    public Wall(int width) {
        this.width = width;
    }



    @Override
    public void overcome(Participant part) {
        System.out.println(part.getName() + " перестрибнув стіну.");
    }


    @Override
    public void newOvercome(Participant part) {
        if (part.getWidth() < width) {
            System.out.println("Учасник " + part.getName() + " не перестрибнув перешкоду Стіна на висоті " + width + ". " +
                    "Підпригнув на " + part.getWidth());
            part.setStatus(false);
        } else {
            System.out.println("Учасник " + part.getName() + " перестрибнув перешкоду Стіна на висоті " + part.getWidth());
        }
    }
}
