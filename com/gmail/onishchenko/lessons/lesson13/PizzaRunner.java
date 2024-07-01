package com.gmail.onishchenko.lessons.lesson13;

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza[] pizzas = {
                new Pizza("Margaritta", new String[]{"tomato", "cheese"}),
                new Pizza("Diablo", new String[]{"chilly"})
        };

        for (Pizza pizza : pizzas) {
            pizza.make();
        }
    }
}
