Feature: UPGENIX Inventory Functionality feature
  User story:
  As a user: posmanager, I should be able to check and edit the Inventory of the company.

  Background: for the scenario for this feature file, user is expected to be logged in and be on
  the user home page (Inbox)
    Given User is logged in as "posmanager75@info.com" with password "posmanager" on the Inbox page

  @UPG10-476 @inventory
  Scenario: Verify that User can reach New Products Form by clicking Inventory --> Products --> Create
    When User clicks on Inventory menu item
    And User choose Products from the Master Data menu
    And User push button Create
    Then User is on the Products New page

  @UPG10-478 @inventory
  Scenario: Verify that if Product name field leaves blank, an error message "The following fields are invalid:"
  is appeared and Product Name input box is bordered in red color.
    When User clicks on Inventory menu item
    And User choose Products from the Master Data menu
    When User push button Create
    And User leaves Product Name field blank and clicks on the Save button
    Then the error message "The following fields are invalid:" is appeared
    And input box of Product Name bordered in red color

  @UPG10-479 @inventory
  Scenario: Verify that after creating a Product, the page title includes the Product name.
    When User clicks on Inventory menu item
    And User choose Products from the Master Data menu
    When User push button Create
    And put name of the product: "Test Product Item" in the product name input box
    And User clicks on the Save button
    Then page title would includes entered product name: "Test Product Item"

  @UPG10-480 @inventory
  Scenario: Verify that the user should be able to see created Product is listed after clicking the Products module.
    When User clicks on Inventory menu item
    And User choose Products from the Master Data menu
    When User enters "Test Product Item" in the search box and push Enter
    Then User see that created product is listed
