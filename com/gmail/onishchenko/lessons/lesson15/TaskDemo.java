package com.gmail.onishchenko.lessons.lesson15;

public class TaskDemo {
    public static void main(String[] args) {
        String status = new String("TODO");
        status = status.intern();
        status = null;
        status = "qwerty";
//        String status = "TODO";
        Task myFirstTask = new Task(status, "Learn Java");

        System.out.println(myFirstTask);
    }
}
