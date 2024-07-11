package com.gmail.onishchenko.lessons.lesson16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void zeroFactorial() {
        // given
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(0);

        // then
        Assertions.assertEquals(1, result);
    }


    @Test
    void oneFactorial() {
        // given
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(1);

        // then
        Assertions.assertEquals(1, result);
    }

    @Test
    void positiveValue() {
        // given
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(3);

        // then
        Assertions.assertEquals(6, result);
    }


    @Test
    void negativeValue() {
        // given
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(-3);

        // then
        Assertions.assertEquals(0, result);
    }
}
