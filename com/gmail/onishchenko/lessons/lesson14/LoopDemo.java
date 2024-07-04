package com.gmail.onishchenko.lessons.lesson14;

public class LoopDemo {
    public static void main(String[] args) {

        for (int i = 0, j = 0; i < 10 && j < 15; i++, j += 2) {
            System.out.println(i + "\t" + j);
        }
    }
}
