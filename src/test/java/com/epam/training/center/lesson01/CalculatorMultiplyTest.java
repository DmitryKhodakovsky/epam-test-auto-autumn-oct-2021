package com.epam.training.center.lesson01;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorMultiplyTest extends CalculatorBaseTest {

    @Test
    public void subtract1Test() {
        System.out.println("multiply 2 * 2 test");
        int actual = calculator.multiply(2, 2);
        assertEquals(actual, 4);
    }

    @Test
    public void subtract2Test() {
        System.out.println("multiply 5 * 3 test");
        int actual = calculator.multiply(5, 3);
        assertEquals(actual, 15);
    }

    @Test
    public void subtract3Test() {
        System.out.println("multiply 10 * 3 test");
        int actual = calculator.multiply(10, 3);
        assertEquals(actual, 30);
    }
}
