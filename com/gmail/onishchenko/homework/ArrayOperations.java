package com.gmail.onishchenko.homework;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = {86, 48, -22};
//        int[] array = new int[30];
//        fillArray(array);
        print(array);

        System.out.println("Sum of negative elements is " + negativeElementsSum(array));

        System.out.print("Even elements count: ");
        int even = calculateEvenCount(array);
        System.out.println(even);
        System.out.print("Odd elements count: ");
        int odd = array.length - even;
        System.out.println(odd);

        int maxPosition = findMaxPosition(array);
        System.out.printf("Max element == %d (at position %d)\n", array[maxPosition], maxPosition);

        int minPosition = findMinPosition(array);
        System.out.printf("Min element == %d (at position %d)\n", array[minPosition], minPosition);

        int index = findFirstNegativePosition(array);
        System.out.println("Found index: " + index);
        if (index >= array.length) {
            System.out.println("Array does not contain negative elements");
        } else if ( index == array.length - 1) {
            System.out.println("Average is not defined");
        } else {
            double average = average(array, index);
            System.out.printf("Average is %.3f", average);
        }
    }

    private static double average(int[] array, int index) {
        int sum = 0;

        for (int i = index + 1; i < array.length; i++) {
            sum += array[i];
        }
        int count = array.length - index - 1;
        return (double) sum / count ;
    }

    private static int findFirstNegativePosition(int[] array) {
        int index = 0;
        while (index < array.length && array[index] >= 0) {
            index++;
        }

        return index;
    }

    private static int findMinPosition(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[index]) {
                index = i;
            }
        }

        return index;
    }

    private static int findMaxPosition(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[index]) {
                index = i;
            }
        }
        return index;
    }

    private static int calculateEvenCount(int[] array) {
        int even = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    private static int negativeElementsSum(int[] array) {

        int sum = 0;
        for (int element : array) {
            if (element < 0) {
                sum += element;
            }
        }

        return sum;
    }

    private static void print(int[] array) {
        System.out.println("Random array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomValue = ThreadLocalRandom.current().nextInt(-100, 101);
            array[i] = randomValue;
        }
    }
}
