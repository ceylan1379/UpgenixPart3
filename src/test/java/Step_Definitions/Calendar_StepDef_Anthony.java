package Step_Definitions;

import Utilities.BrowserUtils;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CalendarPageAnthony;
import pages.InboxPageAnthony;
import pages.LoginPageAnthony;

import java.util.List;

public class Calendar_StepDef_Anthony {

    LoginPageAnthony login = new LoginPageAnthony();
    InboxPageAnthony inbox = new InboxPageAnthony();
    CalendarPageAnthony calendar = new CalendarPageAnthony();

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
      String weekLocator=calendar.weekDisplayButtonOn.toString();
       Assert.assertTrue(weekLocator.contains("active"));


    }


    @Then("user should be able to change display between day, week and month")
    public void user_should_be_able_to_change_display_between_day_week_and_month() {

        calendar.dayDisplayButtonOff.click();
        calendar.dayDisplayButtonOn.click();
        Assert.assertTrue(calendar.dayDisplayButtonOn.toString().contains("active"));

        calendar.weekDisplayButtonOff.click();
        calendar.weekDisplayButtonOn.click();
        Assert.assertTrue(calendar.weekDisplayButtonOn.toString().contains("active"));

        calendar.monthDisplayButtonOff.click();
        calendar.monthDisplayButtonOn.click();
        Assert.assertTrue(calendar.monthDisplayButtonOn.toString().contains("active"));
    }



    @When("user clicks on a time box on the daily display")
    public void user_clicks_on_a_time_box_on_the_daily_display() {
        calendar.timeBox.click();
    }
    @Then("user should be able to create an event")
    public void user_should_be_able_to_create_an_event() {
        calendar.summaryTextBox.sendKeys("Event1");
        calendar.createButton.click();
        Assert.assertTrue(calendar.timeBoxEvent.getText().contains("Event1"));

    }


    @When("user clicks on an event")
    public void user_clicks_on_an_event() {
       calendar.timeBoxEvent.click();
    }
    @Then("user should be able to edit the event")
    public void user_should_be_able_to_edit_the_event() {
        calendar.editButton.click();
        calendar.editInputBox.sendKeys("2");
        calendar.saveButton.click();
        Assert.assertTrue(calendar.editedInput.getText().contains("Event12"));
    }


    @Then("user should be able to delete that event")
    public void user_should_be_able_to_delete_that_event() {

        calendar.deleteButton.click();
        calendar.okButton.click();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//div[contains(text(), 'Event15')]"));// //div[contains(text(), 'Event15')]

        BrowserUtils.waitFor(10);
        Assert.assertEquals(0, elements.size());
    }
}
