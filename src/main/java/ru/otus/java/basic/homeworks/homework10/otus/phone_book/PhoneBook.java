package ru.otus.java.basic.homeworks.homework10.otus.phone_book;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<Initials, Set<Integer>> phoneBook;

    public PhoneBook(Map<Initials, Set<Integer>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void add(Initials initials, Integer integer) {
        if (!phoneBook.containsKey(initials)) {
            phoneBook.put(initials, new HashSet<>());
        }

        phoneBook.get(initials).add(integer);

    }

    public Set<Integer> find(Initials initials) {
        if (phoneBook == null || phoneBook.isEmpty()) {
            throw new IllegalArgumentException("Справочник пуст");
        }

        return phoneBook.get(initials);
    }

    public void containsPhoneNumber(Integer number) {
        for (Set<Integer> integer : phoneBook.values()) {
            for (Integer i : integer) {
                if (number == i) {
                    System.out.println("Номер найден");
                    return;
                }
            }
        }

        System.out.println("Данного номера не существует");
    }
}
