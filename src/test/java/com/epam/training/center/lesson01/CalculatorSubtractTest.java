package com.epam.training.center.lesson01;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorSubtractTest extends CalculatorBaseTest {

    @Test
    public void subtract1Test() {
        System.out.println("subtract 2 - 2 test");
        int actual = calculator.subtract(2, 2);
        assertEquals(actual, 0);
    }

    @Test
    public void subtract2Test() {
        System.out.println("subtract 5 - 3 test");
        int actual = calculator.subtract(5, 3);
        assertEquals(actual, 2);
    }

    @Test
    public void subtract3Test() {
        System.out.println("subtract 10 - 3 test");
        int actual = calculator.subtract(10, 3);
        assertEquals(actual, 7);
    }
}
