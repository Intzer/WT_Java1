package main.java.by.bsuir.lab1.task9;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Test
    public void testBasket() {
        Basket basket = new Basket();
        basket.addBall(new Ball(0.5, "red"));
        basket.addBall(new Ball(0.7, "blue"));
        basket.addBall(new Ball(0.6, "green"));

        assertEquals(1.8, basket.getTotalWeight(), 0.001);
        assertEquals(1, basket.getNumberOfBlueBalls());
    }
}
