package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.my_exception;

public class ClientExistsException extends RuntimeException {
    public ClientExistsException(String message) {
        super(message);
    }
}
