package com.epam.training.center.lesson06.page.component;

import static org.openqa.selenium.By.partialLinkText;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.WebDriver;

public class CatalogComponent extends AbstractComponent {

    public CatalogComponent(WebDriver driver) {
        super(driver);
    }

    public void openCategory(final String categoryName) {
        var categoryLink = wait.until(visibilityOfElementLocated(partialLinkText(categoryName)));
        actions.moveToElement(categoryLink).perform();
    }

    public void openSubcategory(final String subcategoryName) {
        wait.until(visibilityOfElementLocated(partialLinkText(subcategoryName))).click();
    }
}
