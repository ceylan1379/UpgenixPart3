package Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CalendarPage;
import pages.InboxPage;
import pages.LoginPage;

public class Calendar_StepDef {

    LoginPage login = new LoginPage();
    InboxPage inbox = new InboxPage();
    CalendarPage calendar = new CalendarPage();

    @Given("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String username, String password) {
        login.emailInputBox.sendKeys(username);
        login.passwordInputBox.sendKeys(password);
        login.loginButton.click();
    }
    @When("user goes to the calendar module")
    public void user_goes_to_the_calendar_module() {
        inbox.calendarModule.click();
    }
    @Then("user should land on the weekly display")
    public void user_should_land_on_the_weekly_display() {
        Assert.assertTrue(calendar.weekDisplayButton.isSelected());
    }


    @Then("user should be able to change display between day, week and month")
    public void user_should_be_able_to_change_display_between_day_week_and_month() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @When("user clicks on a time box on the daily display")
    public void user_clicks_on_a_time_box_on_the_daily_display() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to create an event")
    public void user_should_be_able_to_create_an_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user clicks on an event")
    public void user_clicks_on_an_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to edit the event")
    public void user_should_be_able_to_edit_the_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("clicks on an event")
    public void clicks_on_an_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to delete that event")
    public void user_should_be_able_to_delete_that_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
