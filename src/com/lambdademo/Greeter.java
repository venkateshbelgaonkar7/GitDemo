package com.lambdademo;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter obj = new Greeter();
        HelloWorldGreeting hwg = new HelloWorldGreeting();
        obj.greet(hwg); // Passing the implementation of a behaviour(greeting interface) to greet method
    }
}

interface MyLambda{

}