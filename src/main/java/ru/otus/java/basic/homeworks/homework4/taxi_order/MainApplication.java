package ru.otus.java.basic.homeworks.homework4.taxi_order;

public class MainApplication {
    public static void main(String[] args) {
        TaxiOrder[] taxiOrders = new TaxiOrder[6];
        taxiOrders[0] = new TaxiOrder("Gena", 15, 20);
        taxiOrders[1] = new TaxiOrder("Alesya", 13, 30);
        taxiOrders[2] = new TaxiOrder("Rodyon", 130, 8);
        taxiOrders[3] = new TaxiOrder("Vlad", 10, 50);
        taxiOrders[4] = new TaxiOrder("Sonya", 40, 11);
        taxiOrders[5] = new TaxiOrder("Bob", 20, 13);
        TaxiOrder maxPrice = taxiOrders[0];
        int fullPrice = 0;
        for (int i = 0; i < taxiOrders.length; i++) {
            if (i < 3) {
                taxiOrders[i].accept();
            }
            if (i < 2) {
                taxiOrders[i].complete();
            }
            taxiOrders[i].calculatePrice();
            if (taxiOrders[i].calculatePrice() > maxPrice.calculatePrice()) {
                maxPrice = taxiOrders[i];
            }
            if (taxiOrders[i].getStatus().equalsIgnoreCase("done")) {
                fullPrice += taxiOrders[i].calculatePrice();
                System.out.println("Водитель Родион выполнил следующий заказ " + taxiOrders[i].toString());
            }
        }
        System.out.println("Заказ с максимальной стоимостью " + maxPrice.toString());
        System.out.println("Суммарная стоимость всех заказов = " + fullPrice);
    }
}
