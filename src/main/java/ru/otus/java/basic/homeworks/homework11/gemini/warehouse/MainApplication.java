package ru.otus.java.basic.homeworks.homework11.gemini.warehouse;

import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.controller.WarehouseManager;
import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.io.WarehouseIO;
import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.repository.StockRepository;
import ru.otus.java.basic.homeworks.homework11.gemini.warehouse.service.ProductService;

public class MainApplication {
    public static void main(String[] args) {
        WarehouseIO io = new WarehouseIO();
        ProductService service = new ProductService();
        StockRepository repository = new StockRepository();
        WarehouseManager manager = new WarehouseManager(io, service, repository);
        try {
            manager.process("input.txt", "report.txt");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
