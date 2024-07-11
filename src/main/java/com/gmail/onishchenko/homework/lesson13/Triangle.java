package com.gmail.onishchenko.homework.lesson13;

public class Triangle implements Shape {
    private final double leftSide;
    private final double rightSide;
    private final double angle;

    public Triangle(double leftSide, double rightSide, double angle) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.angle = angle;
    }

    @Override
    public double area() {
        return rightSide * leftSide * Math.sin(angle) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "leftSide=" + leftSide +
                ", rightSide=" + rightSide +
                ", angle=" + angle +
                '}';
    }
}
