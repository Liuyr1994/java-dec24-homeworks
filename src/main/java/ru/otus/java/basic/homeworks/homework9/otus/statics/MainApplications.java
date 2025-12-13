package ru.otus.java.basic.homeworks.homework9.otus.statics;

import java.util.ArrayList;
import java.util.List;

public class MainApplications {
    public static void main(String[] args) {

    }

    public static List<Integer> generateRangeList(int min, int max) {
        List<Integer> listResult = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            listResult.add(i);
        }

        return listResult;
    }

    public static int sumGreaterThanFive(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int result = 0;
        for (Integer i : list) {
            if (i > 5) {
                result += i;
            }
        }
        return result;
    }

    public static List<Integer> fillListWithNumber(int number, List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list.set(i, number);
            }
        }
        System.out.println(list);
        return list;
    }

    public static List<Integer> incrementListElements(int number, List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * number);
        }
        System.out.println(list);
        return list;
    }
}
