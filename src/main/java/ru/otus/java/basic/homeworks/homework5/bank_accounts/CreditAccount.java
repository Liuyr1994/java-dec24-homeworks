package ru.otus.java.basic.homeworks.homework5.bank_accounts;

public class CreditAccount extends BankAccount {
    public CreditAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount + (amount * 0.1) > -10000) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
