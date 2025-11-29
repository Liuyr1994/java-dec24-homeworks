package ru.otus.java.basic.homeworks.homework6.gpt.market;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private List<Product> products;

    public Market(List<Product> products) {
        this.products = products;
    }

    public Product findByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> filterByPrice(double max) {
        List<Product> products1 = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() <= max) {
                products1.add(product);
            }
        }
        return products1;
    }
}
