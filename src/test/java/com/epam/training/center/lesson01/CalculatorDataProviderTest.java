package com.epam.training.center.lesson01;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorDataProviderTest extends CalculatorBaseTest {

    @DataProvider
    public Object[][] sumDataProvider() {
        return new Object[][] {
            {3, 2, 5},
            {5, 5, 10},
            {120, 300, 3045}
        };
    }

    @Test(dataProvider = "sumDataProvider")
    public void sumTest(int a, int b, int expected) {
        System.out.printf("sum %d + %d data provider test%n", a, b);
        int actual = calculator.sum(a, b);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "Subtract Data")
    public Object[][] subtractDataProvider() {
        return new Object[][] {
            {3, 2, 1},
            {5, 5, 0},
            {120, 300, -180}
        };
    }

    @Test(dataProvider = "Subtract Data")
    public void subtractTest(int a, int b, int expected) {
        System.out.printf("subtract %d - %d data provider test%n", a, b);
        int actual = calculator.subtract(a, b);
        assertEquals(actual, expected);
    }

    @Test(dataProviderClass = MultiplyDataProvider.class, dataProvider = "multiplyData")
    public void multiplyTest(int a, int b, int expected) {
        System.out.printf("multiply %d * %d data provider test%n", a, b);
        int actual = calculator.multiply(a, b);
        assertEquals(actual, expected);
    }
}
