package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.assets;

import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.api.Hazardous;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.core.WarehouseAsset;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ChemicalBarrel extends WarehouseAsset implements Hazardous {
    private final BigDecimal surchargeRate;

    public ChemicalBarrel(String id, String name, BigDecimal weight, BigDecimal basePrice, BigDecimal surchargeRate) {
        super(id, name, weight, basePrice);
        this.surchargeRate = surchargeRate;
    }

    @Override
    public BigDecimal getSurchargeRate() {
        return surchargeRate;
    }

    @Override
    public BigDecimal calculateFinalPrice() {
        return (getWeight().multiply(getBasePrice())).multiply(getSurchargeRate()).setScale(2, RoundingMode.HALF_UP);
    }
}
