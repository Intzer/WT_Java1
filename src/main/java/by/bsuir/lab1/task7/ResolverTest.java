package main.java.by.bsuir.lab1.task7;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ResolverTest {

    @Test
    public void testBubbleSort() {
        double[] input1 = {5, 3, 7, 2, 8, 4};
        double[] expectedSortedArray1 = {2, 3, 4, 5, 7, 8};
        Resolver.bubbleSort(input1);
        assertArrayEquals(expectedSortedArray1, input1, 0.00001);

        double[] input2 = {9, 1, 5, 2, 4, 6};
        double[] expectedSortedArray2 = {1, 2, 4, 5, 6, 9};
        Resolver.bubbleSort(input2);
        assertArrayEquals(expectedSortedArray2, input2, 0.00001);
    }
}
