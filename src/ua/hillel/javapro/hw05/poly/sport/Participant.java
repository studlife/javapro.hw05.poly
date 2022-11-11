package ua.hillel.javapro.hw05.poly.sport;

public abstract class Participant {

    protected String name;
    protected int length;
    protected int width;
    private boolean status = true;

    public Participant(String name) {
        this.name = name;
    }

    public abstract void run();
    public abstract void jump();


    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}





