package com.gmail.onishchenko.lessons.lesson13;

public class Human implements Runnable, Writable {
    private int number;

    public Human(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Human# " + number + " is running");
    }

    @Override
    public void write() {
        System.out.println("Writing something...");
    }
}
