package main.java.by.bsuir.lab1.task2;

public class Resolver {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public void setRectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean solve(int x, int y) {
        return x >= this.x1 && x <= this.x2 && y >= this.y1 && y <= this.y2;
    }
}
