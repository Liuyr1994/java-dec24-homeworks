package ru.otus.java.basic.homeworks.homework8.gemini.inventory.product;

public abstract class Product {
    protected final String name;
    protected final int id;

    protected Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
