package ru.otus.java.basic.homeworks.homework5.bank_accounts;

public abstract class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        if (balance >= 0) {
            this.balance = balance;
            return;
        }
        this.balance = 1000;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма пополнения не может быть отрицательной");
        }
        balance += amount;
    }

    public abstract boolean withdraw(double amount);

    public void info() {
        System.out.println("Владелец счета: " + owner + "\nБаланс счета: " + balance);
    }
}
