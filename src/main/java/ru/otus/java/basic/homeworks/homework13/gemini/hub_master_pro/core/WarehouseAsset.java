package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.core;

import java.math.BigDecimal;

public abstract class WarehouseAsset {
    private final String id;
    private final String name;
    private final BigDecimal weight;
    private final BigDecimal basePrice;

    public WarehouseAsset(String id, String name, BigDecimal weight, BigDecimal basePrice) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public abstract BigDecimal calculateFinalPrice();
}
