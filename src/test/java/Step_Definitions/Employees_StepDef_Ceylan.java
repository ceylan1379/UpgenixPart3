package Step_Definitions;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.EmployeesPageCeylan;

public class Employees_StepDef_Ceylan {
    WebDriver driver= Driver.getDriver();
    EmployeesPageCeylan page=new EmployeesPageCeylan();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("url"));

    }
    @When("user enters valid posmanager credentials {string} and {string}")
    public void user_enters_valid_posmanager_credentials_and(String username, String password) {
        page.usernameInput.sendKeys(username);
        page.passwordInput.sendKeys(password);
        page.clickLogInButton.click();
    }
    @When("user click on Employees on a top bar")
    public void user_click_on_employees_on_a_top_bar() {
        page.clickEmployeesModule.click();
    }
    @When("user is on Employees menu page")
    public void user_is_on_employees_menu_page() {
        String expectedTitle="Employees - Odoo";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));

    }
    @When("user clicks Create on Employees menu page")
    public void user_clicks_create_on_employees_menu_page() {
        page.clickCreateButton.click();
    }
    @Then("user reach New Employees form")
    public void user_reach_new_employees_form() {
        String expectedTitle="New - Odoo";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));

    }
}
