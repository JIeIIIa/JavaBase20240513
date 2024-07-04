package com.gmail.onishchenko.lessons.lesson14;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);

        System.out.println();
        System.out.println(" -= Another triangle =-");
        Triangle.Edge[] edges = {
                new Triangle.Edge(1, "green"),
                new Triangle.Edge(4, "black"),
                new Triangle.Edge(2, "blue")
        };
        Triangle anotherTriangle = new Triangle(edges);
        System.out.println(anotherTriangle);
        edges[1] = new Triangle.Edge(-12345678, "white");
        System.out.println(anotherTriangle);
    }
}
