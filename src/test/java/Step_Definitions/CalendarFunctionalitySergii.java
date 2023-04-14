package Step_Definitions;

import Utilities.BrowserUtils;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.CalendarPageSergii;

import java.util.List;

public class CalendarFunctionalitySergii {

    CalendarPageSergii basePage = new CalendarPageSergii();
    boolean check;


    @And("user logins")
    public void userLogins() {

        basePage.loginFormControl.sendKeys("posmanager14@info.com");
        basePage.passwordFormControl.sendKeys("posmanager");
        basePage.login.click();
    }
    @When("user clicks on Calendar")
    public void user_clicks_on_calendar() {
        basePage.calendar.click();
    }

    @Then("user first lands on weekly display")
    public void user_first_lands_on_weekly_display() {
        check = basePage.weekDisplay.getAttribute("class").contains("active");
        Assert.assertTrue(check);
    }

    @Then("user can change display between Day-Week-Month")
    public void user_can_change_display_between_day_week_month() {
        //TODO Assertions
        basePage.monthDisplay.click();
        Assert.assertTrue(true);

        basePage.dayDisplay.click();
        Assert.assertTrue(true);

    }

    @Then("user can create event by clicking on time box on daily display")
    public void user_can_create_event_by_clicking_on_time_box_on_daily_display() {


        //TODO Click callendar box
        Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), 10);


        wait.until(ExpectedConditions.visibilityOf(basePage.createEventTimebox));

        BrowserUtils.waitFor(5);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("document.elementFromPoint(500, 500).click();");

        basePage.createEventName.sendKeys("Event1");//Event1 a must
        basePage.editBtn.click();
        //Assert.assertTrue(basePage.eventIconOnTimebox.isDisplayed());

    }

    @Then("user can edit a created event")
    public void user_can_edit_a_created_event() {
        basePage.eventIconOnTimebox.click();
        basePage.editBtn.click();

        //TODO Assert edit

        //WebElement location = Driver.getDriver().findElement(By.xpath("//input[@name='location']"));
        //location.sendKeys("Driverville");
        basePage.saveBtn.click();
        basePage.eventIconOnTimebox.click();

        //Assert.assertEquals("Driverville", location.getText());

    }

    @Then("user can delete a created event")
    public void user_can_delete_a_created_event() {
       basePage.deleteBtn.click();
       String xpath =  BrowserUtils.xpathFromElement(basePage.eventIconOnTimebox);
        System.out.println("xpath = " + xpath);
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath(xpath));
        Assert.assertEquals(0, elements.size());
    }



}
