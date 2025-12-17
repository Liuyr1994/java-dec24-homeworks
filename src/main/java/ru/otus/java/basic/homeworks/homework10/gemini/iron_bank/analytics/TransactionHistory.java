package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.analytics;

import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.finance_core.Money;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TransactionHistory {
    private final Map<String, Money> history = new TreeMap<>();

    public void add(String id, Money money) {
        history.put(id, money);
    }

    public void printAll() {
        System.out.println("\n=== ЖУРНАЛ УСПЕШНЫХ ТРАНЗАКЦИЙ ===");
        Iterator<Map.Entry<String, Money>> iterator = history.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Money> entry = iterator.next();
            System.out.println("Транзакция [" + entry.getKey() + "]: " + entry.getValue());
        }
    }
}
