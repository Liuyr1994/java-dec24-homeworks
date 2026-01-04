package ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model;

import java.math.BigDecimal;

public interface Taxable {
    BigDecimal calculateTax(BigDecimal price);
}
