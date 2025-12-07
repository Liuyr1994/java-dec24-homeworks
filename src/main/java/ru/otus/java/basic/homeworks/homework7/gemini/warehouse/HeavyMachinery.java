package ru.otus.java.basic.homeworks.homework7.gemini.warehouse;

public class HeavyMachinery extends InventoryItem implements Storable {
    private int weight;

    public HeavyMachinery(String name, int id, int weight) {
        super(name, id);
        if (weight <= 500) {
            throw new IllegalArgumentException("Ошибка логистики: Heavy Machinery (Большие Детали) должен весить > 500 кг.");

        }
        this.weight = weight;

    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void ship() {
        System.out.println("Вызов крана, заполнение специальных таможенных форм, крепление на усиленной платформе.");
    }
}
