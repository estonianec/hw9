package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Evgeniy", "Popov");
        Author author2 = new Author("Svetlana", "Popova");
        Book book1 = new Book("War and peace", author1, 2021);
        Book book2 = new Book("Back to the future", author1, 2019);
        book2.setBookYear(1989);
        System.out.println(book2.toString());
    }
}
