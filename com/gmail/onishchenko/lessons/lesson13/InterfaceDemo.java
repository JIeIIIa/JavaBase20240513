package com.gmail.onishchenko.lessons.lesson13;

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cat(),
                new Dog()
        };

        Human[] humans = {
                new Human(1),
                new Human(4),
                new Human(42)
        };

        for (Animal animal : animals) {
            animal.run();
        }

        for (Human human : humans) {
            human.run();
        }
    }
}
