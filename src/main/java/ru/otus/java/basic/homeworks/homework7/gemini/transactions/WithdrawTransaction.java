package ru.otus.java.basic.homeworks.homework7.gemini.transactions;

import ru.otus.java.basic.homeworks.homework5.bank_accounts.BankAccount;

public class WithdrawTransaction implements Transaction {
    private final double amount;

    public WithdrawTransaction(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean execute(BankAccount account) {
        return account.withdraw(amount);
    }
}
