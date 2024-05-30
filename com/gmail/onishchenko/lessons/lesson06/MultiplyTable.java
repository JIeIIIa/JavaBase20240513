package com.gmail.onishchenko.lessons.lesson06;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input limit");
        int limit = scanner.nextInt();

        if (limit >= 1) {
            System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
        }
        if (limit >= 2) {
            System.out.println("2\t4\t6\t8\t10\t12\t14\t16\t18\t20");
        }
        if (limit >= 3) {
            System.out.println("3\t6\t9\t12\t15\t18\t21\t24\t27\t30");
        }
        if (limit >= 4) {
            System.out.println("4\t8\t12\t16\t20\t24\t28\t32\t26\t40");
        }
    }


}
