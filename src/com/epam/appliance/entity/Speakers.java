package com.epam.appliance.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Speakers extends Appliance {
    int powerConsumption;
    int numberOfSpeakers;
    String frequencyRange;
    double cordLength;

    public Speakers() {}

    public Speakers(BigDecimal price,
                    int powerConsumption,
                    int numberOfSpeakers,
                    String frequencyRange,
                    double cordLength) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        Speakers speakers = (Speakers) o;
        return getPowerConsumption() == speakers.getPowerConsumption()
                && getNumberOfSpeakers() == speakers.getNumberOfSpeakers()
                && Double.compare(speakers.getCordLength(), getCordLength()) == 0
                && Objects.equals(getFrequencyRange(), speakers.getFrequencyRange());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPowerConsumption(),
                getNumberOfSpeakers(),
                getFrequencyRange(),
                getCordLength());
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                ", price=" + price +
                '}';
    }
}
