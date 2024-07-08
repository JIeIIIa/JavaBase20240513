package com.gmail.onishchenko.lessons.lesson15;

public class TaskDemo {
    public static void main(String[] args) {
        String status = new String("TODO");
        status = status.intern();
        status = null;
        status = "qwerty";
//        String status = "TODO";


        Status correctStatus = Status.DONE;
        Task myFirstTask = new Task(correctStatus, "Learn Java");

        System.out.println(myFirstTask);
        System.out.println("Estimation: " + myFirstTask.estimate());

        System.out.println("Status as String: " + correctStatus.name());

        status = "DONE";
        Status newStatus = Status.valueOf(status);
        System.out.println("New status is " + newStatus);

        newStatus.run();
    }

}
