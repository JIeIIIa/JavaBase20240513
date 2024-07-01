package com.gmail.onishchenko.lessons.lesson13;

import java.util.Arrays;

public class Pizza {
    private String name;
    private String[] ingredients;

    public Pizza(String name, String[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;

    }

    public void make() {
        System.out.println("Making a pizza: " + name);
        System.out.println("Adding ingredients..." + Arrays.toString(ingredients));

    }
}


