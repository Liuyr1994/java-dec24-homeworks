package ru.otus.java.basic.homeworks.homework11.gemini.warehouse.controller;

import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.exception.ProductDataException;
import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.io.WarehouseIO;
import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.model.Product;
import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.repository.StockRepository;
import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.service.ProductService;

import java.util.List;

public class WarehouseManager {
    private final WarehouseIO io;
    private final ProductService service;
    private final StockRepository repository;

    public WarehouseManager(WarehouseIO io, ProductService service, StockRepository repository) {
        this.io = io;
        this.service = service;
        this.repository = repository;
    }

    public void process(String inputPath, String outputPath) {
        List<String> strings = io.loadFileData(inputPath);
        for (String string : strings) {
            try {
                Product product = service.parseLine(string);
                repository.add(product);
            } catch (ProductDataException e) {
                System.err.println("Ошибка парсинга: " + e.getMessage());
            }
        }
        io.saveReport(outputPath, service.buildStockReport(repository.findAll()));
    }


}
