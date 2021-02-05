package com.epam.appliance.former.impl;

import com.epam.appliance.former.ApplianceFormer;
import com.epam.appliance.product.Laptop;

import java.math.BigDecimal;

public enum LaptopFormer implements ApplianceFormer {
    INSTANCE;

    @Override
    public Laptop formAppliance(String data) {
        String[] parameters = data.split(", ");
        double batteryCapacity = Double.parseDouble(parameters[0].split("=")[1].strip());
        String os = parameters[1].split("=")[1].strip();
        int rom = Integer.parseInt(parameters[2].split("=")[1].strip());
        int systemMemory = Integer.parseInt(parameters[3].split("=")[1].strip());
        double cpu = Double.parseDouble(parameters[4].split("=")[1].strip());
        double displayInches = Double.parseDouble(parameters[5].split("=")[1].strip());
        BigDecimal price = new BigDecimal(parameters[6].split("=")[1].strip());

        return new Laptop(price, batteryCapacity, os, rom, systemMemory, cpu, displayInches);
    }
}
