package com.epam.training.center.lesson06.service.webdriver;

import java.util.Locale;
import java.util.Objects;
import org.openqa.selenium.WebDriver;

public final class WebDriverProvider {

    private static WebDriver driver;

    private WebDriverProvider() {
    }

    public static WebDriver getDriver() {
        if (Objects.isNull(driver)) {
            String launchType = System.getProperty("launch.type", "local");
            String browserName = System.getProperty("browser.name", "chrome");
            driver = WebDriverFactory.createWebDriver(launchType,
                Browser.valueOf(browserName.toUpperCase(Locale.ROOT)));
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
