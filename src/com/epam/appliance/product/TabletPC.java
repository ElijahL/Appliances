package com.epam.appliance.product;

import java.math.BigDecimal;

public class TabletPC extends Product {
    double batteryCapacity;
    double displayInches;
    int rom;
    int flashMemoryCapacity;
    String colour;

    public TabletPC(BigDecimal price,
                    double batteryCapacity,
                    double displayInches,
                    int rom,
                    int flashMemoryCapacity,
                    String colour) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.rom = rom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.colour = colour;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", rom=" + rom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
