package com.gmail.onishchenko.lessons.lesson06;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input limit");
        int limit = scanner.nextInt();

//        forExample01(limit);
//        forExample02(limit);
        whileExample(limit);
        doWhileExample(limit);
        System.out.println("The end");
    }

    private static void doWhileExample(int limit) {
        System.out.println("   DO-WHILE");
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.printf("%d\t", i * j);
                j++;
            } while (j <= 10);
            System.out.println();
            i++;
        } while (i <= limit);
        System.out.println();
        System.out.println();
    }

    private static void whileExample(int limit) {
        System.out.println("   WHILE");
        int i = 1;
        while (i <= limit) {
            int j = 1;
            while (j <= 10) {
                System.out.printf("%d\t", i * j);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        System.out.println();
    }

    private static void forExample02(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                continue;
            }
            String result = "";
            for (int j = 1; j <= 10; j++) {
                result += i * j + "\t";
            }
            System.out.println(result);
        }
        System.out.println("End of for loop");
    }

    private static void forExample01(int limit) {
        int i = 1;
        for (; ; ) {
            if (!(i <= limit)) {
                break;
            }
            String result = "";
            for (int j = 1; j <= 10; j++) {
                result += i * j + "\t";
            }
            System.out.println(result);
            i++;
        }
    }

}
