package com.gmail.onishchenko.lessons.lesson13;

public abstract class Pizza {
    private String name;

    public Pizza() {
        System.out.println("Creating a default pizza...");
    }

    public Pizza(String name) {
        this.name = name;

    }

    public void make() {
        System.out.println("Making a pizza: " + name);
        addIngredients();
    }

    public abstract void addIngredients();
}


