package com.epam.training.center.lesson04.tests;

import static io.qameta.allure.Allure.step;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class StepTest {
    @BeforeMethod
    public void setupWithoutName() {

    }

    @Test
    public void failureTest() {
        Assert.fail();
    }

    @Test
    public void testAllureReport() {}

    @Test(description = "Description for our super test")
    @Description("This is description for description")
    public void testWithDescription() {
        step("Our step");
    }
}
