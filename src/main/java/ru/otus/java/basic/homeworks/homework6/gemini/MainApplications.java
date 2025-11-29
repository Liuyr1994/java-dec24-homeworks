package ru.otus.java.basic.homeworks.homework6.gemini;

import ru.otus.java.basic.homeworks.homework6.gemini.text_analyze.TextAnalyzer;

public class MainApplications {
    public static void main(String[] args) {
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        System.out.println(textAnalyzer.analyzeText("Hello Java"));
    }
}
