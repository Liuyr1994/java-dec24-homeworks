package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.my_exception;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
