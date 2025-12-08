package ru.otus.java.basic.homeworks.homework8.gemini.password_validator.service;

import ru.otus.java.basic.homeworks.homework8.gemini.password_validator.my_exception.NoDigitFoundException;
import ru.otus.java.basic.homeworks.homework8.gemini.password_validator.my_exception.PasswordValidationException;

public class SecurityService {
    public static boolean validatePassword(String password) throws PasswordValidationException {
        if (password.length() < 8) {
            throw new PasswordValidationException("Недостаточная длина пароля");
        }

        char[] passwords = password.toCharArray();
        int count = 0;
        for (int i = 0; i < passwords.length; i++) {
            if (Character.isDigit(passwords[i])) {
                count++;
            }
        }

        if (count == 0) {
            throw new NoDigitFoundException("В пароле нету цифр");
        }
        
        return true;
    }
}
