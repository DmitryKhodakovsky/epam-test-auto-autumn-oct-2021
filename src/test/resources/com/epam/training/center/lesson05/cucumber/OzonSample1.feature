Feature: Ozon search 1

  @smoke
  Scenario: Search product 1
    Given I open Ozon Home page
    When I type 'iPhone' in the Search field in the header
    And I click 'Search' button in the header
    Then search results product titles should contain 'Apple' on the Search Results page
