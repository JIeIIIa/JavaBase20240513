package com.gmail.onishchenko.lessons.lesson13;

public class Human implements Runnable {
    private int number;

    public Human(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Human# " + number + " is running");
    }
}
