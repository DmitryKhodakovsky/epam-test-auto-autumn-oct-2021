package com.epam.training.center.lesson05.cucumber.hooks;

import com.epam.training.center.lesson05.cucumber.context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberHooks {

    private WebDriver driver;
    //    public static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        TestContext.getInstance().addObject("driver", driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
