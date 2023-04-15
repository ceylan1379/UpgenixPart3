@Nikita
Feature: Default

	#{color:#de350b}*1. Verify that User can reach New Survey Form by clicking Surveys --> Create*{color}
	#
	#2. Verify that if Survey Title field leaves blank, an error message "The following fields are invalid:" is appeared. 
	#
	#3. Verify that the "Survey created" message appears under the survey form sheet
	#
	#4. Verify that the user should be able to see created survey is listed after clicking the Surveys module.
	@UPG10-437
	Scenario: Survey Creating Test
		Given user is on the login page
		When user enters "correct" posmanager credentials
		And user on the posman manager main page
		And user click on Surveys on a top bar
		And user is on Surveys menu page 
		And user clicks Create on Surveys menu page 
		Then user reach New Survey form