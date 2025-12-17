package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.parser;

import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.bank_core.Bank;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.client_registry.ClientRegistry;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.finance_core.Currency;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.finance_core.Money;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.my_exception.CommandFormatException;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.my_exception.CurrencyMismatchException;

public class TransactionParser {
    public static Money parseAndExecute(String input, Bank bank, ClientRegistry clientRegistry) throws CommandFormatException, CurrencyMismatchException {
        String[] strings = input.split(";");
        if (strings.length != 4) {
            throw new CommandFormatException("Неверный формат строки. Нужно 4 параметра через ';'");
        }

        if (clientRegistry.findClientById(strings[0]) == null) {
            System.out.println("Клиете не найден");
            return null;
        }

        try {
            Currency currency = Currency.valueOf(strings[2].toUpperCase());
            Money amount = new Money(strings[3], currency);
            String operation = strings[1].toUpperCase();
            if (operation.equalsIgnoreCase("DEPOSIT")) {
                bank.executeOperation(clientRegistry.findClientById(strings[0]), amount, true);
            } else if (operation.equalsIgnoreCase("WITHDRAW")) {
                bank.executeOperation(clientRegistry.findClientById(strings[0]), amount, false);
            } else {
                throw new CommandFormatException("Пришла не верная информация");
            }
            return amount;
        } catch (NumberFormatException e) {
            // Ошибка в конструкторе Money (BigDecimal)
            throw new CommandFormatException("Неверный формат суммы: " + strings[3]);
        } catch (IllegalArgumentException e) {
            // Ошибка в Currency.valueOf
            throw new CommandFormatException("Неверная валюта: " + strings[2]);
        }
    }
}
