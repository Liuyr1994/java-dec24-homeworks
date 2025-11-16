package ru.otus.java.basic.homeworks.homework4.stock_item;

public class MainApplication {
    public static void main(String[] args) {
        StockItem[] stockItems = new StockItem[8];
        stockItems[0] = new StockItem("Computer", 5, 2, 1000);
        stockItems[1] = new StockItem("Juice", 13, 4, 10);
        stockItems[2] = new StockItem("Apple", 25, 11, 5);
        stockItems[3] = new StockItem("Orange", 100, 20, 3);
        stockItems[4] = new StockItem("Bread", 80, 15, 2);
        stockItems[5] = new StockItem("Monitor", 4, 3, 200);
        stockItems[6] = new StockItem("Bike", 16, 6, 150);
        stockItems[7] = new StockItem("Auto", 3, 1, 15000);

        for (int i = 0; i < stockItems.length; i++) {
            if (Math.random() >= 0.5) {
                stockItems[i].add((int) (Math.random() * 10));
            } else {
                stockItems[i].add((int) Math.random() * 10);
            }
        }

        int totalCoast = 0;
        StockItem maxCoastItem = stockItems[0];

        for (int i = 0; i < stockItems.length; i++) {
            if (stockItems[i].isLow()) {
                System.out.println("Этот товар с низким запасом: " + stockItems[i].getName());
            }
            totalCoast += stockItems[i].getTotalValue();
            if (maxCoastItem.getTotalValue() < stockItems[i].getTotalValue()) {
                maxCoastItem = stockItems[i];
            }
        }

        System.out.println("Общая стоимость всех товаров = " + totalCoast);
        System.out.println("Товар с максимальной стоимостью: " + maxCoastItem.toString());
    }
}
