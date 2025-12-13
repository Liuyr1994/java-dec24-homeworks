package ru.otus.java.basic.homeworks.homework9.gemini.bookparser.parser;

import ru.otus.java.basic.homeworks.homework9.gemini.bookparser.book.Book;
import ru.otus.java.basic.homeworks.homework9.gemini.bookparser.my_exception.BookParseException;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void parseAndAdd(String rawData) throws BookParseException {
        String[] booking = rawData.split("\\|");

        if (booking.length != 2) {
            throw new BookParseException("Неверно переданая строка");
        }

        double price;

        try {
            price = Double.parseDouble(booking[1]);
        } catch (NumberFormatException e) {
            throw new BookParseException("Неккоректная цена");
        }

        books.add(new Book(booking[0], price));
    }
}
