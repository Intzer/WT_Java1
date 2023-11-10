package main.java.by.bsuir.lab1.task10;

public class BasketTest {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(0.5, "red"));
        basket.addBall(new Ball(0.7, "blue"));
        basket.addBall(new Ball(0.6, "green"));

        System.out.println("Total weight of the basket: " + basket.getTotalWeight());
        System.out.println("Number of blue balls in the basket: " + basket.getNumberOfBlueBalls());
    }
}
