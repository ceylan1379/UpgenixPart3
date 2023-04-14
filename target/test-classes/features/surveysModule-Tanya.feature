@try
Feature: Surveys module

  User Story
  As a Posmanager, I should be able to create and design a new survey from "Surveys" module

  Background:
    Given  user is on the login page
    Given user is logged in

  @UPG10-429
  Scenario: Verify that User can reach New Survey Form by clicking Surveys --> Create
    When user clicks Surveys module
    And user clicks create
    Then user should reach New Survey Form

  @UPG10-430
  Scenario: Verify that if Survey Title field leaves blank, an error message "The following fields are invalid:"
  is appeared.
    When user clicks Surveys module
    And user clicks create
    And user leaves Survey Title field blank and clicks save
    Then user should see "The following fields are invalid:" message is appeared

  @UPG10-431
  Scenario: Verify that the "Survey created" message appears under the survey form sheet
    When user clicks Surveys module
    And user clicks create
    And user enters title in Survey Title field and clicks save
    Then user should see "Survey created" message appears under the survey form sheet

  @UPG10-432
  Scenario: Verify that the user should be able to see created survey is listed after clicking the Surveys module.
    When user clicks Surveys module
    And user clicks create
    And user enters title in Survey Title field and clicks save
    And user clicks Surveys module
    Then user should be able to see created survey is listed
