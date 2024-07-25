package com.milewskiarkadiuszmodul12;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Sedan", FuelType.PETROL, "This is a racing car", "Maluch", 4, 5.25);
//        car.getFuelConsumption(326);
//        System.out.println(car);
//
//
//        Motorcycle motorcycle = new Motorcycle("good", "Kawasaki", true, 4.5, new Engine("This Moto has 2 strokes", FuelType.LPG));
//        System.out.println(motorcycle);
//        Engine engine1 = new Engine("3 strokes", FuelType.PETROL);
//        motorcycle.petrolCheck(engine1);
//
//        PoweredVehicle checkSpeed = new Motorcycle("I think quick", "CBR", true, 2.4, new Engine("3 strokes", FuelType.PETROL));
//        checkSpeed.drive();

        Car car = new Car("100km", "Opel", 4, 9.78);
        Bicycle bicycle = new Bicycle("24", "Giant", 5, true);
        Motorcycle motorcycle = new Motorcycle("152", "Yamaha", true, 4.5, new Engine("3 strokes", FuelType.LPG) );

        RacingTeam racingTeam = new RacingTeam() { car, bicycle, motorcycle };


    }

}