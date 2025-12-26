package ru.otus.java.basic.homeworks.homework11.gemini.warehouse.service;

import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.exception.ProductDataException;
import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.model.Product;

import java.util.List;

public class ProductService {
    public Product parseLine(String line) throws ProductDataException {
        String[] parseLines = line.split("\\|");
        if (parseLines.length != 4) {
            throw new ProductDataException("Битая строка");
        }

        String id = parseLines[0];
        String name = parseLines[1];
        int qty;
        double price;
        try {
            qty = Integer.parseInt(parseLines[2]);
            price = Double.parseDouble(parseLines[3]);
        } catch (NumberFormatException e) {
            throw new ProductDataException("Некорректные данные");
        }

        return new Product(id, name, qty, price);
    }

    public String buildStockReport(List<Product> products) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== ОТЧЕТ ПО СКЛАДУ ===\n");
        for (int i = 0; i < products.size(); i++) {
            sb.append(i + 1).append(". ").append(products.get(i)).append("\n");
        }
        sb.append("-----------------------\n");
        sb.append("Итого позиций: ").append(products.size());
        return sb.toString();
    }
}
