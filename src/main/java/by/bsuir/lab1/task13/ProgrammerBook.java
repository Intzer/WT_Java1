package main.java.by.bsuir.lab1.task13;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ProgrammerBook that = (ProgrammerBook) obj;
        return level == that.level &&
                Objects.equals(language, that.language);
    }

    // HashCode method
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    // ToString method
    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", language='" + language + '\'' +
                ", level=" + level +
                '}';
    }
}