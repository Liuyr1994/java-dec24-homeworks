package ru.otus.java.basic.homeworks.homework7.gemini.warehouse;

public abstract class InventoryItem {
    protected final String name;
    protected final int id;

    protected InventoryItem(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
