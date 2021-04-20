package com.mylambdapractice;

public class Hero extends AbstractDemo{


    public Hero(int startCadence, int startGear, int startSpeed) {
        super(startCadence, startGear, startSpeed);
    }


    public static void main(String[] args) {
        Hero h = new Hero(300, 400, 500);
        System.out.println(Hero.getNumberOfBicycles());

    }
}
