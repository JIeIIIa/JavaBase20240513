package com.gmail.onishchenko.lessons.lesson10;

public class StringDemo {
    public static void main(String[] args) {
        String line = "qwerty";
        System.out.println("Length of line is " + line.length());

        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }

        System.out.println("  -- Char array --");
        char[] charArray = line.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        line = line + "asd";
        System.out.println(line);
        line += "zxc";
        System.out.println(line);

        char[] chars = {'1', ' ', '-', ' ', 'f', 'i', 'r', 's', 't',};
        String anotherLine = new String(chars);
        System.out.println(anotherLine);

    }
}
