package Step_Definitions;

import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EmployeesPageCeylan;

public class Employees_StepDef_Ceylan {
    WebDriver driver= Driver.getDriver();
    EmployeesPageCeylan page=new EmployeesPageCeylan();
    WebDriverWait wait=new WebDriverWait(driver,10);
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("url"));

    }
    @When("user enters valid posmanager credentials username and password")
    public void userEntersValidPosmanagerCredentialsUsernameAndPassword() {

        page.usernameInput.sendKeys("posmanager55@info.com");
        page.passwordInput.sendKeys("posmanager");
        page.clickLogInButton.click();
    }
    @When("user click on Employees on a top bar")
    public void user_click_on_employees_on_a_top_bar() {
        page.clickEmployeesModule.click();
    }
    @When("user is on Employees menu page")
    public void user_is_on_employees_menu_page() {
       wait.until(ExpectedConditions.titleIs("Employees - Odoo"));
       String actualTitle= driver.getTitle();
       String expectedTitle="Employees - Odoo";
       Assert.assertEquals(expectedTitle,actualTitle);

    }
    @When("user clicks Create on Employees menu page")
    public void user_clicks_create_on_employees_menu_page() {

        page.clickCreateButton.click();
    }
    @Then("user reach New Employees form")
    public void user_reach_new_employees_form() {
        BrowserUtils.sleep(2);
        String expectedTitle="New - Odoo";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));

    }

    @When("user clicks Employees")
    public void userClicksEmployees() {
        page.clickEmployeesModule.click();

    }

    @And("user leaves Employee's Name field blank and clicks save")
    public void userLeavesEmployeeSNameFieldBlankAndClicksSave() {
        page.saveButton.click();
    }

    @Then("users should see {string} message is appeared")
    public void usersShouldSeeMessageIsAppeared(String expectedMessage) {
        BrowserUtils.sleep(2);
        String actualMessage =page.errorMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);


    }

    @And("user clicks Create")
    public void userClicksCreate() {
        BrowserUtils.sleep(2);
        page.clickCreateButton.click();
    }

    @And("user user enters {string}")
    public void userUserEnters(String string) {
        page.employeesName.sendKeys(string);
    }


    @And("user clicks Save button")
    public void userClicksSaveButton() {

        page.saveButton.click();
    }

    @Then("user should see {string} message appears under full profile")
    public void userShouldSeeMessageAppearsUnderFullProfile(String createdMessage) {
        String actualMessage=page.createdMessage.getText();
        Assert.assertEquals(createdMessage,actualMessage);
    }

    @When("user clicks Employees module")
    public void userClicksEmployeesModule() {
        page.clickEmployeesModule.click();
    }

    @And("user user enters {string} clicks save")
    public void userUserEntersClicksSave(String string) {
        page.employeesName.sendKeys(string);
        page.saveButton.click();

    }
    @And("user clicks back button")
    public void userClicksBackButton() {
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

    }

    @And("user clicks List button")
    public void userClicksListButton() {
        BrowserUtils.sleep(2);
        page.clickListButton.click();
    }

    @Then("user should be able to see created Employee on list")
    public void userShouldBeAbleToSeeCreatedEmployeeOnList() {
    }


}
