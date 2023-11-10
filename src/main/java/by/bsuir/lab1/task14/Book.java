package main.java.by.bsuir.lab1.task14;

import java.util.Objects;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    // Clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
