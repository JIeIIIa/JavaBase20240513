package com.gmail.onishchenko.lesson07;

public class Fibonacci {
    public static void main(String[] args) {
        int elementCount = 30;
        long[] numbers = new long[elementCount];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        print(numbers);

    }

    public static void print(long[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
