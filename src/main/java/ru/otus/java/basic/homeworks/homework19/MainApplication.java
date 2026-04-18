package ru.otus.java.basic.homeworks.homework19;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainApplication {
    public static void main(String[] args) {
        File folder = new File("."); // Текущая папка
        String[] files = folder.list((dir, name) -> name.endsWith(".txt"));
        System.out.println("Текстовые файлы: " + String.join(", ", files));
    }

    public static int countOccurrences(String nameFile, String target) {
        try {
            String content = Files.readString(Path.of(nameFile), StandardCharsets.UTF_8);
            int count = 0;
            int index = 0;
            while ((index = content.indexOf(target, index)) != -1) {
                count++;
                index += target.length();
            }
            return count;
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return 0;
        }
    }
}
