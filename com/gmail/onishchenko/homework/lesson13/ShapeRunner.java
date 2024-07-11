package com.gmail.onishchenko.homework.lesson13;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(1),
                new Triangle(2, 3, Math.PI / 2),
                new Circle(10),
                new Square(0.5)
        };
        print(shapes);

        double totalArea = totalArea(shapes);
        System.out.printf("Total area  == %.3f", totalArea);
    }

    private static void print(Shape[] shapes) {
        System.out.println("==== SHAPES ======");
        for (Shape shape : shapes) {
            System.out.println("\t" + shape);
        }
        System.out.println("==================");
    }

    private static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }

        return sum;
    }
}
