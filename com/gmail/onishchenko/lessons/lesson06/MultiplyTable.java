package com.gmail.onishchenko.lessons.lesson06;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input limit");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(makeLine(i));
        }
    }

    public static String makeLine(int base) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += base * i + "\t";
        }

        return result;
    }


}
