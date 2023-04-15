package Step_Definitions;


import Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Surveys_Nikita;

import java.util.List;


public class SurveysTest_NG {

    Surveys_Nikita surveysP = new Surveys_Nikita();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
    Faker faker = new Faker();
String dummy ="where can i catch "+faker.pokemon().name()+"?";
    @When("user enters {string} posmanager credentials")
    public void user_enters_posmanager_credentials(String string) {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));

        surveysP.getElement("LOGIN").sendKeys(Surveys_Nikita.usernamePos(15));
        surveysP.getElement("PASSWORD").sendKeys(Surveys_Nikita.passwordPos("true"));
        surveysP.getElement("BUTTON").click();



    }
    @When("user on the posman manager main page")
    public void user_on_the_posman_manager_main_page() {
        wait.until(ExpectedConditions.urlContains("channel_inbox"));
      Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("channel_inbox"));
    }
    @When("user click on Surveys on a top bar")
    public void user_click_on_surveys_on_a_top_bar() {
        surveysP.getElement("SURVEYS").click();


    }
    @When("user is on Surveys menu page")
    public void user_is_on_surveys_menu_page() {
        wait.until(ExpectedConditions.visibilityOf(surveysP.getElement("CREATE")));
Assert.assertTrue(surveysP.getElement("CREATE").isDisplayed());

    }
    @When("user clicks Create on Surveys menu page")
    public void user_clicks_create_on_surveys_menu_page() {
     surveysP.getElement("CREATE").click();

    }
    @Then("user reach New Survey form")
    public void user_reach_new_survey_form() {
        wait.until(ExpectedConditions.visibilityOf(surveysP.getElement("SURVEY_TITLE")));
        Assert.assertTrue(surveysP.getElement("SURVEY_TITLE").isDisplayed());

    }
        @When("user clicks {string} button on key board as a Title name")
        public void user_clicks_button_on_key_board_as_a_title_name(String SPACE) {
wait.until(ExpectedConditions.visibilityOf(surveysP.getElement("CREATION_TITLE")));
        surveysP.getElement("CREATION_TITLE").sendKeys(""+Keys.SPACE);


        }
        @When("user hits {string} button")
        public void user_hits_button(String string) {
            wait.until(ExpectedConditions.visibilityOf(surveysP.getElement("SAVE")));
            surveysP.getElement("SAVE").click();


        }
        @Then("user see message - The following fields are invalid:")
        public void user_see_message_the_following_fields_are_invalid() {
        wait.until(ExpectedConditions.visibilityOf(surveysP.getElement("VALIDATION")));
           Assert.assertTrue(surveysP.getElement("VALIDATION").isDisplayed());
            Assert.assertEquals("The following fields are invalid:",surveysP.getElement("VALIDATION").getText());


        }


            ///Assert.assertEquals("The following fields are invalid:",validationActual);




    @When("user insert Title name {string}")
    public void user_insert_title_name(String titleProvided) {
        surveysP.getElement("SURVEY_TITLE").sendKeys(dummy);



    }
    @Then("user see message - Survey created, at the buttom")
    public void user_see_message_survey_created_at_the_buttom() {


       Assert.assertTrue(surveysP.getElement("SURVEY_CREATED").isDisplayed());
       Assert.assertEquals("Survey created",surveysP.getElement("SURVEY_CREATED").getText());
      Assert.assertTrue(surveysP.getElement("TIME_TITLE").getAttribute("title").contains(Surveys_Nikita.actualTime()));




    }
    @When("user search Survey in input bar")
    public void user_search_survey_in_input_bar() {
        wait.until(ExpectedConditions.visibilityOf(surveysP.getElement("SURVEY_SEARCH")));
  Assert.assertTrue( surveysP.getElement("SURVEY_SEARCH").isDisplayed());
        surveysP.getElement("SURVEY_SEARCH").sendKeys(dummy+Keys.ENTER);
    }
    @Then("user sees created Survey")
    public void user_sees_created_survey() {
     Assert.assertTrue(surveysP.getElement("DRAFT").isDisplayed());
     Assert.assertTrue(surveysP.serchInDraft(dummy).isDisplayed());
    }

    @When("user clicks on Surveys module")
    public void user_clicks_on_surveys_module() {

        surveysP.getElement("SURVEY_MODULE").click();

    }


    @When("user leaves title name empty")
    public void user_leaves_title_name_empty() {


    }










}
