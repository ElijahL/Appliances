package com.epam.appliance.former.impl;

import com.epam.appliance.former.ApplianceFormer;
import com.epam.appliance.product.Kettle;
import com.epam.appliance.product.Oven;
import com.epam.appliance.product.Product;

import java.math.BigDecimal;

public enum KettleFormer implements ApplianceFormer {
    INSTANCE;

    @Override
    public Kettle formAppliance(String data) {
        String[] parameters = data.split(", ");
        int powerConsumption = Integer.parseInt(parameters[0].split("=")[1].strip());
        int weight = Integer.parseInt(parameters[1].split("=")[1].strip());
        String filter = parameters[2].split("=")[1].strip();
        String bodyMaterial = parameters[3].split("=")[1].strip();
        int capacity = Integer.parseInt(parameters[4].split("=")[1].strip());
        double height = Double.parseDouble(parameters[5].split("=")[1].strip());
        double width = Double.parseDouble(parameters[6].split("=")[1].strip());
        BigDecimal price = new BigDecimal(parameters[7].split("=")[1].strip());

        return new Kettle(price, powerConsumption, weight, filter, bodyMaterial, capacity, height, width);
    }
}
