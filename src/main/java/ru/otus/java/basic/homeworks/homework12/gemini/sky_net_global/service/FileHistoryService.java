package ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.service;

import ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model.Cargo;

import java.io.*;
import java.math.BigDecimal;

public class FileHistoryService {
    public void save(Cargo cargo, BigDecimal totalCost, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            StringBuilder sb = new StringBuilder(cargo.getId()).append("|").append(cargo.getClass().getSimpleName()).append("|").append("|").append(cargo.getWeight()).append("|").append(cargo.calculateShippingCost()).append("|").append(cargo.getDeclaredValue()).append("|").append(totalCost);
            writer.write(sb.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Не удалось записать данные в файл");
        }
    }

    public void printHistory(String fileName) {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Файл истории пуст или не найден");
        }
    }
}
