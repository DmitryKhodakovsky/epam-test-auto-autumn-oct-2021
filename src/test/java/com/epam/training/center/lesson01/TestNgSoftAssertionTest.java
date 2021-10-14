package com.epam.training.center.lesson01;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgSoftAssertionTest extends CalculatorBaseTest {

    @Test
    public void testSoftAssertion() {
        SoftAssert softAssert = new SoftAssert();

        int res1 = calculator.sum(2, 3);
        softAssert.assertEquals(res1, 6);

        System.out.println("step 1 passed");

        int res2 = calculator.multiply(res1, 4);
        softAssert.assertEquals(res2, 20);

        System.out.println("step 2 passed");

        int res3 = calculator.sum(res2, 10);
        softAssert.assertEquals(res3, 30);

        System.out.println("step 3 passed");

        softAssert.assertAll();
    }
}
