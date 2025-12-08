package ru.otus.java.basic.homeworks.homework8.otus.arrayexceptions.my_exception;

public class AppArraySizeException extends RuntimeException {
    public AppArraySizeException(String message) {
        super(message);
    }
}
