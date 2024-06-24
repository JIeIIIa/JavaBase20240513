package com.gmail.onishchenko.lessons.lesson12.subpackage;

import com.gmail.onishchenko.lessons.lesson12.Animal;

public class Cat extends Animal {
    private String name;
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void say() {
        System.out.print("My parent says: ");
        super.say();
        System.out.println("but I say: ");
        System.out.println("meow-meow");
    }

    public void info() {
        System.out.printf("I'm a %s. My name is %s. I'm %d years old\\n", color, name, getAge());
    }

    @Override
    public String toString() {
        return String.format("I'm a %s. My name is %s. I'm %d years old\n", color, super.name, getAge());
    }

//    public void say(String prefix) {
//        System.out.println(prefix + " meow-meow");
//    }
}

