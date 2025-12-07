package ru.otus.java.basic.homeworks.homework7.gemini.access;

public class AccessValidator {
    private static final String API_KEY = "...";

    public static boolean validateKey(String key) {
        return API_KEY.equals(key);
    }

    public static String extractUserCode(String token) {
        String[] tokens = token.split(":");
        return tokens[1];
    }
}
