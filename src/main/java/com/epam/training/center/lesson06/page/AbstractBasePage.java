package com.epam.training.center.lesson06.page;

import com.epam.training.center.lesson06.page.component.AbstractComponent;
import com.epam.training.center.lesson06.page.component.CatalogComponent;
import com.epam.training.center.lesson06.page.component.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class AbstractBasePage extends AbstractComponent {

    private static final String BASE_URL = "https://ozon.ru";

    protected HeaderComponent header;

    protected AbstractBasePage(WebDriver driver) {
        super(driver);
        header = new HeaderComponent(driver);
    }

    public CatalogComponent openCatalog() {
        return header.openCatalog();
    }

    public void sendKeysToSearchInputField(String searchText) {
        header.sendKeysToSearchInputField(searchText);
    }

    public void clickToSearchButton() {
        header.clickToSearchButton();
    }

    protected void open(String url) {
        driver.navigate().to(BASE_URL + url);
    }
}
