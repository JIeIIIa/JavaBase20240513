package com.gmail.onishchenko.homework;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your profit: ");
        double profit = scanner.nextDouble();


        if (profit < 0) {
            System.out.println("Incorrect data (((");
            return;
        }

        double interestRate;
        if (profit < 10_000) {
            interestRate = 0.025;
        } else if (profit < 25_000) {
            interestRate = 0.043;
        } else {
            interestRate = 0.067;
        }

        double tax = profit * interestRate;
        System.out.printf("Your tax == %.2f", tax);

    }
}
