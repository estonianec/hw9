package hw10;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private int bookYear;

    public Book(String bookName, String authorName, int bookYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookYear = bookYear;
    }

    public int getBookYear() {
        return bookYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear && bookName.equals(book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, bookYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookYear=" + bookYear +
                '}';
    }
}

