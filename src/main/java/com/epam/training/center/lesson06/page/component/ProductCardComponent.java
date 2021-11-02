package com.epam.training.center.lesson06.page.component;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCardComponent extends AbstractComponent {

    private final WebElement productCard;

    public ProductCardComponent(WebDriver driver, WebElement productCard) {
        super(driver);
        this.productCard = productCard;
    }

    public String getProductName() {
        return wait.until(visibilityOf(productCard.findElement(cssSelector(".tile-hover-target.bj5")))).getText()
                   .trim();
    }

    public void clickToAddToCompareButton() {
        new ModalWindowComponent(driver).waitModalWindowIsInvisible();
        wait.until(visibilityOf(productCard.findElement(cssSelector(".e3o0 ._2avF button")))).click();
        wait.until(visibilityOfElementLocated(xpath("//*[@qa-id='cell-title' and text()='Добавить в сравнение']")))
            .click();
    }
}
