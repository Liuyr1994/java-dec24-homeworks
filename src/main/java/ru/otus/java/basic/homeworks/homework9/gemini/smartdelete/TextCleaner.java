package ru.otus.java.basic.homeworks.homework9.gemini.smartdelete;

import java.util.Iterator;
import java.util.List;

public class TextCleaner {

    public static void removePalindromes(List<String> words) {
        Iterator<String> stringIterator = words.iterator();
        while (stringIterator.hasNext()) {
            String word = stringIterator.next();
            String reverseWord = new StringBuilder(word).reverse().toString();
            if (reverseWord.equalsIgnoreCase(word)) {
                stringIterator.remove();
            }
        }
    }
}
