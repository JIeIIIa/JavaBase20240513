package com.gmail.onishchenko.lessons.lesson10;

public class Lecture10Demo {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        print(array);

        System.out.println();
        int length = 40;
        System.out.println("Length == " + length);

        double[] doubleArray = {1.2, 1.23456, 3.398475};
        print(doubleArray);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
        }
    }

//    private static void print(int[] intArray) {
//    }

    private static int length() {
        return 10;
    }
}
