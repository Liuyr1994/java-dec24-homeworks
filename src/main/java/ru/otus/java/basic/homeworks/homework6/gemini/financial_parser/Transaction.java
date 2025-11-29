package ru.otus.java.basic.homeworks.homework6.gemini.financial_parser;

import java.math.BigDecimal;

public class Transaction {
    private long id;
    private BigDecimal amount;
    private String currency;

    public Transaction(long id, BigDecimal amount, String currency) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
