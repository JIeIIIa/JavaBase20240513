package com.gmail.onishchenko.lessons.lesson14;

import java.util.Arrays;

public class Triangle {
    private int[] sides;

    public Triangle(int a, int b, int c) {
        this.sides = new int[]{a, b, c};
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + Arrays.toString(sides) +
                '}';
    }
}
