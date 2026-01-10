package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.assets;

import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.core.WarehouseAsset;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pallet extends WarehouseAsset {
    public Pallet(String id, String name, BigDecimal weight, BigDecimal basePrice) {
        super(id, name, weight, basePrice);
    }

    @Override
    public BigDecimal calculateFinalPrice() {
        return getWeight().multiply(getBasePrice()).setScale(2, RoundingMode.HALF_UP);
    }


}
