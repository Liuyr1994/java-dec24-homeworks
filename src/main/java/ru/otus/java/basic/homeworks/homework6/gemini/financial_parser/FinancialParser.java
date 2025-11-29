package ru.otus.java.basic.homeworks.homework6.gemini.financial_parser;

import java.math.BigDecimal;

public class FinancialParser {
    public Transaction parse(String rawData) {
        String[] parts = rawData.split(";");
        String idStr = parts[0].split(":")[1];
        String amountStr = parts[1].split(":")[1];
        String currencyStr = parts[2].split(":")[2];
        long id = Long.parseLong(idStr);
        BigDecimal amount = new BigDecimal(amountStr);
        return new Transaction(id, amount, currencyStr);
    }
}
