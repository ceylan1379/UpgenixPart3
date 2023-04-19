@Calendar

`Feature: User as Posmanager should be able to use Calendar

Background:
  Given  user is on the login page
  @UPG10-461
  Scenario: Calendar functionality testing
    Given user logins
    When user clicks on Calendar
    Then user first lands on weekly display
    And user can change display between Day-Week-Month
    And user can create event by clicking on time box on daily display
    And user can edit a created event
    Then user can delete a created event

  @UPG10-455
  Scenario: User first lands on weekly display
    Given user logins
    When user clicks on Calendar
    Then user first lands on weekly display

  @UPG10-457
  Scenario: User can change display between Day-Week-Month
    Given user logins
    When user clicks on Calendar
    Then user can change display between Day-Week-Month

  @UPG10-458
  Scenario: User can create event by clicking on time box on daily display
    Given user logins
    And user clicks on Calendar
    Then user can create event by clicking on time box on daily display
    And user can delete a created event
    #delete to make TC repeatable

  @UPG10-459
  Scenario: User can edit a created event
    Given user logins
    And user clicks on Calendar
    And user can create event by clicking on time box on daily display
    Then user can edit a created event
    And user can delete a created event
    #delete to make TC repeatable


  @UPG10-460
  Scenario: User can delete a created event
    Given user logins
    And user clicks on Calendar
    And user can create event by clicking on time box on daily display
    Then user can delete a created event




    #AC
    #1. User first lands on weekly display
    #2. User can change display between Day-Week-Month
    #3. User can create event by clicking on time box on daily display
    #4. User can edit a created event
    #5. User can delete a created event

  #Description
  #As a Posmanager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module
  #
  #For this ERP application, the calendar function is very crucial.
  # Anyone in the team can contribute and plan their agenda using the calendar.
  # To prevent any conflict, events should be created, edited and displayed by all team members.
