package ua.hillel.javapro.hw05.poly.sport;

public class Cat extends Participant{

    public Cat(String name) {
        super(name);
    }
    public Cat(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
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
