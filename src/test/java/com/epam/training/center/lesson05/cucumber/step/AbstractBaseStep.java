package com.epam.training.center.lesson05.cucumber.step;

import com.epam.training.center.lesson05.cucumber.context.TestContext;
import com.epam.training.center.lesson05.page.OzonCatalogItemPage;
import com.epam.training.center.lesson05.page.OzonHomePage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractBaseStep {

    protected OzonHomePage homePage;
    protected OzonCatalogItemPage catalogItemPage;

    public AbstractBaseStep() {
        // homePage = new OzonHomePage(CucumberHooks.driver);
        // catalogItemPage = new OzonCatalogItemPage(CucumberHooks.driver);

        // WebDriver driver = TestContext.getInstance().getObject("driver");
        WebDriver driver = TestContext.getInstance().getObject("driver", WebDriver.class);
        homePage = new OzonHomePage(driver);
        catalogItemPage = new OzonCatalogItemPage(driver);
    }
}
