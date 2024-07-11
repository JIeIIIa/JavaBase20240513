package com.gmail.onishchenko.homework.lesson13;

public class Square implements Shape {
    private final double side;

    public Square(double radius) {
        this.side = radius;
    }

    @Override
    public double area() {
        return side * side / 2.0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
