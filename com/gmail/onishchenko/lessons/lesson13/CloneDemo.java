package com.gmail.onishchenko.lessons.lesson13;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Foo foo = new Foo(42);
        Foo anotherObject = foo.clone();

        System.out.println("foo = " + foo);
        System.out.println("anotherObject = " + anotherObject);

        foo.bar.value = 1000;
        anotherObject.bar.value = -12345678;

        System.out.println("Changing Bar...");
        System.out.println("foo = " + foo);
        System.out.println("anotherObject = " + anotherObject);
    }
}

class Foo implements Cloneable {
    private int number;
    Bar bar;

    public Foo(int number) {
        this.number = number;
        this.bar = new Bar(number);
    }

    @Override
    public String toString() {
        return "Foo{" +
                "number=" + number +
                ", bar=" + bar +
                '}';
    }

    @Override
    protected Foo clone() throws CloneNotSupportedException {
        return (Foo) super.clone();
    }
}

class Bar {
    public int value;

    public Bar(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "value=" + value +
                '}';
    }
}
