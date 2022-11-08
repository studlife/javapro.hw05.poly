package ua.hillel.javapro.hw05.poly.figure;

public interface Geometric {

    double area ();

    static double sumArea(Geometric... geometrics) {

        double sum = 0;

        for (Geometric g : geometrics){
            sum += g.area();
        }

        return sum;
    }

}
