package main.java.by.bsuir.lab1.task14;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testClone() {
        try {
            Book originalBook = new Book("Title", "Author", 25);
            Book clonedBook = (Book) originalBook.clone();

            // Check if the objects are not the same instance
            assertNotSame(originalBook, clonedBook);

            // Check if the fields are equal
            assertEquals(originalBook.getTitle(), clonedBook.getTitle());
            assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
            assertEquals(originalBook.getPrice(), clonedBook.getPrice());

        } catch (CloneNotSupportedException e) {
            fail("Cloning should be supported");
        }
    }
}
