package ru.otus.java.basic.homeworks.homework6.gpt.market;

import java.util.List;

public class Cart {
    List<Product> products;

    public Cart(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double totalPrice() {
        double finalSum = 0;
        for (Product product : products) {
            finalSum += product.getPrice();
        }
        return finalSum;
    }

    public String receipt() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product + "\n");
        }
        return sb.toString();
    }
}
