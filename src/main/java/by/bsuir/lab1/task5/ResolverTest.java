package main.java.by.bsuir.lab1.task5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ResolverTest {

    @Test
    public void testFindMinToRemove() {
        // Тестирование на обычных данных
        int[] sequence1 = {4, 2, 3, 6, 10, 1, 12};
        assertEquals(2, Resolver.findMinToRemove(sequence1));

        // Тестирование на пустой последовательности
        int[] sequence2 = {};
        assertEquals(0, Resolver.findMinToRemove(sequence2));

        // Тестирование на последовательности из одного элемента
        int[] sequence3 = {5};
        assertEquals(0, Resolver.findMinToRemove(sequence3));
    }
}