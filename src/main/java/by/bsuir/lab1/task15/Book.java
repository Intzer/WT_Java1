package main.java.by.bsuir.lab1.task15;

public class Book implements Comparable<Book> {
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

    // Comparable implementation based on isbn
    @Override
    public int compareTo(Book other) {
        return this.isbn.compareTo(other.isbn);
    }

    // Equals, hashCode, and toString methods...

    // For simplicity, let's assume that equals, hashCode, and toString methods are also overridden.
}
