package ru.otus.java.basic.homeworks.homework6.gemini.text_analyze;

public class TextAnalyzer {
    public String analyzeText(String text) {
        if (text == null) {
            return "Text is null";
        }
        StringBuilder sb = new StringBuilder();
        int charCount = text.length();
        int words = text.isBlank() ? 0 : text.trim().split("\\s++").length;
        int lines = text.isBlank() ? 0 : text.split("\n").length;
        StringBuilder sbReverse = new StringBuilder(text).reverse();
        sb.append("Общее количество символов: ").append(charCount).append("\n");
        sb.append("Общее количество слов: ").append(words).append("\n");
        sb.append("Общее количество строк: ").append(lines).append("\n");
        sb.append("Исходгый текст в перевернутом виде:").append("\n").append(sbReverse);
        return sb.toString();
    }
}
