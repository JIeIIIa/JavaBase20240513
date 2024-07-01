package com.gmail.onishchenko.lessons.lesson13;

public interface Runnable {
    String SOME_FIELD = "another value";

    void run();

    default void runSlow() {
        System.out.println("Run slow (");
    }

    default void method(Cat cat) {
        System.out.println("call method: " + cat);
    }
}
