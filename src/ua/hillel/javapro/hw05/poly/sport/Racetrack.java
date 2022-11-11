package ua.hillel.javapro.hw05.poly.sport;

public class Racetrack implements Obstacle {

    private int length;

    public Racetrack() {}   // Залишаемо цей конструктор для завдання без *

    public Racetrack(int length) {
        this.length = length;
    }



    @Override
    public void overcome(Participant part) {
        System.out.println(part.getName() + " пробіг бігову доріжку.");
    }

    @Override
    public void newOvercome(Participant part) {
        if (part.getLength() < length) {
            System.out.println("Учасник " + part.getName() + " не пройшов перешкоду «Бігова доріжка» її відстань " + length + ". " +
                    "Пройдено " + part.getLength());
            part.setStatus(false);
        } else {
            System.out.println("Учасник " + part.getName() + " пройшов перешкоду «Бігова доріжка» на дистанції " + part.getLength());
        }
    }
}
