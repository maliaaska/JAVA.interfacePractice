package com.milewskiarkadiuszmodul12;

public interface PoweredVehicle extends Vehicle {
    void start();
    void turnOff();

    default double getFuelConsumption(int kilometers) {
    //Using a private method in the interface.

        if (isFast(51)) {
            System.out.println(" The casr is reaaaaallly fast ");
        }

        return kilometers / 7.00;
    };

    static int getHorsePower ( int rpm, int torque) {
        return (rpm * torque) / 5252;
    };

    private static boolean isFast( int speed ) {
        if (speed < 50 ) {
            System.out.println("the car is slow");
            return false;
        }
        return true;
    }

    /*TODO
    Utwórz prywatne metody pomocnicze i wykorzystaj je w implementacji metod z interfejsów.
Koniecznie wykorzystaj pole isSportBike i engine.
     */
}
