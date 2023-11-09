package main.java.by.bsuir.lab1.task2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ResolverTest {

    @Test
    public void testSolve() {
        Resolver resolver = new Resolver();

        // Установка прямоугольника с координатами (1, 1) - (3, 3)
        resolver.setRectangle(1, 1, 3, 3);

        // Тестирование точек внутри прямоугольника
        assertTrue(resolver.solve(2, 2));
        assertTrue(resolver.solve(1, 1));
        assertTrue(resolver.solve(3, 3));

        // Тестирование точек вне прямоугольника
        assertFalse(resolver.solve(0, 0));
        assertFalse(resolver.solve(4, 4));
        assertFalse(resolver.solve(2, 4));
        assertFalse(resolver.solve(4, 2));
    }
}
