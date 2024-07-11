package com.gmail.onishchenko.lessons.lesson16;


import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("I'm BeforeAll method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("I'm AfterAll method");
    }

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
        System.out.println("Created object: " + calculator.hashCode());
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each method running...");
    }

    @Test
    @DisplayName(value = "0! == 1")
    void zeroFactorial() {
        // given
        System.out.println("zeroFactorial");

        // when
        long result = calculator.factorial(0);

        // then
        Assertions.assertEquals(1, result);
    }


    @Test
    void oneFactorial() {
        // given
        System.out.println("oneFactorial");

        // when
        long result = calculator.factorial(1);

        // then
        Assertions.assertEquals(1, result);
    }

    @Test
    void positiveValue() {
        // given
        System.out.println("positiveValue");

        // when
        long result = calculator.factorial(3);

        // then
        Assertions.assertEquals(6, result);
    }


    @Test
    void negativeValue() {
        // given
        System.out.println("negativeValue");

        // when
        long result = calculator.factorial(-3);

        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Wrong test method. Just for illustration")
    @Disabled
    void testException() {
        Assertions.assertThrows(ArithmeticException.class, () ->  calculator.factorial(1));
    }
}
