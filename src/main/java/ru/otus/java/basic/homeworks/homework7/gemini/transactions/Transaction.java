package ru.otus.java.basic.homeworks.homework7.gemini.transactions;

import ru.otus.java.basic.homeworks.homework5.bank_accounts.BankAccount;

public interface Transaction {
    boolean execute(BankAccount account);
}
