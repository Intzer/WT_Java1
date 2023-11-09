package main.java.by.bsuir.lab1.task4;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ResolverTest {

    @Test
    public void testGetPrimeIndexes() {
        // Тестирование на обычных данных
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Resolver resolver1 = new Resolver(numbers1);
        ArrayList<Integer> expectedPrimes1 = new ArrayList<>();
        expectedPrimes1.add(1);  // index of 2
        expectedPrimes1.add(2);  // index of 3
        expectedPrimes1.add(4);  // index of 5
        expectedPrimes1.add(6);  // index of 7
        assertEquals(expectedPrimes1, resolver1.getPrimeIndexes());

        // Тестирование на пустом массиве
        int[] numbers2 = {};
        Resolver resolver2 = new Resolver(numbers2);
        ArrayList<Integer> expectedPrimes2 = new ArrayList<>();
        assertEquals(expectedPrimes2, resolver2.getPrimeIndexes());

        // Тестирование на массиве с одним отрицательным числом
        int[] numbers3 = {-1};
        Resolver resolver3 = new Resolver(numbers3);
        ArrayList<Integer> expectedPrimes3 = new ArrayList<>();
        assertEquals(expectedPrimes3, resolver3.getPrimeIndexes());
    }
}
