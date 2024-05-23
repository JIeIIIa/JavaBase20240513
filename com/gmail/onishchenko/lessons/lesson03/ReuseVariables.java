package com.gmail.onishchenko.lessons.lesson03;

public class ReuseVariables {
    public static void main(String[] args) {
        int value = 42;

        System.out.print("Value is ");
        System.out.println(value);

//        int anotherValue = 1000;
//        System.out.print("Another value is ");
//        System.out.println(anotherValue);

        value = 1000;

        System.out.print("Value is ");
        System.out.println(value);

        System.out.println("The end)");
    }
}
