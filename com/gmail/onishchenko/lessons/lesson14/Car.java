package com.gmail.onishchenko.lessons.lesson14;

public class Car {
    private String brand = "BMW";
    private Engine engine;

    public Car() {
        this.engine = new Engine("default engine");
    }

    public void start() {
        System.out.println("Starting...");
        engine.enable();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }


    public class Engine {
        private String brand;

        public Engine(String brand) {
            this.brand = brand;
        }

        public void enable() {
            System.out.println("Engine [" + brand + "] in car [" + Car.this.brand + "] is enabled!");
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "brand='" + brand + '\'' +
                    "car='" + Car.this.toString() + '\'' +
                    '}';
        }
    }

}
