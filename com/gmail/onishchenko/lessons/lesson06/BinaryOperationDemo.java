package com.gmail.onishchenko.lessons.lesson06;

public class BinaryOperationDemo {
    public static void main(String[] args) {
        int a = 0b1110; // 14
        int b = 0b0110;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("and:");
        int result = a & b;  // 0b0110
        System.out.println("14 & 6 == " + result);
        System.out.println("result = " + Integer.toBinaryString(result));
        System.out.println();

        System.out.println("or:");
        result = a | b;  // 0b1110
        System.out.println("14 | 6 == " + result);
        System.out.println("result = " + Integer.toBinaryString(result));
        a = 0b0101;
        b = 0b1010;
        result = a | b; // 0b1111
        System.out.printf("%d | %d == %d\n", a, b, result);
        System.out.println("result = " + Integer.toBinaryString(result));
        System.out.println();


        System.out.println("xor:");
        a = 0b1101;
        b = 0b1010;
        result = a ^ b; // 0b0111
        System.out.printf("%d ^ %d == %d\n", a, b, result);
        System.out.println("result = " + Integer.toBinaryString(result));
        a = result;
        result = a ^ b;
        System.out.printf("%d ^ %d == %d\n", a, b, result);
        System.out.println("result = " + Integer.toBinaryString(result));
        System.out.println();

        a = 0b1101;
        result = ~a;
        System.out.printf("a = %32s\n", Integer.toBinaryString(a));
        System.out.printf("~%d == %d\n", a, result);
        System.out.println("result = " + Integer.toBinaryString(result));

        a = 14;
        result = a >>> 5;
        System.out.printf("a\t\t= %32s\n", Integer.toBinaryString(a));
        System.out.printf("result\t= %32s\n", Integer.toBinaryString(result));


        a = 14;
        result = a << 2;
        System.out.printf("a\t\t= %32s == %d\n", Integer.toBinaryString(a), a);
        System.out.printf("result\t= %32s == %d\n", Integer.toBinaryString(result), result);

        long tooLongNumber = 12_897_364_329L;
        System.out.println(tooLongNumber);
    }
}
