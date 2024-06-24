package com.gmail.onishchenko.lessons.lesson12.subpackage;

import com.gmail.onishchenko.lessons.lesson12.Animal;

public class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("meow-meow");
    }

    public void info() {
        System.out.printf("I'm a %s. My name is %s. I'm %d years old\\n", color, name, getAge());
    }

//    public void say(String prefix) {
//        System.out.println(prefix + " meow-meow");
//    }
}

