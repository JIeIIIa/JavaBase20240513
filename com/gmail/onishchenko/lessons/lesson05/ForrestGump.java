package com.gmail.onishchenko.lessons.lesson05;

public class ForrestGump {
    public static void main(String[] args) {
        int dangerLevel = 42;
        int menPower = 50;
        int highDander = 100;

        System.out.println("Men's poser is " + menPower);
        if (menPower > dangerLevel) {
            if (menPower > highDander) {
                System.out.println("!!! DANGER!!!");
            }
            System.out.println("Run, Forrest, run!!!");
        } else if (menPower > 0) {
            System.out.println("Be ready");
        } else {
            System.out.println("All FINE)");
        }


        System.out.println("The end");
    }
}
