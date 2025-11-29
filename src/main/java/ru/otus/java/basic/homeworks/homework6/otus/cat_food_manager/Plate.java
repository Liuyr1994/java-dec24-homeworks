package ru.otus.java.basic.homeworks.homework6.otus.cat_food_manager;

public class Plate {
    private int amount;

    public Plate(int amount) {
        if (amount >= 1) {
            this.amount = amount;
        }
        this.amount = 100;
    }

    public boolean tryEat(int tryAmount) {
        if (amount >= tryAmount) {
            amount -= tryAmount;
            return true;
        }
        return false;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
