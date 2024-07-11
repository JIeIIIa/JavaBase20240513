package com.gmail.onishchenko.lessons.lesson13;

import java.util.Arrays;

public class MargarittaPizza extends Pizza {
    public MargarittaPizza() {
        super("Margaritta");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding ingredients...");
        System.out.println("\ttomato");
        System.out.println("\tcheese");
    }
}
