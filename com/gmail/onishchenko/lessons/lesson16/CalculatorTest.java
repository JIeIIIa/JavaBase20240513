package com.gmail.onishchenko.lessons.lesson16;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean result = zeroFactorial();
        printTestResult("zeroFactorial", result);

        result = oneFactorial();
        printTestResult("oneFactorial", result);
    }

    static boolean zeroFactorial() {
        Calculator calculator = new Calculator();

        long result = calculator.factorial(0);

        return result == 1;
    }


    static boolean oneFactorial() {
        Calculator calculator = new Calculator();

        long result = calculator.factorial(1);

        return result == 1;
    }

    static void printTestResult(String name, boolean result) {
        if (result) {
            System.out.println(name + " .... OK!");
        } else
            System.out.println(name + " .... FAILED!");
    }


}
