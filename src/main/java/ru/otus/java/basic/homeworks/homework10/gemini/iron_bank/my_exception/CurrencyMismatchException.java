package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.my_exception;

public class CurrencyMismatchException extends Exception {
    public CurrencyMismatchException(String message) {
        super(message);
    }
}
