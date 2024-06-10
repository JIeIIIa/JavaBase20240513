package com.gmail.onishchenko.homework;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayOperations {
    public static void main(String[] args) {
//        int[] array = {-86, -48, - 22};
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            int randomValue = ThreadLocalRandom.current().nextInt(-100, 101);
            array[i] = randomValue;
        }

        System.out.println("Random array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();


        System.out.println("Sum of negative elements:");
        int sum = 0;
        for (int element : array) {
            if (element < 0) {
                sum += element;
            }
        }
        System.out.println("sum == " + sum);


        System.out.print("Even elements count: ");
        int even = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                even++;
            }
        }
        System.out.println(even);


        System.out.print("Odd elements count: ");
        int odd = array.length - even;
        System.out.println(odd);

        System.out.print("Max element == ");
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                maxIndex = i;
                max = array[i];
            }
        }
        System.out.println(max + " (at position " + maxIndex + ")");

        System.out.print("Mim element == ");
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                minIndex = i;
                min = array[i];
            }
        }
        System.out.println(min + " (at position " + minIndex + ")");
    }
}
