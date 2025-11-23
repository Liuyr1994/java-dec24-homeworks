package ru.otus.java.basic.homeworks.homework5.taxcalculator;

import java.math.BigDecimal;

public class MainApplications {
    public static void main(String[] args) {
        TaxCalculator flatTaxCalculator = new FlatRateTax(new BigDecimal(1000), new BigDecimal(10));
        TaxCalculator progressiveTax = new ProgressiveTax(new BigDecimal(1000));
        TaxCalculator[] taxCalculators = new TaxCalculator[2];
        taxCalculators[0] = flatTaxCalculator;
        taxCalculators[1] = progressiveTax;
        for (int i = 0; i < taxCalculators.length; i++) {
            System.out.println("Рассчет налога: " + taxCalculators[i].calculateTax());
        }
    }
}
