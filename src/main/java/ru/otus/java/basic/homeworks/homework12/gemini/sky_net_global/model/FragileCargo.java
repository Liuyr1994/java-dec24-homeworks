package ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FragileCargo extends Cargo implements Taxable {

    public FragileCargo(String id, double weight, BigDecimal declaredValue) {
        super(id, weight, declaredValue);
    }

    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return new BigDecimal(String.valueOf(price)).multiply(new BigDecimal("0.05")).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calculateShippingCost() {
        return new BigDecimal(weight).multiply(new BigDecimal("100")).setScale(2, RoundingMode.HALF_UP).add(new BigDecimal("500"));
    }
}
