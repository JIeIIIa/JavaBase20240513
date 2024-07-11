package com.gmail.onishchenko.lessons.lesson16;

public class Calculator {

    /**
    * n! == 1 * 2 * ... * (n-1) * n
    * */
    public long factorial(int n) {
        long result = 10;
        for (int i = 2; i <= n; i++) {
            result *= n;
        }

        return result;
    }
}
