package com.epam.training.center.lesson05.pure.java.tests;

import com.epam.training.center.lesson05.pure.java.steps.ActionStep;
import com.epam.training.center.lesson05.pure.java.steps.AssertionStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class AbstractBaseSeleniumTest {

    protected WebDriver driver;

    ActionStep actionStep;
    AssertionStep assertionStep;

    @BeforeSuite
    public void setUpSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp(ITestContext testContext) {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        actionStep = new ActionStep(driver);
        assertionStep = new AssertionStep(driver);
        testContext.setAttribute("driver", driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
