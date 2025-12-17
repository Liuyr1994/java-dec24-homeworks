package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.bank_core;

import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.client_registry.Client;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.finance_core.Currency;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.finance_core.Money;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.my_exception.CurrencyMismatchException;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<Client, Map<Currency, Money>> accounts = new HashMap<>();

    public void createAccount(Client client, Currency currency) {
        Map<Currency, Money> clientAccounts = accounts.get(client);
        if (clientAccounts == null) {
            clientAccounts = new HashMap<>();
            accounts.put(client, clientAccounts);
        }

        clientAccounts.put(currency, new Money("0.00", currency));
    }

    public void executeOperation(Client client, Money money, boolean isDeposit) throws CurrencyMismatchException {
        Map<Currency, Money> clientAccount = accounts.get(client);
        if (clientAccount == null) {
            System.out.println("Клиент не найден в системе");
            return;
        }

        Money currentBalance = clientAccount.get(money.getCurrency());
        if (currentBalance == null) {
            System.out.println("Клиент или счет в нужной валюте не существует");
            return;
        }

        Money result;
        if (!isDeposit) {
            result = currentBalance.subtract(money);
        } else {
            result = currentBalance.add(money);
        }
        clientAccount.put(money.getCurrency(), result);

        System.out.println(isDeposit ? "Сумма успешно добавленна" : "Списание прошло успешно");
    }

    public Money getBalance(Client client, Currency currency) {
        Map<Currency, Money> clientAccounts = accounts.get(client);
        if (clientAccounts == null) {
            return null;
        }
        return clientAccounts.get(currency);
    }
}
