package com.gmail.onishchenko.lessons.lesson16;

public class Calculator {

    /**
     * n! == 1 * 2 * ... * (n-1) * n == (n-1)! * n
     */
    public long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return n * factorial(n - 1);
    }
}
