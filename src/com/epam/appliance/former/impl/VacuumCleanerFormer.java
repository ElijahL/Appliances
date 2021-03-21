package com.epam.appliance.former.impl;

import com.epam.appliance.former.ApplianceFormer;
import com.epam.appliance.entity.VacuumCleaner;

import java.math.BigDecimal;

public class VacuumCleanerFormer implements ApplianceFormer {

    @Override
    public VacuumCleaner formAppliance(String data) {
        String[] parameters = data.split(", ");

        double powerConsumption = Double.parseDouble(parameters[0].split("=")[1].strip());
        String filterType = parameters[1].split("=")[1].strip();
        String bagType = parameters[2].split("=")[1].strip();
        String wandType = parameters[3].split("=")[1].strip();
        int motorSpeedRegulation = Integer.parseInt(parameters[4].split("=")[1].strip());
        double cleaningWidth = Double.parseDouble(parameters[5].split("=")[1].strip());
        BigDecimal price = new BigDecimal(parameters[6].split("=")[1].strip());

        return new VacuumCleaner(price,
            powerConsumption,
            filterType,
            bagType,
            wandType,
            motorSpeedRegulation,
            cleaningWidth);
    }
}
