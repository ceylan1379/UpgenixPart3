Feature: Calender

  @UPG10-448 @wip
 Scenario: user first lands on weekly display
   Given user is on the login page
   And user logs in with "posmanager24@info.com" and "posmanager"
   When user goes to the calendar module
   Then user should land on the weekly display

  @UPG10-449 @wip
  Scenario: user can change display between day, week and month
    Given user is on the login page
    And user logs in with "posmanager24@info.com" and "posmanager"
    When user goes to the calendar module
    Then user should be able to change display between day, week and month

  @UPG10-450 @wip
  Scenario: user can create event by clicking on time box on daily display
    Given user is on the login page
    And user logs in with "posmanager24@info.com" and "posmanager"
    When user goes to the calendar module
    And user clicks on a time box on the daily display
    Then user should be able to create an event

  @UPG10-451
  Scenario: user can edit an event
    Given user is on the login page
    And user logs in with "posmanager24@info.com" and "posmanager"
    When user goes to the calendar module
    And user clicks on an event
    Then user should be able to edit the event

  @UPG10-452
  Scenario: user can delete a created event
    Given user is on the login page
    And user logs in with "posmanager24@info.com" and "posmanager"
    When user goes to the calendar module
    And clicks on an event
    Then user should be able to delete that event