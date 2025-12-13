package ru.otus.java.basic.homeworks.homework9.gemini.dataconverter;

import java.util.ArrayList;
import java.util.List;

public class ListConverter {
    public static List<Integer> arrayToList(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Вы передали пустой массив");
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }

    public static List<Integer> filterList(List<Integer> list, FilterType type, int value) {
        List<Integer> filtrerList = new ArrayList<>();
        for (Integer i : list) {
            if (type == FilterType.GREATER_THAN) {
                if (i > value) {
                    filtrerList.add(i);
                }
            } else if (type == FilterType.LESS_THAN) {
                if (i < value) {
                    filtrerList.add(i);
                }
            }
        }
        return filtrerList;
    }
}
