package main.java.by.bsuir.lab1.task15;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testSortingByIsbn() {
        Book book1 = new Book("Title1", "Author1", 25, "ISBN111");
        Book book2 = new Book("Title2", "Author2", 30, "ISBN222");
        Book book3 = new Book("Title3", "Author3", 20, "ISBN333");

        List<Book> books = Arrays.asList(book3, book1, book2);
        books.sort(null); // Uses compareTo() for sorting

        // Check if the books are sorted by isbn
        assertEquals(book1, books.get(0));
        assertEquals(book2, books.get(1));
        assertEquals(book3, books.get(2));
    }
}
