package main.java.by.bsuir.lab1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();

        Resolver resolver = new Resolver();
        resolver.setRectangle(-4, 0, 4, 5);
        boolean res1 = resolver.Solve(x, y);
        resolver.setRectangle(-6, -3, 6, 0);
        boolean res2 = resolver.Solve(x, y);

        System.out.println("Result: " + (res1 || res2));
    }
}