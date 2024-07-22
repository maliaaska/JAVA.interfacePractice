package com.milewskiarkadiuszmodul12;

public class Car extends Engine implements PoweredVehicle {
    private String make;

    private String name;
    private int numberOfDoors;

    private double consumption;

    public Car ( String make, String name, int numberOfDoors, double consumption) {
        this.make = make;
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
    }

    public Car (String type, FuelType fuel, String make, String name, int numberOfDoors, double consumption) {
        super(type, fuel);
        this.make = make;
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
    }

    @Override
    public void start() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public double getFuelConsumption(int kilometers) {
        return PoweredVehicle.super.getFuelConsumption(kilometers);
    }
}
