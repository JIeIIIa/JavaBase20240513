package com.gmail.onishchenko.homework.lesson12;

import java.util.concurrent.ThreadLocalRandom;

public class Car {
    public void start() throws InterruptedException {
        System.out.println("Staring...");
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car has been started");
    }

    public void stop() {
        System.out.println("All system are turned OFF");
    }

    private void startElectricity() throws InterruptedException {
        System.out.print("Electricity\t");
        for (int i = 0; i < 15; i++) {
            System.out.print(".");
            sleep();
        }
        System.out.println("\tREADY!");
    }

    private void startCommand() throws InterruptedException {
        System.out.print("Command\t\t");
        for (int i = 0; i < 15; i++) {
            System.out.print(".");
            sleep();
        }
        System.out.println("\tREADY!");
    }

    private void startFuelSystem() throws InterruptedException {
        System.out.print("Fuel system\t");
        for (int i = 0; i < 15; i++) {
            System.out.print(".");
            sleep();
        }
        System.out.println("\tREADY!");
    }

    private void sleep() throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(50, 250));
    }
}

class CarRunner {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        System.out.println("Try to start the car");
        System.out.println();
        car.start();

        System.out.println();
        System.out.println("Try to stop the car");
        car.stop();
    }
}
