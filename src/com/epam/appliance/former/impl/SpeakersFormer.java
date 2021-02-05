package com.epam.appliance.former.impl;

import com.epam.appliance.former.ApplianceFormer;
import com.epam.appliance.product.Product;
import com.epam.appliance.product.Speakers;

import java.math.BigDecimal;

public enum SpeakersFormer implements ApplianceFormer {
    INSTANCE;

    @Override
    public Speakers formAppliance(String data) {
        String[] parameters = data.split(", ");
        int powerConsumption = Integer.parseInt(parameters[0].split("=")[1].strip());
        int numberOfSpeakers = Integer.parseInt(parameters[1].split("=")[1].strip());
        String frequencyRange = parameters[2].split("=")[1].strip();
        double cordLength = Double.parseDouble(parameters[3].split("=")[1].strip());
        BigDecimal price = new BigDecimal(parameters[4].split("=")[1].strip());

        return new Speakers(price, powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }
}
