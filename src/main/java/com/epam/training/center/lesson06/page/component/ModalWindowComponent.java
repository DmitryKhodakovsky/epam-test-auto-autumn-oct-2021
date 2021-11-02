package com.epam.training.center.lesson06.page.component;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.WebDriver;

public class ModalWindowComponent extends AbstractComponent {

    public ModalWindowComponent(WebDriver driver) {
        super(driver);
    }

    public void waitModalWindowIsInvisible() {
        wait.until(invisibilityOfElementLocated(xpath("//*[@class='Fvep']")));
    }

    public void clickToNavigateButton() {
        wait.until(visibilityOfElementLocated(xpath("//*[@class='Fvep']")))
            .findElement(xpath(".//div[text()='Перейти']")).click();
    }
}
