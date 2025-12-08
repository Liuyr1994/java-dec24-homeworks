package ru.otus.java.basic.homeworks.homework8.gemini.password_validator;

import ru.otus.java.basic.homeworks.homework8.gemini.password_validator.my_exception.NoDigitFoundException;
import ru.otus.java.basic.homeworks.homework8.gemini.password_validator.my_exception.PasswordValidationException;
import ru.otus.java.basic.homeworks.homework8.gemini.password_validator.service.SecurityService;

public class MainApplication {
    public static void main(String[] args) {
        try {
            SecurityService.validatePassword("sdgertqwesd1234");
        } catch (NoDigitFoundException e) {
            System.out.println(e);
        } catch (PasswordValidationException e) {
            System.out.println(e);
        }
    }
}
