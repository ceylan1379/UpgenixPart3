@Nikita
Feature: Default

	#{color:#172b4d}1. Verify that User can reach New Survey Form by clicking Surveys --> Create{color}
	#
	#{color:#172b4d}2. Verify that if Survey Title field leaves blank, an error message "The following fields are invalid:" is appeared.{color} 
	#
	#{color:#172b4d}3. Verify that the "Survey created" message appears under the survey form sheet{color}
	#
	#{color:#de350b}*4. Verify that the user should be able to see created survey is listed after clicking the Surveys module.*{color}
	@UPG10-441
	Scenario: 4.  Created Survey, user sees in Surveys module
		Given  user is on the login page
		When user enters "correct" posmanager credentials 
		And user on the posman manager main page
		And user click on Surveys on a top bar
		And user is on Surveys menu page 
		And user clicks Create on Surveys menu page 
		And user reach New Survey form 
		And user insert Title name "What should i do, when user hidding under my bed?" 
		And user hits "Save" button
		And user clicks on Surveys module
		And user search Survey in input bar
		Then user sees created Survey