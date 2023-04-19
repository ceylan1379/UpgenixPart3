Feature: UPGENIX Inventory Functionality feature
  User story:
  As a user: posmanager, I should be able to check and edit the Inventory of the company.

  Background: for the scenario for this feature file, user is expected to be logged in and be on
  the user home page (Inbox)
    Given user is logged in as "posmanager75@info.com" with password "posmanager" on the UPGENIX Inbox page

  @UPG10-476 @smoke @inventory
  Scenario: Verify that User can reach New Products Form by clicking Inventory --> Products --> Create
    When user clicks on Inventory menu item
    And user choose Products from the Master Data menu
    And user push button Create
    Then user is on the Products New page

  @UPG10-478 @smoke @inventory
  Scenario: Verify that if Product name field leaves blank, an error message "The following fields are invalid:"
  is appeared and Product Name input box is bordered in red color.
    When user clicks on Inventory menu item
    And user choose Products from the Master Data menu
    When user push button Create
    And user leaves Product Name field blank and clicks on the Save button
    Then error message "The following fields are invalid:" is appeared
    And input box Product Name bordered in red color

  @UPG10-479 @smoke @inventory
  Scenario: Verify that after creating a Product, the page title includes the Product name.
    When user clicks on Inventory menu item
    And user choose Products from the Master Data menu
    When user push button Create
    And put the name of the product: "Test Product Item" in the product name input box
    And user clicks on the Save button
    Then page title includes entered product name: "Test Product Item"

  @UPG10-480 @smoke @inventory
  Scenario: Verify that the user should be able to see created Product is listed after clicking the Products module.
    When user clicks on Inventory menu item
    And user choose Products from the Master Data menu
    When user enters "Test Product Item" in the search box and push Enter
    Then user see that created product is listed
