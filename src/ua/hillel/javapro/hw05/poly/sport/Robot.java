package ua.hillel.javapro.hw05.poly.sport;

public class Robot extends Participant {

    public Robot(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " біжить.");
    }

    @Override
    public void jump() {
        System.out.println(name + " стрибає.");
    }
}
