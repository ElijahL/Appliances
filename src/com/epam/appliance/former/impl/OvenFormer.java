package com.epam.appliance.former.impl;

import com.epam.appliance.former.ApplianceFormer;
import com.epam.appliance.product.Oven;

import java.math.BigDecimal;

public enum OvenFormer implements ApplianceFormer {
    INSTANCE;

    @Override
    public Oven formAppliance(String data) {
        String[] parameters = data.split(", ");
        int powerConsumption = Integer.parseInt(parameters[0].split("=")[1].strip());
        int weight = Integer.parseInt(parameters[1].split("=")[1].strip());
        int capacity = Integer.parseInt(parameters[2].split("=")[1].strip());
        int depth = Integer.parseInt(parameters[3].split("=")[1].strip());
        double height = Double.parseDouble(parameters[4].split("=")[1].strip());
        double width = Double.parseDouble(parameters[5].split("=")[1].strip());
        BigDecimal price = new BigDecimal(parameters[6].split("=")[1].strip());

        return new Oven(price, powerConsumption, weight, capacity, depth, height, width);
    }
}
