package com.epam.training.center.lesson01;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorSumTest extends CalculatorBaseTest {

    @Test
    public void sumTest() {
        System.out.println("sum 2 + 2 test");
        int actual = calculator.sum(2, 2);
        assertEquals(actual, 4);
    }
}
