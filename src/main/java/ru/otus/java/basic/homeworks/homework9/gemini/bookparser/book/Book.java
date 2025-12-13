package ru.otus.java.basic.homeworks.homework9.gemini.bookparser.book;

public class Book {
    private final String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
