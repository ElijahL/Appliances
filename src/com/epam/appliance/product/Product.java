package com.epam.appliance.product;

import java.math.BigDecimal;

public abstract class Product {
    // Never store money in double
    BigDecimal price;

    public Product() {
    }

    public Product(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
