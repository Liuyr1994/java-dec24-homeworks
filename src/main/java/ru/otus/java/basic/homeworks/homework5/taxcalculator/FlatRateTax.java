package ru.otus.java.basic.homeworks.homework5.taxcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlatRateTax extends TaxCalculator {
    private BigDecimal rate;

    public FlatRateTax(BigDecimal baseAmount, BigDecimal rate) {
        super(baseAmount);
        this.rate = rate;
    }

    @Override
    public BigDecimal calculateTax() {
        BigDecimal result = baseAmount.multiply(rate.divide(BigDecimal.valueOf(100)));
        return result.setScale(2, RoundingMode.HALF_UP);
    }
}
