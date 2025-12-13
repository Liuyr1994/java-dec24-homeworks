package ru.otus.java.basic.homeworks.homework9.gemini.usersession.my_exception;

public class EmptyHistoryException extends RuntimeException {
    public EmptyHistoryException(String message) {
        super(message);
    }
}
