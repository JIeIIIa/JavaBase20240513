package com.gmail.onishchenko.lessons.lesson13;

public class DiabloPizza extends Pizza {
    public DiabloPizza() {
        super("Diablo");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding ingredients...");
        System.out.println("\tchilly");
    }
}
