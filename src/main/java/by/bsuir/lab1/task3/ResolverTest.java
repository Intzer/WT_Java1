package main.java.by.bsuir.lab1.task3;
import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class ResolverTest {

    @Test
    public void testSolve() {
        // Тестирование на обычных данных
        double a1 = 0.0;
        double b1 = 0.2;
        double h1 = 0.1;
        Resolver resolver1 = new Resolver(a1, b1, h1);

        HashMap<Double, Double> expectedTable1 = new HashMap<>();
        expectedTable1.put(0.0, 0.0);
        expectedTable1.put(0.1, 0.10033467208545055);
        expectedTable1.put(0.2, 0.2027100355086725);
        assertEquals(expectedTable1, resolver1.solve());

        // Тестирование на других значениях a, b, h
        double a2 = 0.0;
        double b2 = 0.1;
        double h2 = 0.05;
        Resolver resolver2 = new Resolver(a2, b2, h2);

        HashMap<Double, Double> expectedTable2 = new HashMap<>();
        expectedTable2.put(0.0, 0.0);
        expectedTable2.put(0.05, 0.05004170837553879);
        expectedTable2.put(0.1, 0.10033467208545055);
        assertEquals(expectedTable2, resolver2.solve());
    }
}
