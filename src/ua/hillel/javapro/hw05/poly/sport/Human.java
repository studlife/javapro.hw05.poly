package ua.hillel.javapro.hw05.poly.sport;

public class Human extends Participant{


    public Human(String name) {
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
