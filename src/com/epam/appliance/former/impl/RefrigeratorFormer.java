package com.epam.appliance.former.impl;

import com.epam.appliance.former.ApplianceFormer;
import com.epam.appliance.product.Oven;
import com.epam.appliance.product.Product;
import com.epam.appliance.product.Refrigerator;

import java.math.BigDecimal;

public enum RefrigeratorFormer implements ApplianceFormer {
    INSTANCE;

    @Override
    public Refrigerator formAppliance(String data) {
        String[] parameters = data.split(", ");
        int powerConsumption = Integer.parseInt(parameters[0].split("=")[1].strip());
        double weight = Double.parseDouble(parameters[1].split("=")[1].strip());
        double freezerCapacity = Double.parseDouble(parameters[2].split("=")[1].strip());
        double overallCapacity = Double.parseDouble(parameters[3].split("=")[1].strip());
        double height = Double.parseDouble(parameters[4].split("=")[1].strip());
        double width = Double.parseDouble(parameters[5].split("=")[1].strip());
        BigDecimal price = new BigDecimal(parameters[6].split("=")[1].strip());

        return new Refrigerator(price, powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }
}
