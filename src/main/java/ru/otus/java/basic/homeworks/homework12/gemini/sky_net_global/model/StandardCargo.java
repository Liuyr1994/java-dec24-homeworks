package ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StandardCargo extends Cargo {


    public StandardCargo(String id, double weight, BigDecimal declaredValue) {
        super(id, weight, declaredValue);
    }

    @Override
    public BigDecimal calculateShippingCost() {
        return BigDecimal.valueOf(weight)
                .multiply(new BigDecimal("50"))
                .setScale(2, RoundingMode.HALF_UP);
    }
}
