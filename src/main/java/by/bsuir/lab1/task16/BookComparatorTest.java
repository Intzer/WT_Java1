package main.java.by.bsuir.lab1.task16;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookComparatorTest {

    @Test
    public void testSortingByTitle() {
        Book book1 = new Book("Title3", "Author3", 20, "ISBN333");
        Book book2 = new Book("Title1", "Author1", 25, "ISBN111");
        Book book3 = new Book("Title2", "Author2", 30, "ISBN222");

        List<Book> books = Arrays.asList(book1, book2, book3);
        Collections.sort(books, Book.titleComparator);

        // Check if the books are sorted by title
        assertEquals(book2, books.get(0));
        assertEquals(book3, books.get(1));
        assertEquals(book1, books.get(2));
    }
}
