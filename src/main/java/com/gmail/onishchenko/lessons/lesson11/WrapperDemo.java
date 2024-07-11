package com.gmail.onishchenko.lessons.lesson11;

public class WrapperDemo {
    public static void main(String[] args) {
        int value = 1;
        Integer a = new Integer(1);
        Integer b = new Integer(42);
//        Integer b = null;
//        Integer result = new Integer(a.intValue() + b.intValue());
        Integer result = a + b;

        System.out.println(result);

        System.out.println(Integer.toBinaryString(value));
        System.out.println("int min value = " + Integer.MIN_VALUE);
        System.out.println("int max value = " + Integer.MAX_VALUE);
    }
}
