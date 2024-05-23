package com.gmail.onishchenko.lessons.lesson04;

public class Lesson04Demo {
    public static void main(String[] args) {
        String greeting = "Hello World! My name is Oleksii";

        int a = 42;
        int b = -a;
        System.out.println("a is " + a);
        System.out.println("-a is " + b);

        System.out.println("|b| = " + Math.abs(b));

        b = 10;
        System.out.println("42 % 10 is " + b); // 42 - (42 / 10) * 10 == 42 - 4 * 10 == 2
        int result = 10 % 42;
        System.out.println("10 % 42 is " + result);

//        a = a + 10;
        a += 10;
        System.out.println("a = " + a);
        a = a + 1;
        a += 1;
        a = 10;
        a++;  // post-increment
        System.out.println("post-increment: " + a);
        a = 10;
        ++a;  // pre-increment
        System.out.println("pre-increment: " + a);

        a = 10;
        result = ++a;
        System.out.println("pre-increment: " + result);

        a = 10;
        result = a++ + 100;
        System.out.println("post-increment: " + result);
        System.out.println("post-increment (a): " + a);

    }
}
