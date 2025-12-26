package ru.otus.java.basic.homeworks.homework11.gemini.warehouse.model;

public final class Product {
    private final String id;
    private final String name;
    private final int quantity;
    private final double price;

    public Product(String id, String name, int quantity, double price) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Количество и цена не могут быть меньше ноля");
        }
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" + "ID: " + id + "]" + '\'' +
                name + " - " + quantity + " шт." +
                " (" + price + " руб.)";
    }
}
