package ru.otus.java.basic.homeworks.homework11.gemini.warehouse.repository;

import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.model.Product;

import java.util.*;

public class StockRepository {
    private Map<String, Product> repository = new HashMap<>();

    public void add(Product product) {
        if (repository.containsKey(product.getId())) {
            repository.put(product.getId(), product);
            System.out.println("Обновление данных товара: " + "[ " + product.getId() + " ]");
            return;
        }
        repository.put(product.getId(), product);
    }

    public Product findById(String id) {
        return repository.get(id);
    }

    public List<Product> findAll() {
        if (repository == null || repository.isEmpty()) {
            return new ArrayList<>();
        }
        List<Product> products = new ArrayList<>(repository.values());
        return Collections.unmodifiableList(products);
    }
}
