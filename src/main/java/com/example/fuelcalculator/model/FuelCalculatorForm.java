package com.example.fuelcalculator.model;

public class FuelCalculatorForm {
    private double distance;
    private double fuelConsumption;
    private double fuelPrice;

    // Gettery i Settery
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }
}
