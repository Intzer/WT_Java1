package main.java.by.bsuir.lab1.task3;
import java.util.*;

public class Resolver {
    private double a;
    private double b;
    private double h;

    public Resolver(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public HashMap<Double, Double> solve() {
        HashMap<Double, Double> table = new HashMap<>();

        double i = this.a;
        while (i <= this.b)
        {
            table.put(i, Math.tan(i));
            i += this.h;
        }

        return table;
    }
}
