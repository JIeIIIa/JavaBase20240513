package com.gmail.onishchenko.lessons.lesson05;


import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        int b = 10;
//        int a = 20;
        scanner.nextLine();
        String line = scanner.nextLine();
        System.out.println("Line was: '" + line + "'");

        System.out.println("    IF-ELSE-IF");
        if (a == 10 || a == 20) {
            System.out.println("Good number");
            System.out.println("Do something)");
        } else if ((a == 13) && (b % 2 == 0)) {
            System.out.println("not so good");
        } else {
            System.out.println("Don't know");
        }


// !(a == 10 | a == 20) ==
// (!(a == 10) & (!(a == 20))) ==
// a != 10 & a != 20

// a == !!a

        if (!(b % 2 == 0)) {
            System.out.println("mod is ZERO");
        }


        System.out.println();
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


        System.out.println();
        System.out.println("    SWITCH with String");
        String answer = "!";
        switch (answer) {
            case "ok":
                System.out.println("All fine");
                break;
            case "bad":
                System.out.println("not so good");
                break;
//            case '!': // ERROR: char cannot be converted to java.lang.String
        }

    }

}
