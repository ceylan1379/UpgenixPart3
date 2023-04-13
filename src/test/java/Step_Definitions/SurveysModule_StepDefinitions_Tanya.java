package Step_Definitions;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SurveysPage_Tanya;

public class SurveysModule_StepDefinitions_Tanya {

    SurveysPage_Tanya page = new SurveysPage_Tanya();
    WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, 10);
    @Given("user is logged in")
    public void user_is_logged_in() {
        page.usernameInput.sendKeys("posmanager105@info.com");
        page.passwordInput.sendKeys("posmanager" + Keys.ENTER);
    }
    @When("user clicks Surveys module")
    public void user_clicks_surveys() {
        page.surveysModule.click();
    }
    @When("user clicks create")
    public void user_clicks_create() {
        wait.until(ExpectedConditions.elementToBeClickable(page.createButton));
        page.createButton.click();
    }
    @Then("user should reach New Survey Form")
    public void user_should_reach_new_survey_form() {

        wait.until(ExpectedConditions.titleIs("New - Odoo"));

        String actualTitle = driver.getTitle();

        String expectedTitle = "New - Odoo";

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("user leaves Survey Title field blank and clicks save")
    public void user_leaves_survey_title_field_blank_and_clicks_save() {
        page.saveButton.click();
    }
    @Then("user should see {string} message is appeared")
    public void user_should_see_message_is_appeared(String expectedMessage) {

        String actualMessage = page.errorMessage.getText();

        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("user enters title in Survey Title field and clicks save")
    public void user_enters_title_in_survey_title_field_and_clicks_save() {

        page.titleFieldInput.sendKeys("title");
        page.saveButton.click();

    }
    @Then("user should see {string} message appears under the survey form sheet")
    public void user_should_see_message_appears_under_the_survey_form_sheet(String expectedMessage) {

        String actualMessage = page.successMessage.getText();

        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @Then("user should be able to see created survey is listed")
    public void user_should_be_able_to_see_created_survey_is_listed() {
        Assert.assertTrue(page.surveyInList.isDisplayed());
    }
}
