package main.java.by.bsuir.lab1.task13;

import java.util.Objects;

public class Book {
    protected String title;
    protected String author;
    protected int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book otherBook = (Book) obj;
        return price == otherBook.price &&
                Objects.equals(title, otherBook.title) &&
                Objects.equals(author, otherBook.author);
    }

    // HashCode method
    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    // ToString method
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
