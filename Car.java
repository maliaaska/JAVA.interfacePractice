package com.milewskiarkadiuszmodul12;

public class Car extends Engine implements Vehicle, PoweredVehicle {
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
        System.out.println("The car " + name + " started");
    }

    @Override
    public void turnOff() {
        System.out.println("The car made " + make + " kilometers and stopped." );
    }

    @Override
    public double getFuelConsumption(int kilometers) {
        System.out.println("The car burned " + consumption);
        return PoweredVehicle.super.getFuelConsumption(kilometers);
    }

    @Override
    public void drive() {
        System.out.println(" The best economic drive is when the car uses " + FuelType.LPG + " type of gasoline.");
    }

    @Override
    public void stop() {
        System.out.println(" The car stopped. there is nothing left to say.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", consumption=" + consumption +
                "} " + super.toString();
    }
}
