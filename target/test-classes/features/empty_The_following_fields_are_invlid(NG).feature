@Nikita
Feature: Default

	#{color:#172b4d}1. Verify that User can reach New Survey Form by clicking Surveys --> Create{color}
	#
	#{color:#172b4d}2. Verify that if Survey Title field leaves blank, an error message "The following fields are invalid:" is appeared.{color} 
	#
	#3. Verify that the "Survey created" message appears under the survey form sheet
	#
	#4. Verify that the user should be able to see created survey is listed after clicking the Surveys module.
	#
	#{color:#de350b}*5. Verify that if Survey Title field leaves empty, an error message "The following fields are invalid:" is appeared.*{color} 
	@UPG10-447
	Scenario: 2. "The following fields are invalid:" is appeared, if Survey Title field leaves empty
		Given  user is on the login page
		When user enters "correct" posmanager credentials 
		And user on the posman manager main page
		And user click on Surveys on a top bar
		And user is on Surveys menu page 
		And user clicks Create on Surveys menu page 
		And user reach New Survey form 
		And user leaves title name empty
		And user hits "Save" button
		Then user see message - The following fields are invalid: