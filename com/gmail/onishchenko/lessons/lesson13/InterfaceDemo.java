package com.gmail.onishchenko.lessons.lesson13;

public class InterfaceDemo {
    public static void main(String[] args) {
        Runnable[] runners = {
                new Dog(),
                new Cat(),
                new Human(1),
                new Cat(),
                new Human(4),
                new Dog(),
                new Human(42)
        };

        for (Runnable runner : runners) {
            runner.run();
        }
    }
}
