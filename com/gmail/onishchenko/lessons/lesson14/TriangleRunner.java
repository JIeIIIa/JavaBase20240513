package com.gmail.onishchenko.lessons.lesson14;

public class TriangleRunner {
    public static void main(String[] args) {
//        staticNestedClasses();
        localInnerClasses();

    }

    private static void staticNestedClasses() {
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

        System.out.println();
        System.out.println(" -= Call some info from outer class");
        edges[0].outerInfo();
    }

    public static void localInnerClasses() {
        class BoldEdge extends Triangle.Edge {
            private int width = 10;

            public BoldEdge(int length, String color) {
                super(length, color);
            }


            public BoldEdge(int length, String color, int width) {
                super(length, color);
                this.width = width;
            }

            @Override
            public String toString() {
                return "BoldEdge{" +
                        "width=" + width +
                        '}';
            }
        }

        Triangle.Edge[] edges = {
                new BoldEdge(1, "green"),
                new BoldEdge(4, "black", 12),
                new BoldEdge(2, "blue")
        };

        Triangle triangle = new Triangle(edges);
        System.out.println(triangle);
    }
}
