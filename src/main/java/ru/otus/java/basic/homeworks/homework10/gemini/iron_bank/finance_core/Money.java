package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.finance_core;

import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.my_exception.CurrencyMismatchException;
import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.my_exception.InsufficientFundsException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Money {
    private final BigDecimal amount;
    private final Currency currency;

    public Money(String amount, Currency currency) {
        this(new BigDecimal(amount), currency);
    }

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount.setScale(2, RoundingMode.HALF_EVEN);
        this.currency = currency;
    }

    public Money add(Money other) throws CurrencyMismatchException {
        if (other.getCurrency() != currency) {
            throw new CurrencyMismatchException("Валюты отличаются");
        }
        BigDecimal newAmount = this.amount.add(other.getAmount());
        return new Money(newAmount, this.currency);
    }

    public Money subtract(Money other) throws CurrencyMismatchException {
        if (other.getCurrency() != currency) {
            throw new CurrencyMismatchException("Валюты отличаются");
        }

        if (amount.compareTo(other.getAmount()) < 0) {
            throw new InsufficientFundsException("Нельзя списать сумму больше текущей на вашем балансе");
        }

        BigDecimal newAmount = this.amount.subtract(other.getAmount());
        return new Money(newAmount, this.currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount) && currency == money.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }
}
