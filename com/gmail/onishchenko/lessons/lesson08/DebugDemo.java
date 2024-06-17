package com.gmail.onishchenko.lessons.lesson08;

public class DebugDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

        greeting(args);
    }

    public static void greeting(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, UNKNOWN USER");
        } else {
            System.out.println("Hello, " + args[0]);
        }
    }
}
