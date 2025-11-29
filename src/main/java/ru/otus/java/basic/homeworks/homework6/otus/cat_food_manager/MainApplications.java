package ru.otus.java.basic.homeworks.homework6.otus.cat_food_manager;

import java.util.List;

public class MainApplications {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 10);
        Cat barsik = new Cat("Barsik", 15);
        List<Cat> cats = List.of(murzik, barsik);
        Plate plate = new Plate(20);
        System.out.println(cats);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
    }
}
