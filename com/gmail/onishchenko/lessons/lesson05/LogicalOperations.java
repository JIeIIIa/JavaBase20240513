package com.gmail.onishchenko.lessons.lesson05;

public class LogicalOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean result = a == b;
        System.out.println("Is equal: " + result);
        result = a != b;
        System.out.println("Not equal: " + result);

//       a < b
//       a > b
//       a <= b
//       a >= b

        boolean first = true;
        boolean second = false;
        result = first = second;
    }
}
