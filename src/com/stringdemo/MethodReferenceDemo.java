package com.stringdemo;


public class MethodReferenceDemo {

    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                printMessage();
//            }
//        });

        Thread t = new Thread(() -> printMessage());


    }

    public static void printMessage() {
        System.out.println("Hello");
    }




}

