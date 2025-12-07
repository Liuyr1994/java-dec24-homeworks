package ru.otus.java.basic.homeworks.homework7.gemini.warehouse;

public class SmallParts extends InventoryItem implements Storable {
    private int weight;

    public SmallParts(String name, int id, int weight) {
        super(name, id);
        if (weight >= 500) {
            throw new IllegalArgumentException("Ошибка логистики: SmallParts (МелкиеДетали) должен весить < 500 кг.");
        }
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void ship() {
        System.out.println("Упаковка в стандартный почтовый пакет, нанесение штрих-кода, взвешивание.");
    }
}
