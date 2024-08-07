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
            if (runner instanceof Dog) {
                runner.runSlow();
            } else if (runner instanceof FastRunnable) {
                ((FastRunnable) runner).runVeryFast();
            } else {
                runner.run();
            }
        }

        ((Writable) runners[2]).write();

        Human human = new Human(123);
        System.out.println(((Writable) human).SOME_FIELD);

        Dog dog = new Dog();
        System.out.println(dog.SOME_FIELD);
    }
}
