package com.epam.appliance.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Laptop extends Appliance {
    double batteryCapacity;
    String os;
    int rom;
    int systemMemory;
    double cpu;
    double displayInches;

    public Laptop() {
    }

    public Laptop(BigDecimal price, double batteryCapacity, String os, int rom, int systemMemory, double cpu, double displayInches) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.rom = rom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) == 0
                && getRom() == laptop.getRom()
                && getSystemMemory() == laptop.getSystemMemory()
                && Double.compare(laptop.getCpu(), getCpu()) == 0
                && Double.compare(laptop.getDisplayInches(), getDisplayInches()) == 0
                && Objects.equals(getOs(), laptop.getOs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBatteryCapacity(),
                getOs(),
                getRom(),
                getSystemMemory(),
                getCpu(),
                getDisplayInches());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", rom=" + rom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                ", price=" + price +
                '}';
    }
}
