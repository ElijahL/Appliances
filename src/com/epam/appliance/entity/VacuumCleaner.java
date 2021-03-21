package com.epam.appliance.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class VacuumCleaner extends Appliance {
    double powerConsumption;
    String filterType;
    String bagType;
    String wandType;
    int motorSpeedRegulation;
    double cleaningWidth;

    public VacuumCleaner(){}

    public VacuumCleaner(BigDecimal price,
                         double powerConsumption,
                         String filterType,
                         String bagType,
                         String wandType,
                         int motorSpeedRegulation,
                         double cleaningWidth) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.getPowerConsumption(), getPowerConsumption()) == 0
                && getMotorSpeedRegulation() == that.getMotorSpeedRegulation()
                && Double.compare(that.getCleaningWidth(), getCleaningWidth()) == 0
                && Objects.equals(getFilterType(), that.getFilterType())
                && Objects.equals(getBagType(), that.getBagType())
                && Objects.equals(getWandType(), that.getWandType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPowerConsumption(),
                getFilterType(),
                getBagType(),
                getWandType(),
                getMotorSpeedRegulation(),
                getCleaningWidth());
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "price=" + price +
                ", powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
