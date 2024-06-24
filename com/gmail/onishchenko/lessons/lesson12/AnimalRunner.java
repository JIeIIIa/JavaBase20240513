package com.gmail.onishchenko.lessons.lesson12;

import com.gmail.onishchenko.lessons.lesson12.subpackage.Cat;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Garfild");
        cat.setColor("black");
        cat.setAge(1);
        System.out.printf("A(an) %s cat %s says: ", cat.getColor(), cat.getName());
        cat.say();

        Animal animal = cat;
        animal.say();
//        animal.getColor();
    }
}
