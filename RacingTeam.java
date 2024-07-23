package com.milewskiarkadiuszmodul12;

public class RacingTeam implements PoweredVehicle{

    Car car = new Car ("100 km", "opel", 4, 9.82);
    Bicycle bicycle = new Bicycle("12 kilometers", "Romet", 6, true);
    Motorcycle motorcycle = new Motorcycle("23 kilometers", "Yamaha", true, 4.84, new Engine("A typical bike", FuelType.DIESEL));
    PoweredVehicle[] vehicles = new PoweredVehicle[] {car, bicycle, motorcycle};


    @Override
    public void start() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void stop() {
    }
}
