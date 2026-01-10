package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.repository;

import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.core.WarehouseAsset;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.exception.AssetStorageException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WarehouseRepository {
    private final Map<String, WarehouseAsset> storage = new ConcurrentHashMap<>();

    public void addAsset(WarehouseAsset warehouseAsset) throws AssetStorageException {
        if (storage.containsKey(warehouseAsset.getId())) {
            throw new AssetStorageException("Данные уже есть в базе данных");
        }
        storage.put(warehouseAsset.getId(), warehouseAsset);
    }

    public WarehouseAsset getById(String id) throws AssetStorageException {
        if (!storage.containsKey(id)) {
            throw new AssetStorageException("Груз с ID: " + id + " не найден.");
        }

        return storage.get(id);
    }

    public void remove(String id) throws AssetStorageException {
        if (!storage.containsKey(id)) {
            throw new AssetStorageException("Объекта нет в хранилище");
        }
        storage.remove(id);
    }

    public List<WarehouseAsset> getAll() {
        return new ArrayList<>(storage.values());
    }
}
