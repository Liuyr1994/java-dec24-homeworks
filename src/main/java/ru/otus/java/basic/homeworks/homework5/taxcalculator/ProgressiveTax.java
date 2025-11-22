package ru.otus.java.basic.homeworks.homework5.taxcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProgressiveTax extends TaxCalculator {
    public ProgressiveTax(BigDecimal baseAmount) {
        super(baseAmount);
    }

    @Override
    public BigDecimal calculateTax() {
        BigDecimal base = new BigDecimal(1000.00);
        BigDecimal result;
        if (baseAmount.compareTo(base) >= 0) {
            result = baseAmount.multiply(BigDecimal.valueOf(0.15));
            return result.setScale(2, RoundingMode.HALF_UP);
        }
        result = baseAmount.multiply(BigDecimal.valueOf(0.1));
        return result.setScale(2, RoundingMode.HALF_UP);
    }
}
