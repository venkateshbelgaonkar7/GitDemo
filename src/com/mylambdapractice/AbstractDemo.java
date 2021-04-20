package com.mylambdapractice;

public class AbstractDemo {

    int cadence;
    int gear;
    int speed;
    int id;

    static int numberOfBicycles = 0;

    public AbstractDemo(int startCadence,
                 int startGear,
                 int startSpeed) {
        id += numberOfBicycles++;
    }



    protected int getId() {
        return id;
    }

    static {
        numberOfBicycles = 300;
    }

      static public int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public static void main(String[] args) {
        AbstractDemo ad = new AbstractDemo(10,20,30);

    }

}

