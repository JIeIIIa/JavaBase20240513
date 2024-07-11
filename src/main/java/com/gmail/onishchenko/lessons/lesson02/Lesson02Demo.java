package com.gmail.onishchenko.lessons.lesson02;

public class Lesson02Demo {
    public static void main(String[] args) {
        System.out.print("My value ");
//        myFirstVariable ;
        byte myFirstVariable = -128,
                second = 1,
                age = 20,
                empty;

        byte result = (byte) (myFirstVariable - second);
        System.out.print("result is ");
        System.out.println(result);

        byte byteResult = 12 + 10;
        System.out.println("byteResult = " + byteResult);


        System.out.println(myFirstVariable);

        empty = 0;

        short zero = 0;

        int a = 10;
        int b = 25;
//        int result = a + b;

        long length = 123456789L;
        length = length * a;

        System.out.print("Length = ");
        System.out.println(length);

        length = b / a;
        System.out.print("Length = ");
        System.out.println(length);


        length = 010;
        System.out.print("Length = ");
        System.out.println(length);

        int binary = 0b1001;
        System.out.println("binary = " + binary);

        int hex = 0xF;
        System.out.println("hex = " + hex);


        char ch = 'f';
        System.out.println(ch);

        int c = ch;
        System.out.println("c = " + c);

        ch = (char) (ch + 1);
        System.out.println(ch);

        a = 1;
        a = a + 1823;
        a += 1823;

        a = 123;
        a += 1;
        a++;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);

        a--;


        double d = 123.123456789;
        System.out.println("d = " + d);

        float f = 123.123456789F;
        System.out.println("f = " + f);

        f = 0.1F;
        f *= 10;

        float f2 = 0.1F;
        f2 += 0.1F;
        f2 += 0.1F;
        f2 += 0.1F;
        f2 += 0.1F;
        f2 += 0.1F;
        f2 += 0.1F;
        f2 += 0.1F;
        f2 += 0.1F;
        f2 += 0.1F;

        System.out.println(f + " ?? " + f2);

    }
}
