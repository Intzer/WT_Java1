package main.java.by.bsuir.lab1.task4;

import java.util.ArrayList;

public class Resolver {

    public int[] numbers;

    public Resolver(int[] numbers)
    {
        this.numbers = numbers;
    }

    public ArrayList<Integer> getPrimeIndexes() {
        ArrayList<Integer> prime = new ArrayList<Integer>();

        for (int i = 0; i < this.numbers.length; i++)
        {
            if (this.numbers[i] <= 1)
                continue;

            boolean isPrime = true;
            for (int j = 2; j < this.numbers[i]; j++)
            {
                if (this.numbers[i] % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                prime.add(i);
        }

        return prime;
    }
}
