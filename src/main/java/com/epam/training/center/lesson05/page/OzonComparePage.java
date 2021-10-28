package com.epam.training.center.lesson05.page;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OzonComparePage extends AbstractBasePage {

    @FindBy(css = "div.d7n6")
    private List<WebElement> productTitleLinks;

    public OzonComparePage(WebDriver driver) {
        super(driver);
    }

    public List<String> getProductNames() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(productTitleLinks))
                   .stream()
                   .map(WebElement::getText)
                   .collect(Collectors.toList());
    }
}
