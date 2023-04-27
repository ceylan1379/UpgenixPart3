package Step_Definitions;

import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.InboxPageDima;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesFunctionalityStepDefDima {


    InboxPageDima inboxPageDima = new InboxPageDima();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is logged in as a {string} with password {string} on the UPGENIX home page")
    public void user_is_logged_in_as_a_with_password_on_the_upgenix_home_page(String email, String password) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        inboxPageDima.emailInput.sendKeys(email);
        inboxPageDima.passwordInput.sendKeys(password);
        inboxPageDima.logInButton.click();

    }
    @When("user clicks on a Sales and Customer and Create")
    public void user_clicks_on_a_sales_and_customer_and_create() {
        BrowserUtils.waitForClickablility(inboxPageDima.salesButton,1000);
        inboxPageDima.salesButton.click();
        BrowserUtils.waitFor(2);
        inboxPageDima.customersButton.click();
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(inboxPageDima.createButton);
        //inboxPageDima.createButton.click();
        BrowserUtils.waitFor(2);


    }
    @Then("user should reach New Customer Form")
    public void user_should_reach_new_customer_form() {

        Assert.assertTrue(inboxPageDima.saveButton.isEnabled());

    }

    @Then("customer name field leaves blank, an error message {string} is appeared.")
    public void customer_name_field_leaves_blank_an_error_message_is_appeared(String expectedErrMess) {
        inboxPageDima.saveButton.click();
        BrowserUtils.waitFor(2);
        wait.until(ExpectedConditions.visibilityOf(inboxPageDima.errorMessage));

        String actualMessage = inboxPageDima.errorMessage.getText();

        Assert.assertEquals(expectedErrMess,actualMessage);


    }

    @Given("user create new customer")
    public void user_create_new_customer() {
        inboxPageDima.inputBoxName.sendKeys("Aaron");
        inboxPageDima.saveButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("the page title includes the customer name")
    public void the_page_title_includes_the_customer_name() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Aaron"));

    }

    @Given("user enter {string} in the search box and push Enter")
    public void user_enter_in_the_search_box_and_push_enter(String string) {
        BrowserUtils.waitFor(2);
        inboxPageDima.customersButton.click();
        BrowserUtils.waitFor(2);
        inboxPageDima.searchBox.sendKeys(string + Keys.ENTER);
    }
    @Then("see created customer is listed after clicking the Customers module.")
    public void see_created_customer_is_listed_after_clicking_the_customers_module() {

        wait.until(ExpectedConditions.visibilityOf(inboxPageDima.resultName));
        Assert.assertTrue(inboxPageDima.resultName.isDisplayed());

    }



}
