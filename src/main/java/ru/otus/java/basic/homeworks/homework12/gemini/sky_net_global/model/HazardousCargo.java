package ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HazardousCargo extends Cargo implements Taxable {
    public HazardousCargo(String id, double weight, BigDecimal declaredValue) {
        super(id, weight, declaredValue);
    }

    @Override
    public BigDecimal calculateShippingCost() {
        return new BigDecimal(weight).multiply(new BigDecimal("150")).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return new BigDecimal(String.valueOf(price)).multiply(new BigDecimal("0.15")).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculateInsurance() {
        BigDecimal insurance = declaredValue.multiply(new BigDecimal("0.02")).setScale(2, RoundingMode.HALF_UP);
        if (weight > 50) {
            insurance = insurance.multiply(new BigDecimal("2")).setScale(2, RoundingMode.HALF_UP);
        }
        return insurance;
    }
}
