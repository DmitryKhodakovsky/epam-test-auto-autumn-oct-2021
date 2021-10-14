package com.epam.training.center.lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class CalculatorBaseTest {

    protected Calculator calculator;

    @BeforeSuite
    public void setUpSuite() {
        System.out.println(CalculatorBaseTest.class.getSimpleName() + " before suite");
        System.out.println();
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println(this.getClass().getSimpleName() + " before class");
        System.out.println();
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("before method");
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("after method");
        System.out.println();
        calculator = null;
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println(this.getClass().getSimpleName() + " after class");
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println(CalculatorBaseTest.class.getSimpleName() + " after suite");
        System.out.println();
    }
}
