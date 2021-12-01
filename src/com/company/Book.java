package com.company;

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
}

