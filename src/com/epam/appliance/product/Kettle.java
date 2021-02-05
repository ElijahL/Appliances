package com.epam.appliance.product;

import java.math.BigDecimal;

public class Kettle extends Product {
    int powerConsumption;
    int weight;
    String filter;
    String bodyMaterial;
    int capacity;
    double height;
    double width;

    public Kettle(BigDecimal price,
                  int powerConsumption,
                  int weight,
                  String filter,
                  String bodyMaterial,
                  int capacity,
                  double height,
                  double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.filter = filter;
        this.bodyMaterial = bodyMaterial;
        this.capacity = capacity;
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

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
    public String toString() {
        return "Kettle{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", filter='" + filter + '\'' +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", capacity=" + capacity +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                '}';
    }
}
