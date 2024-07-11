package com.gmail.onishchenko.lessons.lesson05;

public class TernaryDemo {
    public static void main(String[] args) {
        int age = -20;
        String answer;
        if (age < 0) {
           answer = "error";
        } else if (age <= 18) {
            answer = "too young";
        } else {
            answer = "OK";
        }

        String ternaryAnswer = age > 18 ? (age > 0 ? "OK" : "error") : "too young"; // change at home


        System.out.println(answer);
        System.out.println(ternaryAnswer);

    }
}
