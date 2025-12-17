package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank;

import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.analytics.TransactionHistory;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.bank_core.Bank;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.client_registry.ClientRegistry;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.client_registry.IndividualClient;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.finance_core.Currency;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.finance_core.Money;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.parser.TransactionParser;

public class MainApplication {
    public static void main(String[] args) {
        // 1. Инициализация системы
        Bank ironBank = new Bank();
        ClientRegistry registry = new ClientRegistry();
        TransactionHistory history = new TransactionHistory();

        // 2. Подготовка данных (Клиент и его счета)
        IndividualClient tycoon = new IndividualClient("101", "Mr. Tycoon");
        registry.register(tycoon);
        ironBank.createAccount(tycoon, Currency.USD);
        ironBank.createAccount(tycoon, Currency.RUB);

        // 3. Имитация входного потока данных (Массив строк)
        String[] logs = {
                "101;DEPOSIT;USD;1000.00",   // Успех
                "101;WITHDRAW;USD;250.50",    // Успех
                "101;DEPOSIT;RUB;5000.00",   // Успех
                "999;DEPOSIT;USD;100.00",    // Ошибка: Клиент не найден
                "101;WITHDRAW;USD;abc.00",   // Ошибка: Неверный формат суммы
                "101;TRANSFER;USD;50.00",    // Ошибка: Неверная операция
                "101;WITHDRAW;USD;2000.00"    // Ошибка: Недостаточно средств
        };

        System.out.println("=== НАЧАЛО ОБРАБОТКИ ТРАНЗАКЦИЙ ===");
        int txCounter = 1;

        for (String line : logs) {
            try {
                // Пытаемся распарсить и выполнить
                // Убедись, что в TransactionParser метод parseAndExecute возвращает Money!
                Money result = TransactionParser.parseAndExecute(line, ironBank, registry);

                if (result != null) {
                    history.add("TX-ID-" + txCounter++, result);
                }
            } catch (Exception e) {
                // Здесь мы ловим CommandFormatException, CurrencyMismatchException и InsufficientFundsException
                System.out.println("[ОТКЛОНЕНО]: " + line + " | Причина: " + e.getMessage());
            }
        }

        history.printAll();

        System.out.println("\n=== ИТОГОВЫЕ БАЛАНСЫ ===");
        System.out.println("USD: " + ironBank.getBalance(tycoon, Currency.USD));
        System.out.println("RUB: " + ironBank.getBalance(tycoon, Currency.RUB));
    }
}
