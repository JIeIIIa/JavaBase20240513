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

//        Pizza pizza = new Pizza(); // Pizza is abstract; cannot be instantiated

        printInfo(pizzas);

    }

    private static void printInfo(Pizza[] pizzas) {
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}
