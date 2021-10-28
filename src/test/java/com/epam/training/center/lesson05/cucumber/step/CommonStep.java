package com.epam.training.center.lesson05.cucumber.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStep extends AbstractBaseStep {

    @Given("I open Ozon Home page")
    public void openOzonHomePage() {
        homePage.open();
    }

    @When("I type 'iPhone' in the Search field in the header")
    public void typeProductTitleInTheSearchField() {
        homePage.sendKeysToSearchInputField("iPhone");
    }

    @When("I click 'Search' button in the header")
    public void clickSearchButtonInTheHeader() {
        homePage.clickToSearchButton();
    }

    @When("^I search ([^\"]+) in the Search field in the header$")
    public void searchProduct(String searchText) {
        homePage.sendKeysToSearchInputField(searchText);
        homePage.clickToSearchButton();
    }

}
