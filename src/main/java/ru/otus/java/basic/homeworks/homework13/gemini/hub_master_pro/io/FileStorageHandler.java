package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.io;

import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.core.WarehouseAsset;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStorageHandler {
    public static void exportData(List<WarehouseAsset> assets, String filePath) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)))) {
            for (WarehouseAsset asset : assets) {
                writer.write("ADD|" + asset.getId() + "|" + asset.getClass().getSimpleName().toUpperCase() + "|" + asset.getWeight() + "|" + asset.getBasePrice() + "\n");

            }
        } catch (IOException e) {
            System.out.println("Случился сбой.");
        }
    }

    public static List<String> importData(String filePath) {
        List<String> report = new ArrayList<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                report.add(line);
            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так..");
        }
        return report;
    }
}
