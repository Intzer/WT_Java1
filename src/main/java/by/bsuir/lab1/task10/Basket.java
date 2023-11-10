package main.java.by.bsuir.lab1.task10;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls = new ArrayList<>();

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    public int getNumberOfBlueBalls() {
        int numberOfBlue = 0;
        for (Ball ball : balls) {
            if ("blue".equalsIgnoreCase(ball.getColor())) {
                numberOfBlue++;
            }
        }
        return numberOfBlue;
    }
}