package com.epam.appliance.entity;

import java.math.BigDecimal;

public abstract class Appliance {
    BigDecimal price;

    public Appliance() {
    }

    public Appliance(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
