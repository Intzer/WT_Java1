package main.java.by.bsuir.lab1.task16;

import java.util.Comparator;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }

    // Comparator for sorting by title
    public static Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);

    // Comparator for sorting by title and then author
    public static Comparator<Book> titleAuthorComparator = Comparator
            .comparing(Book::getTitle)
            .thenComparing(Book::getAuthor);

    // Comparator for sorting by author and then title
    public static Comparator<Book> authorTitleComparator = Comparator
            .comparing(Book::getAuthor)
            .thenComparing(Book::getTitle);

    // Comparator for sorting by author, title, and price
    public static Comparator<Book> authorTitlePriceComparator = Comparator
            .comparing(Book::getAuthor)
            .thenComparing(Book::getTitle)
            .thenComparingInt(Book::getPrice);

    // Override toString() for better representation
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
