package com.interfacedemo;


import java.util.ArrayList;
import java.util.List;

interface Vehicle {
    String getBrand();
    String speedUp();
    String speedDown();

    default String horn() {
        return "Honking";
    }

    default String turnAlarmOn() {
        return "turning alarm on";
    }

    default String turnAlarmOff() {
        return "turning alarm off";
    }
}

class Car implements Vehicle {
    private String brand;


    Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "speeding up";
    }

    @Override
    public String speedDown() {
        return "speeding down";
    }
}

class Bike implements Vehicle {
    private String brand;

    public Bike(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String speedUp() {
        return "speeding up bike";
    }

    @Override
    public String speedDown() {
        return null;
    }
}


public class DefaultMethodInInterfaceDemo {
    public static void main(String[] args) {
       Vehicle car = new Car("bmw");
       Bike bike = new Bike("honda");
       System.out.println(car.getBrand());
       System.out.println(car.speedUp());
       System.out.println(car.speedDown());
       System.out.println(car.turnAlarmOn());
       System.out.println(car.turnAlarmOff());
        System.out.println(bike.horn());
    }
}
