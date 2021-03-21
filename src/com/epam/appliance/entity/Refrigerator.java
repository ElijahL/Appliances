package com.epam.appliance.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Refrigerator extends Appliance{
    int powerConsumption;
    double weight;
    double freezerCapacity;
    double overallCapacity;
    double height;
    double width;

    public Refrigerator() {
    }

    public Refrigerator(BigDecimal price,
                        int powerConsumption,
                        double weight,
                        double freezerCapacity,
                        double overallCapacity,
                        double height,
                        double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Refrigerator refrigeratorObject = (Refrigerator) obj;
        return powerConsumption == refrigeratorObject.powerConsumption
                && Double.compare(refrigeratorObject.weight, weight) == 0
                && Double.compare(refrigeratorObject.freezerCapacity, freezerCapacity) == 0
                && Double.compare(refrigeratorObject.overallCapacity, overallCapacity) == 0
                && Double.compare(refrigeratorObject.height, height) == 0
                && Double.compare(refrigeratorObject.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPowerConsumption(),
                getWeight(),
                getFreezerCapacity(),
                getOverallCapacity(),
                getHeight(),
                getWidth());
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "price=" + price +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
