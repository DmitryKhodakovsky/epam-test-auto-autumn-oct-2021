package com.epam.training.center.lesson05.pure.java.steps;

import com.epam.training.center.lesson05.page.OzonCatalogItemPage;
import com.epam.training.center.lesson05.page.OzonComparePage;
import com.epam.training.center.lesson05.page.OzonHomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    protected OzonHomePage homePage;
    protected OzonCatalogItemPage catalogItemPage;
    protected OzonComparePage comparePage;

    protected AbstractStep(WebDriver driver) {
        homePage = new OzonHomePage(driver);
        catalogItemPage = new OzonCatalogItemPage(driver);
        comparePage = new OzonComparePage(driver);
    }

    @Step("Открыть домашнюю страницу Озон")
    public void openOzonHomePage() {
        homePage.open();
    }
}
