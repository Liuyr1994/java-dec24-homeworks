package ru.otus.java.basic.homeworks.homework5.transactioncompare;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MainApplication {
    public static void main(String[] args) {
        FinancialTransaction financialTransaction1 = new FinancialTransaction("ID-123", "ACC-A", new BigDecimal("5000.00"));
        FinancialTransaction financialTransaction2 = new FinancialTransaction("ID-123", "ACC-A", new BigDecimal("15000.00"));
        FinancialTransaction financialTransaction3 = new FinancialTransaction("2", "Henadzi", BigDecimal.valueOf(10000));

        Map<FinancialTransaction, String> financialTransactions = new HashMap<>();
        financialTransactions.put(financialTransaction1, "Статус: Обработан");
        financialTransactions.put(financialTransaction2, "Статус: Обработан");
        financialTransactions.put(financialTransaction3, "Статус: Обработан");
        String result = financialTransactions.get(financialTransaction2);

        if ("Статус: Обработан".equals(result)) {
            System.out.println("✅ ТЕСТ УСПЕШЕН: HashMap нашел объект по логически равному ключу.");
        } else {
            System.out.println("❌ ТЕСТ ПРОВАЛЕН: HashMap не смог найти объект. Ошибка в equals/hashCode.");
        }
    }
}
