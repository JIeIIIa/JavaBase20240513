package com.gmail.onishchenko.lessons.lesson13;

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza[] pizzas = {
                new MargarittaPizza(),
                new DiabloPizza()
        };

        for (Pizza pizza : pizzas) {
            pizza.make();
        }
    }
}
