package main.java.by.bsuir.lab1.task1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ResolverTest {

    private static final double DELTA = 0.00001; // Допустимая погрешность

    @Test
    public void testSolve() {
        // Тестирование с конкретными значениями
        Resolver resolver1 = new Resolver(1.0, 2.0);
        assertEquals(1.3922749448749296, resolver1.solve(), DELTA);

        Resolver resolver2 = new Resolver(0.0, 0.0);
        assertEquals(0.5, resolver2.solve(), DELTA);
    }
}
