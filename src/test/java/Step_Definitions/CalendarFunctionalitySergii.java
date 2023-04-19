package Step_Definitions;

import Utilities.BrowserUtils;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CalendarPageSergii;

import java.util.List;

public class CalendarFunctionalitySergii {

    CalendarPageSergii calendarPage = new CalendarPageSergii();


    @And("user logins")
    public void userLogins() {

        calendarPage.loginFormControl.sendKeys("posmanager100@info.com");
        calendarPage.passwordFormControl.sendKeys("posmanager");
        calendarPage.login.click();
    }
    @When("user clicks on Calendar")
    public void user_clicks_on_calendar() {
        calendarPage.calendar.click();
    }

    @Then("user first lands on weekly display")
    public void user_first_lands_on_weekly_display() {
        WebElement checkWeek = Driver.getDriver().findElement(By.xpath("//button[@class='o_calendar_button_week btn btn-sm btn-default active']"));
        Assert.assertTrue(checkWeek.isDisplayed());
    }

    @Then("user can change display between Day-Week-Month")
    public void user_can_change_display_between_day_week_month() {
        //TODO Assertions



        calendarPage.monthDisplay.click();
        WebElement checkMonth = Driver.getDriver().findElement(By.xpath("//button[@class='o_calendar_button_month btn btn-sm btn-default active']"));
        Assert.assertTrue(checkMonth.isDisplayed());

        calendarPage.dayDisplay.click();
        WebElement checkDay = Driver.getDriver().findElement(By.xpath("//button[@class='o_calendar_button_day btn btn-sm btn-default active']"));

        Assert.assertTrue(checkDay.isDisplayed());

    }

    @Then("user can create event by clicking on time box on daily display")
    public void user_can_create_event_by_clicking_on_time_box_on_daily_display() {


        BrowserUtils.waitFor(5);
        calendarPage.createEventTimebox.click();
        calendarPage.createEventName.sendKeys("Event21");//Event21 a must
        calendarPage.createBtn.click();
        //Assert.assertTrue(calendarPage.eventIconOnTimebox.isDisplayed());

    }

    @Then("user can edit a created event")
    public void user_can_edit_a_created_event() {
        calendarPage.eventIconOnTimebox.click();
        calendarPage.editBtn.click();

        calendarPage.saveBtn.click();
        

    }

    @Then("user can delete a created event")
    public void user_can_delete_a_created_event() {
       calendarPage.eventIconOnTimebox.click();
       calendarPage.deleteBtn.click();
       calendarPage.ok.click();
       String xpath =  BrowserUtils.xpathFromElement(calendarPage.eventIconOnTimebox);
        System.out.println("xpath = " + xpath);
        BrowserUtils.waitFor(2);
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//div[contains(text(), 'Event21')]"));// //div[contains(text(), 'Event21')]

        BrowserUtils.waitFor(10);
        Assert.assertEquals(0, elements.size());
    }



}
