package com.epam.training.center.lesson06.tests;

import com.epam.training.center.lesson06.service.webdriver.WebDriverProvider;
import com.epam.training.center.lesson06.steps.ActionStep;
import com.epam.training.center.lesson06.steps.AssertionStep;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractBaseSeleniumTest {

    protected WebDriver driver;

    ActionStep actionStep;
    AssertionStep assertionStep;

    @BeforeMethod
    public void setUp(ITestContext testContext) {
        driver = WebDriverProvider.getDriver();

        // driver.manage().window().maximize();

        actionStep = new ActionStep(driver);
        assertionStep = new AssertionStep(driver);
        testContext.setAttribute("driver", driver);
    }

    @AfterMethod
    public void tearDown() {
        WebDriverProvider.closeDriver();
    }
}
