Feature: Employees Module

	#User Story: As a Posmanager, I should be able to create and edit a new employee from "Employees" module
	#
	#AC1: Verify that User can reach New Employee Form by clicking Employees --> Create
  @UPG10-440 @UPG10-467
  Scenario Outline: Verify that User can reach New Employee Form by clicking Employees --> Create
    Given  user is on the login page
    When user enters valid posmanager credentials "<username>" and "<password>"
    And user click on Employees on a top bar
    And user is on Employees menu page
    And user clicks Create on Employees menu page
    Then user reach New Employees form
    Examples:
      | username              | password   |
      | posmanager55@info.com | posmanager |

	#User Story: As a Posmanager, I should be able to create and edit a new employee from "Employees" module
	#
	#AC2: Verify that if Employee's Name field leaves blank, an error message "The following fields are invalid:" is appeared.
  @UPG10-445 @UPG10-467
  Scenario: Verify that if Employee's Name field leaves blank, an error message "The following fields are invalid:" is appeared.
    When user clicks Employees
    And user clicks create
    And user leaves Employee's Name field blank and clicks save
    Then user should see "The following fields are invalid:" message is appeared

	#User Story: As a Posmanager, I should be able to create and edit a new employee from "Employees" module.
	#
	#AC3: Verify that the "Employee created" message appears under full profile.
	#

  @UPG10-463 @UPG10-467
  Scenario: Employees Functionality [S3 Automation-Ceylan]

  Scenario: Verify that the "Employee created" message appears under full profile.
    When user clicks Employees
    And user clicks Create
    And user user enters "employeesName"
    And user choose "jobTitle"
    And user clicks Save button
    Then  user should see "Employee created" message appears under full profile

	#User Story: As a Posmanager, I should be able to create and edit a new employee from "Employees" module
	#
	#AC4: Verify that the user should be able to see created employee is listed after clicking the Employees module.
  @UPG10-465 @UPG10-467
  Scenario: Employees Functionality [S3 Automation-Ceylan]

  Scenario: Verify that the user should be able to see created employee is listed after clicking the Employees module.
    When user clicks Employees module
    And user clicks create
    And user fill in Employee field and clicks save
    And user clicks Employees module
    And user clicks List button
    Then user should be able to see created Employee on list