package com.gmail.onishchenko.lessons.lesson06;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input limit");
        int limit = scanner.nextInt();

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
        System.out.println("The end");
    }

}
