Feature: User should be able to use Calendar

  Scenario: "Wrong login/password" message should be displayed for invalid credentials
    Given  user is on the login page
    When user clicks on Calendar
    Then user first lands on weekly display
    And user can change display between Day-Week-Month
    And user can create event by clicking on time box on daily display
    And user can edit a created event
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
