package com.gmail.onishchenko.lessons.lesson05;

import java.sql.SQLOutput;

public class SwitchDemo {
    public static void main(String[] args) {
        int a = 20;

        System.out.println("    IF-ELSE-IF");
        if (a == 10) {
            System.out.println("Good number");
            System.out.println("Do something)");
        } else if (a == 20) {
            System.out.println("Good number");
            System.out.println("Do something)");
        } else if (a == 13) {
            System.out.println("not so good");
        } else {
            System.out.println("Don't know");
        }

        System.out.println("    SWITCH");
        switch (a) {
            case 10:
            case 20:
                System.out.println("Good number");
                System.out.println("Do something)");
                break;

            case 13:
                System.out.println("not so good");
                break;
            default:
                System.out.println("Don't know");
        }
    }

}
