package ru.otus.java.basic.homeworks.homework18;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> arr = new ArrayList<>();

    public void add(T t) {
        arr.add(t);
    }

    public int weight() {
        int totalWeight = 0;
        for (T fruit : arr) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void transfer(Box<T> other) {
        if (this == other) return; // Нельзя пересыпать в саму себя
        other.arr.addAll(this.arr);
        this.arr.clear();
    }

    public boolean compare(Box<? extends Fruit> o) {
        return this.weight() == o.weight();
    }
}
