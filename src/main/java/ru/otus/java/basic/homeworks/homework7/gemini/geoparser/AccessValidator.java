package ru.otus.java.basic.homeworks.homework7.gemini.geoparser;

public class AccessValidator {
    private static final String API_KEY = "XYZ123";

    public static boolean validateKey(String key) {
        return API_KEY.equalsIgnoreCase(key);
    }
}
