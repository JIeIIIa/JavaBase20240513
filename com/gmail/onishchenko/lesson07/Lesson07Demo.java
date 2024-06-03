package com.gmail.onishchenko.lesson07;

public class Lesson07Demo {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 20;
        ages[1] = 20;
        ages[2] = 22;
        ages[3] = 20;

        double averageAge = (double) (ages[0] + ages[1] + ages[2] + ages[3]) / 4;
        System.out.println("Average age is: " + averageAge);
    }
}
