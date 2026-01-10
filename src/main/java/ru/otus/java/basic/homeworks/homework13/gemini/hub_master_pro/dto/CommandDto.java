package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.dto;

import java.math.BigDecimal;

public class CommandDto {
    private String action;
    private String id;
    private String type;
    private BigDecimal weight;
    private BigDecimal price;

    public CommandDto(String action, String id, String type, BigDecimal weight, BigDecimal price) {
        this.action = action;
        this.id = id;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public String getAction() {
        return action;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
