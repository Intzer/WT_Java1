package main.java.by.bsuir.lab1.task6;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ResolverTest {

    @Test
    public void testGenerateMatrix() {
        double[] input1 = {1, 2, 3, 4, 5};
        double[][] expectedMatrix1 = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}
        };
        assertArrayEquals(expectedMatrix1, Resolver.generateMatrix(input1));

        double[] input2 = {0.5, 1.5, 2.5};
        double[][] expectedMatrix2 = {
                {0.5, 1.5, 2.5},
                {1.5, 2.5, 0.5},
                {2.5, 0.5, 1.5}
        };
        assertArrayEquals(expectedMatrix2, Resolver.generateMatrix(input2));
    }
}
