package com.gmail.onishchenko.lessons.lesson13;

public class Cat extends Animal implements FastRunnable {
    @Override
    public void run() {
        System.out.println("Cat is running...");
    }

    @Override
    public void runVeryFast() {
        System.out.println("Cat is running (very, very fast)...");
    }

    @Override
    public String toString() {
        return "I'm a Cat";
    }
}
