package com.gmail.onishchenko.lessons.lesson06;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input limit");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            String result = "";
            for (int j = 1; j <= 10; j++) {
                result += i * j + "\t";
            }
            System.out.println(result);
        }
    }

}
