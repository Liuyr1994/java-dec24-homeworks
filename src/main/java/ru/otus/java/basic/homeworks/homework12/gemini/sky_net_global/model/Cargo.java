package ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model;

import java.math.BigDecimal;

public abstract class Cargo {
    String id;
    double weight;
    BigDecimal declaredValue;

    public Cargo(String id, double weight, BigDecimal declaredValue) {
        this.id = id;
        this.weight = weight;
        this.declaredValue = declaredValue;
    }

    public String getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public BigDecimal getDeclaredValue() {
        return declaredValue;
    }

    public abstract BigDecimal calculateShippingCost();


}
