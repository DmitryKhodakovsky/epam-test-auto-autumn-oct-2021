package com.epam.training.center.lesson06.service.webdriver;

import com.epam.training.center.lesson06.service.exception.IllegalBrowserNameException;
import com.epam.training.center.lesson06.service.exception.WebDriverLaunchTypeException;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.MalformedURLException;
import java.net.URL;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class WebDriverFactory {

    private static final String LOCAL_LAUNCH = "local";
    private static final String REMOTE_LAUNCH = "remote";

    public static WebDriver createWebDriver(final String launchType, final Browser browser) {
        WebDriver driver;
        if (LOCAL_LAUNCH.equalsIgnoreCase(launchType)) {
            driver = createLocalWebDriver(browser);
        } else if (REMOTE_LAUNCH.equalsIgnoreCase(launchType)) {
            driver = createRemoteWebDriver(browser);
        } else {
            throw new WebDriverLaunchTypeException();
        }
        return driver;
    }

    // LOCAL

    private static WebDriver createLocalWebDriver(final Browser browser) {
        WebDriver driver;
        switch (browser) {
            case CHROME:
                driver = createChromeDriver();
                break;

            case FIREFOX:
                driver = createFirefoxDriver();
                break;

            default:
                throw new IllegalBrowserNameException();
        }
        return driver;
    }

    private static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static WebDriver createFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    // REMOTE

    private static WebDriver createRemoteWebDriver(final Browser browser) {
        Capabilities capabilities;
        switch (browser) {
            case CHROME:
                capabilities = createChromeCapabilities();
                break;

            case FIREFOX:
                capabilities = createFirefoxCapabilities();
                break;

            default:
                throw new IllegalBrowserNameException();
        }

        WebDriver driver;
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
        return driver;
    }

    private static Capabilities createChromeCapabilities() {
        return new ChromeOptions();
    }

    private static Capabilities createFirefoxCapabilities() {
        return new FirefoxOptions();
    }
}
