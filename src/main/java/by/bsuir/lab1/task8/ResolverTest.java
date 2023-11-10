package main.java.by.bsuir.lab1.task8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ResolverTest {

    @Test
    public void testGetIndexes() {
        double[] arr1 = {1, 2, 3, 4, 5, 6};
        double[] arr2 = {0, 4, 6, 8, 9, 10};
        int[] expectedIndexes = {0, 4, 5, 5, 5, 5};

        assertArrayEquals(expectedIndexes, Resolver.getIndexes(arr1, arr2));
    }
}
