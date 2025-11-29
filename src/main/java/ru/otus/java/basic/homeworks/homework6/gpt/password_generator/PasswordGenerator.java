package ru.otus.java.basic.homeworks.homework6.gpt.password_generator;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!#$%&'()*+,-./:;<=>?@";

    private static final String ALL = LOWER + UPPER + DIGITS + SPECIAL;

    private final SecureRandom random = new SecureRandom();

    private char randomChar(String source) {
        return source.charAt(random.nextInt((source.length())));
    }

    public String generate(int length) {
        if (length < 10) {
            throw new IllegalArgumentException("Пароль должен быть минимум 10 символа");
        }

        StringBuilder sb = new StringBuilder();

        sb.append(randomChar(LOWER));
        sb.append(randomChar(UPPER));
        sb.append(randomChar(DIGITS));
        sb.append(randomChar(SPECIAL));
        for (int i = 4; i < length; i++) {
            sb.append(randomChar(ALL));
        }

        return shuffle(sb.toString());
    }

    private String shuffle(String input) {
        char[] array = input.toCharArray();

        for (int i = array.length - 1; i > 0; i++) {
            int j = random.nextInt(i + 1);
            char tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        return new String(array);
    }

    public boolean checkStrength(String password) {
        if (password == null || password.isBlank() || password.length() < 10) {
            return false;
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDidit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (LOWER.indexOf(c) >= 0) hasLower = true;
            else if (UPPER.indexOf(c) >= 0) hasUpper = true;
            else if (DIGITS.indexOf(c) >= 0) hasDidit = true;
            else if (SPECIAL.indexOf(c) >= 0) hasSpecial = true;
        }

        return hasLower && hasUpper && hasDidit && hasSpecial;
    }
}