package ru.otus.java.basic.homeworks.homework7.gemini.warehouse;

import java.util.List;

public class Warehouse {
    public void processShipment(List<Storable> items) {
        System.out.println("--- НАЧАЛО ОБРАБОТКИ ОТПРАВОК ---");
        for (Storable item : items) {

            // 1. Вызов уникальной логики подготовки (полиморфизм)
            item.ship();

            int weight = item.getWeight();

            // 2. Применение логики сортировки (бизнес-правило)
            if (weight > 500) {
                System.out.printf("-> Вердикт: Вес %d. Отправлено ГРУЗОВИКОМ.\n", weight);
            } else {
                System.out.printf("-> Вердикт: Вес %d. Отправлено ДРОНОМ.\n", weight);
            }
        }
        System.out.println("--- ОБРАБОТКА ЗАВЕРШЕНА ---");
    }
}
