package main.java.by.bsuir.lab1.task12;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 20);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 25);

        // Testing equals method
        System.out.println("Equality Check: " + book1.equals(book2));

        // Testing hashCode method
        System.out.println("HashCode for book1: " + book1.hashCode());
        System.out.println("HashCode for book2: " + book2.hashCode());

        // Testing toString method
        System.out.println("String Representation of book1: " + book1.toString());
        System.out.println("String Representation of book2: " + book2.toString());
    }
}