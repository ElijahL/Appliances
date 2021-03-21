package com.epam.appliance.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class TabletPC extends Appliance {
    double batteryCapacity;
    double displayInches;
    int rom;
    int flashMemoryCapacity;
    String colour;

    public TabletPC(){}

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.getBatteryCapacity(), getBatteryCapacity()) == 0
                && Double.compare(tabletPC.getDisplayInches(), getDisplayInches()) == 0
                && getRom() == tabletPC.getRom()
                && getFlashMemoryCapacity() == tabletPC.getFlashMemoryCapacity()
                && Objects.equals(getColour(), tabletPC.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBatteryCapacity(),
                getDisplayInches(),
                getRom(),
                getFlashMemoryCapacity(),
                getColour());
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
