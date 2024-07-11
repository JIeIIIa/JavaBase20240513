package com.gmail.onishchenko.homework;

public class Person {
    private String name;
    private String profession;
    private int age;

    public Person(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public void switchProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                '}';
    }
}


class PersonDemo {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", "Engineer", 30),
                new Person("Mary", "Teacher", 25),
                new Person("Bob", "Doctor", 35),
                new Person("Alice", "Architect", 28),
        };

        print(persons);

        System.out.println("\nAlice switches the profession...\n");
        persons[3].switchProfession("Designer");
        print(persons);
    }

    private static void print(Person[] persons) {
        System.out.println(" -= PERSONS =-");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}