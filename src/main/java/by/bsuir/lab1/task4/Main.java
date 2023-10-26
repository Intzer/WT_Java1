package main.java.by.bsuir.lab1.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        Resolver resolver = new Resolver(numbers);
        ArrayList<Integer> prime = resolver.getPrimeIndexes();
        for(int i = 0; i < prime.size(); i++) {
            System.out.println(prime.get(i));
        }
    }
}