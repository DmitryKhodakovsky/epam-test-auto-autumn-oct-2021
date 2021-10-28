Feature: Ozon search

  @smoke
  Scenario: Search product
    Given I open Ozon Home page
    When I type 'iPhone' in the Search field in the header
    And I click 'Search' button in the header
    Then the page with 'iPhone' should be opened
    And search results product titles should contain 'Apple' on the Search Results page

  @regres
  Scenario: Search product
    Given I open Ozon Home page
    When I search 'iPhone 11' in the Search field in the header
    Then the page with 'iPhone 11' should be opened
    And search results product titles should contain 'Apple' on the Search Results page

  Scenario Outline: Search product
    Given I open Ozon Home page
    When I search <search_text> in the Search field in the header
    Then the page with '<search_text>' should be opened
    And search results product titles should contain 'Apple' on the Search Results page

    Examples:
      | search_text |
      | iPhone 11   |
      | iPhone 13   |
      | iPhone 8    |
      | iPhone 71   |
