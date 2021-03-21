package com.epam.appliance.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Oven extends Appliance {
    int powerConsumption;
    int weight;
    int capacity;
    int depth;
    double height;
    double width;

    public Oven() {
    }

    public Oven(BigDecimal price,
                int powerConsumption,
                int weight,
                int capacity,
                int depth,
                double height,
                double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;
        Oven oven = (Oven) o;
        return getPowerConsumption() == oven.getPowerConsumption()
                && getWeight() == oven.getWeight()
                && getCapacity() == oven.getCapacity()
                && getDepth() == oven.getDepth()
                && Double.compare(oven.getHeight(), getHeight()) == 0
                && Double.compare(oven.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPowerConsumption(),
                getWeight(),
                getCapacity(),
                getDepth(),
                getHeight(),
                getWidth());
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                '}';
    }
}
