package ru.otus.java.basic.homeworks.homework7.gemini.transactions;

import ru.otus.java.basic.homeworks.homework5.bank_accounts.BankAccount;

public class DepositTransaction implements Transaction {
    private final double amount;

    public DepositTransaction(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean execute(BankAccount account) {
        account.deposit(amount);
        return true;
    }
}
