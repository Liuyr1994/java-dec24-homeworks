package ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.service;

import ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model.Cargo;
import ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model.FragileCargo;
import ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model.HazardousCargo;
import ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model.StandardCargo;

import java.math.BigDecimal;

public class CargoParser {

    public static Cargo parse(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException("Передана пустая строка");
        }

        String[] parts = input.split(" ");

        if (parts.length != 4) {
            throw new IllegalArgumentException("Передана некорректная строка");
        }

        String id = parts[1];
        double weight = Double.parseDouble(parts[2]);
        BigDecimal declaredValue = new BigDecimal(parts[3]);
        if (parts[0].equalsIgnoreCase("standard")) {
            return new StandardCargo(id, weight, declaredValue);
        } else if (parts[0].equalsIgnoreCase("fragile")) {
            return new FragileCargo(id, weight, declaredValue);
        } else if (parts[0].equalsIgnoreCase("hazardous")) {
            return new HazardousCargo(id, weight, declaredValue);
        }

        throw new IllegalArgumentException("Некорректно передан тип");

    }
}
