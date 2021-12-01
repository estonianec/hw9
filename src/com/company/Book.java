package com.company;

public class Book {
    private final String bookName;
    private final Author author;
    private int bookYear;

    public Book(String bookName, Author author, int bookYear) {
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }

    public int getBookYear() {
        return bookYear;
    }

    public Author getAuthor() { return author;}

    public String getAuthorFullName() {
        return author.getAuthorFirstName() + " " + author.getAuthorLastName();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", bookYear=" + bookYear +
                '}';
    }
}

