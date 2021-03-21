package com.epam.appliance.former.impl;

import com.epam.appliance.former.ApplianceFormer;
import com.epam.appliance.entity.TabletPC;

import java.math.BigDecimal;

public class TabletPCFormer implements ApplianceFormer {

    @Override
    public TabletPC formAppliance(String data) {
        String[] parameters = data.split(", ");
        double batteryCapacity = Double.parseDouble(parameters[0].split("=")[1].strip());
        double displayInches = Double.parseDouble(parameters[1].split("=")[1].strip());
        int rom = Integer.parseInt(parameters[2].split("=")[1].strip());
        int flashMemoryCapacity = Integer.parseInt(parameters[3].split("=")[1].strip());
        String colour = parameters[4].split("=")[1].strip();
        BigDecimal price = new BigDecimal(parameters[5].split("=")[1].strip());

        return new TabletPC(price,
                batteryCapacity,
                displayInches,
                rom,
                flashMemoryCapacity,
                colour);
    }
}
