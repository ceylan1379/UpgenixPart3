@SalesFunctionality @UPG10-416
Feature: Sales Functionality

#AC 1.Verify that User can reach New Customer Form by clicking Sales --> Customers --> Create

#AC 2.Verify that if customer name field leaves blank, an error message "The following fields are invalid:" is appeared.

#AC 3. Verify that after creating a new customer, the page title includes the customer name.

#AC 4.Verify that the user should be able to see created customer is listed after clicking the Customers module.

  @AC1 @UPG10-482
  Scenario: Verify that User can reach New Customer Form by clicking Sales --> Customers --> Create
    Given user is logged in as a "posmanager12@info.com" with password "posmanager" on the UPGENIX home page
    When user clicks on a Sales and Customer and Create
    Then user should reach New Customer Form

  @AC2 @UPG10-483
  Scenario: Verify that if customer name field leaves blank, an error message "The following fields are invalid:" is appeared.
    Given user is logged in as a "posmanager12@info.com" with password "posmanager" on the UPGENIX home page
    And user clicks on a Sales and Customer and Create
    And user should reach New Customer Form
    Then customer name field leaves blank, an error message "The following fields are invalid:" is appeared.

  @AC3 @UPG10-484
  Scenario: Verify that after creating a new customer, the page title includes the customer name.
    Given user is logged in as a "posmanager12@info.com" with password "posmanager" on the UPGENIX home page
    And user clicks on a Sales and Customer and Create
    And user should reach New Customer Form
    And user create new customer
    Then the page title includes the customer name

    @AC4 @UPG10-485
    Scenario: Verify that the user should be able to see created customer is listed after clicking the Customers module.
      Given user is logged in as a "posmanager12@info.com" with password "posmanager" on the UPGENIX home page
      And user clicks on a Sales and Customer and Create
      And user should reach New Customer Form
      And user create new customer
      And user enter "Aaron" in the search box and push Enter
      Then see created customer is listed after clicking the Customers module.