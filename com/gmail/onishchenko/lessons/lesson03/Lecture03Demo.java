package com.gmail.onishchenko.lessons.lesson03;

public class Lecture03Demo {
    public static void main(String[] args) {
        boolean flag = true;
        flag = false;


//        flag = (boolean) 10;

        char ch = '4';
        System.out.println(ch);
        ch = 52;
        System.out.println(ch);
        ch = '\u0034';
        System.out.println(ch);

        String line = "I'm a line";
        System.out.println(line);
        line = "No, I'm a String";
        System.out.println(line);
        line = line + "!!!";
        System.out.println(line);


        int a = 42;
        int b = 10;
        line = "Answer: 42 + 10 = " + (42 + 10);
        System.out.println(line);

        int result = 42 + 100;
        double d = 1.234567;
        System.out.printf("%s#2:\t42 + 10 = %05d\n", "Answer", result);
//        System.out.println();
        System.out.printf("Double is %.2f", d);

        System.out.println("The END");

    }
}
