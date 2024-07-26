package com.milewskiarkadiuszmodul12;

public interface PoweredVehicle extends Vehicle {
    void start();
    void turnOff();

    //Using a private method in the interface.
    default double getFuelConsumption(int kilometers) {
        return 0;
    }

    static int getHorsePower ( int rpm, int torque) {
        return (rpm * torque) / 5252;
    };

    static boolean isFast( int speed ) {
        if (speed < 50 ) {
            System.out.println("the car is slow");
            return false;
        }
        return true;
    }

}
