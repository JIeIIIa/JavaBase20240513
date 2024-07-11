package com.gmail.onishchenko.lessons.lesson14;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Car.Engine engine = car.new Engine("fast engine");
        System.out.println("Created engine is " + engine);
        car.setEngine(engine);
        car.start();


    }
}

