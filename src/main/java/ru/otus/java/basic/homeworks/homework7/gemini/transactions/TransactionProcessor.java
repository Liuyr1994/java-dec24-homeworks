package ru.otus.java.basic.homeworks.homework7.gemini.transactions;

import ru.otus.java.basic.homeworks.homework5.bank_accounts.BankAccount;

import java.util.List;

public class TransactionProcessor {
    public void process(List<Transaction> transactions, BankAccount account) {
        int successCount = 0;
        int failureCount = 0;
        for (Transaction transaction : transactions) {
            if (transaction.execute(account)) {
                successCount++;
                continue;
            }
            failureCount++;
        }

        System.out.println("Удачных: " + successCount);
        System.out.println("Ошибочных: " + failureCount);

    }
}
