package com.epam.training.center.lesson05.cucumber.step;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Then;
import java.util.List;
import org.assertj.core.api.SoftAssertions;

public class AssertionStep extends AbstractBaseStep {

    @Then("the page with {string} should be opened")
    public void pageWithProductShouldBeOpened(String searchText) {
        var actualSearchResultMessage = catalogItemPage.getSearchResultMessageText();

        assertThat(actualSearchResultMessage)
            .as("Iphone was not found")
            .containsIgnoringCase(searchText);

        String[] s = actualSearchResultMessage.split(" ");
        int numberOfSearchedProducts = Integer.parseInt(s[s.length - 2]);

        assertThat(numberOfSearchedProducts)
            .as("products was not found")
            .isPositive();
    }

    @Then("search results product titles should contain 'Apple' on the Search Results page")
    public void searchResultsShouldContain() {
        List<String> productNames = catalogItemPage.getProductNames();

        SoftAssertions softAssertions = new SoftAssertions();
        productNames.forEach(productName ->
            softAssertions.assertThat(productName)
                          .as("Проверка что поисковый текст присутствует в заголовке продукта")
                          .contains("Apple"));
        softAssertions.assertAll();
    }
}
