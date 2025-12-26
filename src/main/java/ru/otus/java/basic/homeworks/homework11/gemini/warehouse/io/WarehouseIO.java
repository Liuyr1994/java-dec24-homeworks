package ru.otus.java.basic.homeworks.homework11.gemini.warehouse.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class WarehouseIO {
    public List<String> loadFileData(String filePath) {
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isBlank()) {
                    result.add(line);
                }
            }

        } catch (IOException e) {
            System.err.print("Ошибка при чтение файла: " + e.getMessage() + "\n");
        }
        return result;
    }

    public void saveReport(String pathName, String report) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(pathName))) {
            out.write(report.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
