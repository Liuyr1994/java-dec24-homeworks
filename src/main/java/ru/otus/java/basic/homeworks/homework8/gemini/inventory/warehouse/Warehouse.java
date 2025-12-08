package ru.otus.java.basic.homeworks.homework8.gemini.inventory.warehouse;

import ru.otus.java.basic.homeworks.homework8.gemini.inventory.my_exception.ItemNotFoundException;
import ru.otus.java.basic.homeworks.homework8.gemini.inventory.product.Product;

import java.util.List;

public class Warehouse {
    private List<Product> list;

    public Warehouse(List<Product> list) {
        this.list = list;
    }

    public Product find(String name) throws ItemNotFoundException {
        for (Product product : list) {
            if (product.getName().equals(name)) {
                return product;
            }
        }

        throw new ItemNotFoundException("Продукт не найден");
    }
}
