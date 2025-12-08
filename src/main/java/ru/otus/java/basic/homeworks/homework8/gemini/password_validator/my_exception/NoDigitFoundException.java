package ru.otus.java.basic.homeworks.homework8.gemini.password_validator.my_exception;

public class NoDigitFoundException extends PasswordValidationException {
    public NoDigitFoundException(String message) {
        super(message);
    }
}
