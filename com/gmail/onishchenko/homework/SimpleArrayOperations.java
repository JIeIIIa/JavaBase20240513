package com.gmail.onishchenko.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = readInt(scanner, 1, 50);
        int[] array = generate(size);

        System.out.println("Generated array:");
        print(array);

        insertionSort(array);
        System.out.println("Sorted array:");
        print(array);

        System.out.print("Enter a value to search: ");
        int value = scanner.nextInt();
        int position = binarySearch(array, value);
        if (position < 0) {
            System.out.printf("%d not found", value);
        } else {
            System.out.printf("%d was found at position %d", value, position);
        }
    }

    public static int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        return array;
    }

    public static int readInt(Scanner scanner, int min, int max) {
        while (true) {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= min && number < max) {
                    return number;
                }
            }
            scanner.nextLine();
        }
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
