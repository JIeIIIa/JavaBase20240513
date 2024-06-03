package com.gmail.onishchenko.lesson07;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Fibonacci {
    public static void main(String[] args) {
        int maxSize = 30;
        int elementCount = ThreadLocalRandom.current().nextInt(2, maxSize + 1);
        Random random = new Random();
        elementCount = random.nextInt(2, maxSize + 1);
        System.out.println("Random value: " + elementCount);
        elementCount = random.nextInt(2, maxSize + 1);
        System.out.println("Random value: " + elementCount);
//        long[] numbers = new long[elementCount];
//        numbers[0] = 1;
//        numbers[1] = 1;

        long[] numbers = {1, 1, 0, 0, 0};
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
