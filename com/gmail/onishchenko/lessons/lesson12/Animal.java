package com.gmail.onishchenko.lessons.lesson12;

public class Animal {
    protected String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println("I can't say");
    }
}
