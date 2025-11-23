package ru.otus.java.basic.homeworks.homework5.taxcalculator;

import java.math.BigDecimal;

public abstract class TaxCalculator {
    BigDecimal baseAmount;

    public TaxCalculator(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    public abstract BigDecimal calculateTax();
}
