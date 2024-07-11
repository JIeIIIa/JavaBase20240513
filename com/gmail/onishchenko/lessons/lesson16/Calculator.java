package com.gmail.onishchenko.lessons.lesson16;

public class Calculator {

    /**
     * n! == 1 * 2 * ... * (n-1) * n
     */
    public long factorial(int n) {
        if (n < 0) {
            return 0;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
