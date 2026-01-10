package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.service;

import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.assets.ChemicalBarrel;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.assets.Pallet;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.core.WarehouseAsset;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.dto.CommandDto;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.exception.AssetStorageException;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.repository.WarehouseRepository;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.util.CommandParser;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncHubService {
    private final ExecutorService executor;
    private final WarehouseRepository repository;

    // Конструктор: создаем пул сами
    public AsyncHubService(WarehouseRepository repository) {
        this.executor = Executors.newFixedThreadPool(4);
        this.repository = repository;
    }

    public void processAsync(String input) {
        executor.submit(() -> {
            try {
                CommandDto dto = CommandParser.parse(input);
                String action = dto.getAction().toUpperCase();

                switch (action) {
                    case "ADD":
                        // Вызываем наш приватный метод
                        handleAdd(dto);
                        break;
                    case "REMOVE":
                        repository.remove(dto.getId());
                        break;
                    default:
                        System.out.println("Неизвестная операция: " + action);
                }

                System.out.println("[" + Thread.currentThread().getName() + "] Выполнено: " + input);

            } catch (Exception e) {
                System.err.println("[" + Thread.currentThread().getName() + "] Ошибка: " + e.getMessage());
            }
        });
    }

    private void handleAdd(CommandDto dto) throws AssetStorageException {
        WarehouseAsset asset;
        if (dto.getType().equalsIgnoreCase("PALLET")) {
            asset = new Pallet(dto.getId(), dto.getType(), dto.getWeight(), dto.getPrice());
        } else if (dto.getType().equalsIgnoreCase("CHEMICAL")) {
            asset = new ChemicalBarrel(dto.getId(), dto.getType(), dto.getWeight(), dto.getPrice(), new BigDecimal("1.5"));
        } else {
            throw new AssetStorageException("Неизвестный тип груза: " + dto.getType());
        }
        repository.addAsset(asset);
    }
}
