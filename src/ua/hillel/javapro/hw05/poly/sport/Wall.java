package ua.hillel.javapro.hw05.poly.sport;

public class Wall implements Obstacle {

    @Override
    public void overcome(Participant part) {
        System.out.println(part.getName() + " перестрибнув стіну.");
    }
}
