package com.gmail.onishchenko.lessons.lesson14;

import java.util.Arrays;

public class Triangle {
    private Edge[] sides;

    public Triangle(int a, int b, int c) {
        this.sides = new Edge[]{
                new Edge(a, "black"),
                new Edge(b, "black"),
                new Edge(c, "black")
        };
    }

    public Triangle(Edge[] sides) {
        if (sides.length != 3) {
            System.out.println("ERROR!!!");
        }
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + Arrays.toString(sides) +
                '}';
    }

    static class Edge {
        private int length;
        private String color;

        public Edge(int length, String color) {
            this.length = length;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "length=" + length +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}

