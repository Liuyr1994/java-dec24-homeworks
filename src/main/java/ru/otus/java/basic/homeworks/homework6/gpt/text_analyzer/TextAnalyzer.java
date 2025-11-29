package ru.otus.java.basic.homeworks.homework6.gpt.text_analyzer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class TextAnalyzer {
    private static final String SPACE_REGEX = "\\s+";
    private String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public int countWords() {
        if (text == null || text.isBlank()) {
            return 0;
        }
        String normalized = normalize();
        return normalized.split(SPACE_REGEX).length;
    }

    public int countUniqueWords() {
        if (text == null || text.isBlank()) {
            return 0;
        }
        String normalized = normalize(); // убираем двойные пробелы

        String[] words = normalized.split(SPACE_REGEX);

        return new HashSet<>(List.of(words)).size();
    }

    public String mostFrequentWord() {
        if (text == null || text.isBlank()) {
            return "";
        }

        // Нормализация текста
        String normalized = normalize();// убираем двойные пробелы

        String[] words = normalized.split(SPACE_REGEX);

        Map<String, Integer> freq = new HashMap<>();

        // Подсчёт частоты слов O(n)
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        String result = words[0];
        int max = 1;

        // Поиск самого частого слова
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public String reverse() {
        if (text == null || text.isBlank()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }

    private String normalize() {
        return text
                .toLowerCase()
                .trim()
                .replaceAll(SPACE_REGEX, " ");
    }
}
