package com.gmail.onishchenko.lessons.lesson12;

import com.gmail.onishchenko.lessons.lesson12.subpackage.Cat;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat = new Cat("Garfild", 1, "black");
        System.out.printf("A(an) %s cat %s says: \n", cat.getColor(), cat.getName());
        cat.say();

        System.out.println("toString() call:");
        System.out.println(cat);
        System.out.println("info() call:");
        cat.info();

        Animal animal = cat;
        animal.say();
//        animal.getColor();
    }
}
