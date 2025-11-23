package ru.otus.java.basic.homeworks.homework5.transactioncompare;

import java.math.BigDecimal;
import java.util.Objects;

public class FinancialTransaction {
    private String transactionId;
    private String senderAccount;
    private BigDecimal amount;

    public FinancialTransaction(String transactionId, String senderAccount, BigDecimal amount) {
        this.transactionId = transactionId;
        this.senderAccount = senderAccount;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FinancialTransaction that = (FinancialTransaction) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(senderAccount, that.senderAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, senderAccount);
    }
}
