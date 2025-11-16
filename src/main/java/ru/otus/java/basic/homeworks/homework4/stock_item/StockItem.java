package ru.otus.java.basic.homeworks.homework4.stock_item;

public class StockItem {
    private String name;
    private int quantity;
    private int criticalLimit;
    private int pricePerUnit;

    public String getName() {
        return name;
    }

    public StockItem(String name, int quantity, int criticalLimit, int pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.criticalLimit = criticalLimit;
        this.pricePerUnit = pricePerUnit;
    }

    public void take(int count) {
        if (quantity > 0 && count < quantity) {
            quantity -= count;
            return;
        }
        quantity = 0;
    }

    public void add(int count) {
        quantity += count;
    }

    public boolean isLow() {
        return quantity <= criticalLimit;
    }

    public int getTotalValue() {
        return quantity * pricePerUnit;
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", criticalLimit=" + criticalLimit +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }
}
