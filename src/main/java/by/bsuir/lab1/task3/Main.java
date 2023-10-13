package main.java.by.bsuir.lab1.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        System.out.print("Input h: ");
        double h = in.nextDouble();

        Resolver resolver = new Resolver(a, b, h);
        HashMap<Double, Double> table = resolver.solve();

        List<Double> sortedKeys = new ArrayList<>(table.keySet());
        Collections.sort(sortedKeys);

        double temp = 0;
        for (int i = 0; i < sortedKeys.size(); i++) {
            temp = sortedKeys.get(i);
            System.out.println("X: " + String.format("%.3f", temp) + "| F(X): " + String.format("%.3f", table.get(temp)));
        }
    }
}