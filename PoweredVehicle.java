package com.milewskiarkadiuszmodul12;

public interface PoweredVehicle extends Vehicle {
    void start();
    void turnOff();

    default double getFuelConsumption(int kilometers) {
        return kilometers / 7.00;
    };

    static int getHorsePower ( int rpm, int torque) {
        return (rpm * torque) / 5252;
    };
}
