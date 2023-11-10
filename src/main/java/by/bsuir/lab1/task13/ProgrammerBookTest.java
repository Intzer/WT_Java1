package main.java.by.bsuir.lab1.task13;

public class ProgrammerBookTest {
    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook("Clean Code", "Robert C. Martin", 30, "Java", 2);
        ProgrammerBook book2 = new ProgrammerBook("Code Complete", "Steve McConnell", 35, "C++", 3);
        ProgrammerBook book3 = new ProgrammerBook("Clean Code", "Robert C. Martin", 30, "Java", 2);

        // Testing equals method
        System.out.println("Equality Check (book1 and book2): " + book1.equals(book2));
        System.out.println("Equality Check (book1 and book3): " + book1.equals(book3));

        // Testing hashCode method
        System.out.println("HashCode for book1: " + book1.hashCode());
        System.out.println("HashCode for book2: " + book2.hashCode());
        System.out.println("HashCode for book3: " + book3.hashCode());

        // Testing toString method
        System.out.println("String Representation of book1: " + book1.toString());
        System.out.println("String Representation of book2: " + book2.toString());
        System.out.println("String Representation of book3: " + book3.toString());
    }
}
