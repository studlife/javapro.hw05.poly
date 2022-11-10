package ua.hillel.javapro.hw05.poly.sport;

public abstract class Participant {

    protected String name;

    public Participant(String name) {
        this.name = name;
    }

    public abstract void run();
    public abstract void jump();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}





