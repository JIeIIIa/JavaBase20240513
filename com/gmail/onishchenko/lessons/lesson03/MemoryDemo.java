package com.gmail.onishchenko.lessons.lesson03;

public class MemoryDemo {
    public static void main(String[] args) {
        int value = 42;
        String line = "line";
        String anotherLine = new String("line");
        line = line + " 123!";
        doSomething();
        System.out.println();
        System.out.println(line);
        System.out.println("The end");
    }

    public static void doSomething() {
        int value = 1000;
        String line = "qwerty";
    }
}
