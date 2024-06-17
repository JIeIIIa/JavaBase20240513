package com.gmail.onishchenko.lessons.lesson10;

public class MathUtils {
    public static void main(String[] args) {
        byte i = 10;
        double d = 3.1415;

        System.out.println(add(i, i));
    }

    public static double add(int a, double b) {
        System.out.println("int double");
        return a + b;
    }


    public static double add(double a, int b) {
        System.out.println("double int");
        return a + b;
    }


    public static double add(double a, double b) {
        System.out.println("double double");
        return a + b;
    }


    public static double add(int a, int b) {
        System.out.println("int int");
        return a + b;
    }
}
