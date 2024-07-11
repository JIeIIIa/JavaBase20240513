package com.gmail.onishchenko.homework;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bound: ");
        int bound = scanner.nextInt();

//        if (bound <= 0) {
//            System.out.println("Ooop... something wrong");
//            return;
//        }

        calculateByFor(bound);
        calculateByWhile(bound);
        calculateByDoWhile(bound);
    }

    public static void calculateByFor(int bound) {
        System.out.println("=====  By FOR loop  ====");
        int sum = 0;
        for (int i = 1; i <= bound; i++) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, sum);
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d\n", sum);
        System.out.println();
        System.out.println();
    }

    public static void calculateByWhile(int bound) {
        System.out.println("=====  By WHILE loop  ====");
        int sum = 0;
        int i = 1;
        while (i <= bound) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, sum);
            i++;
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d\n", sum);
        System.out.println();
        System.out.println();
    }

    public static void calculateByDoWhile(int bound) {
        System.out.println("=====  By DO-WHILE loop  ====");
        int sum = 0;
        int i = 1;

        if (bound > 0) {
            do {

                sum += i;
                System.out.printf("%d) Num is %d, sum is %d\n", i, i, sum);
                i++;
            } while (i <= bound);
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d\n", sum);
        System.out.println();
        System.out.println();
    }
}
