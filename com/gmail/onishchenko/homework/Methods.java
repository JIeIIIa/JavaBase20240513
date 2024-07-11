package com.gmail.onishchenko.homework;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("   -= 1 =-");
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int square = square(number);
        System.out.printf("The square of %d == %d", number, square);

        System.out.println("\n\n   -= 2 =-");
        System.out.println("Input a radius:");
        double radius = scanner.nextDouble();
        System.out.println("Input a height:");
        double height = scanner.nextDouble();
        scanner.nextLine();
        double volume = volume(radius, height);
        System.out.printf("The volume of a cylinder [radius = %.2f, height = %.2f] is %.4f", radius, height, volume);

        System.out.println("\n\n   -= 3 =-");
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = sum(numbers);
        System.out.println("The sum of all elements of the array is " + sum);


        System.out.println("\n\n   -= 4 =-");
        System.out.print("Enter a string: ");
        String message = scanner.nextLine();
        String reversedMessage = reverse(message);
        System.out.println("Reversed string: " + reversedMessage);
        reversedMessage = reverseV2(message);
        System.out.println("Reversed string (version 2): " + reversedMessage);

        System.out.println("\n\n   -= 5 =-");
        System.out.print("Input a base: ");
        int base = scanner.nextInt();
        System.out.print("Input a power: ");
        int power = scanner.nextInt();
        scanner.nextLine();
        int result = power(base, power);
        System.out.printf("The result of %d^%d is %d", base, power, result);

        System.out.println("\n\n   -= 6 =-");
        System.out.print("Input a message: ");
        String text = scanner.nextLine();
        System.out.print("\ntimes to repeat: ");
        int times = scanner.nextInt();
        repeat(text, times);
        scanner.nextLine();
    }

    public static int square(int number) {
        return number * number;
    }

    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        return sum;
    }

    public static String reverse(String message) {
        String reversed = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        return reversed;
    }

    public static String reverseV2(String message) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char tmp = chars[i];
            int rightPosition = chars.length - 1 - i;
            chars[i] = chars[rightPosition];
            chars[rightPosition] = tmp;
        }

        return new String(chars);
    }

    public static int power(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }

    public static void repeat(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
