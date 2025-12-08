package ru.otus.java.basic.homeworks.homework8.gemini.inventory;

import ru.otus.java.basic.homeworks.homework8.gemini.inventory.my_exception.InventoryException;
import ru.otus.java.basic.homeworks.homework8.gemini.inventory.my_exception.ItemNotFoundException;
import ru.otus.java.basic.homeworks.homework8.gemini.inventory.product.Book;
import ru.otus.java.basic.homeworks.homework8.gemini.inventory.product.Product;
import ru.otus.java.basic.homeworks.homework8.gemini.inventory.product.Tool;
import ru.otus.java.basic.homeworks.homework8.gemini.inventory.warehouse.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Book("Дурак", 1));
        products.add(new Tool("Дрель", 2));

        Warehouse warehouse = new Warehouse(products);
        try {
            warehouse.find("Дурак");
        } catch (ItemNotFoundException e) {
            System.out.println(e);
        } catch (InventoryException e) {
            System.out.println(e);
        }

    }
}
