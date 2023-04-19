package Step_Definitions;

import Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.InventoryPage_dmitry;
import pages.LoginPage_dmitry;
import Utilities.ConfigurationReader;
import Utilities.Driver;

import java.time.Duration;

public class InventoryFunc_dmitry {

    LoginPage_dmitry loginPageDmitry = new LoginPage_dmitry();
    InventoryPage_dmitry pageIventory = new InventoryPage_dmitry();
    WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Given("user is logged in as {string} with password {string} on the UPGENIX Inbox page")
    public void userIsLoggedInAsWithPasswordOnTheUPGENIXInboxPage(String username, String password) {

        String url = ConfigurationReader.getProperty("webLoginPage");
        Driver.getDriver().get(url);

        loginPageDmitry.inputLogin.sendKeys(username);
        loginPageDmitry.inputPassword.sendKeys(password);
        loginPageDmitry.buttonLog.click();

    }


    @When("user clicks on Inventory menu item")
    public void userClicksOnInventoryMenuItem() {

        pageIventory.spanInventory.click();

    }

    @And("user choose Products from the Master Data menu")
    public void userChooseProductsFromTheMasterDataMenu() {

        pageIventory.spanProducts.click();

    }


    @And("user push button Create")
    public void userPushButtonCreate() {

        pageIventory.buttonCreate.click();

    }

    @Then("user is on the Products New page")
    public void userIsOnTheProductsNewPage() {

        String expectedTitle = "Products - Odoo";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @And("user leaves Product Name field blank and clicks on the Save button")
    public void userLeavesProductNameFieldBlankAndClicksOnTheSaveButton() {

        pageIventory.buttonSave.click();

    }

    @Then("error message {string} is appeared")
    public void errorMessageIsAppeared(String expErrorMessage) {

        String actualErrorMessage = pageIventory.errorMessage.getText();

        Assert.assertEquals(expErrorMessage, actualErrorMessage);

    }

    @And("input box Product Name bordered in red color")
    public void inputBoxProductNameBorderedInRedColor() {

        String rgbaExpected = "rgba(217, 83, 79, 1)";
        String rgbaActual  = pageIventory.inputProduct.getCssValue("border-bottom-color");

        Assert.assertEquals(rgbaExpected, rgbaActual);
    }

    @And("put the name of the product: {string} in the product name input box")
    public void putTheNameOfTheProductInTheProductNameInputBox(String productName) {

        pageIventory.inputProduct.sendKeys(productName);

    }

    @And("user clicks on the Save button")
    public void userClicksOnTheSaveButton() {

        pageIventory.buttonSave.click();

    }

    @Then("page title includes entered product name: {string}")
    public void pageTitleIncludesEnteredProductName(String productName) {

        String expectedTitle = productName + " - Odoo";

        wait.until(ExpectedConditions.titleIs(expectedTitle));

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user enters {string} in the search box and push Enter")
    public void userEntersInTheSearchBoxAndPushEnter(String productName) {

        wait.until(ExpectedConditions.visibilityOf(pageIventory.divProducts));

        pageIventory.inputSearchBox.sendKeys(productName + Keys.ENTER);

    }

    @Then("user see that created product is listed")
    public void userSeeThatCreatedProductIsListed() {

        String expectedProductTitle = "Test Product Item";
        BrowserUtils.waitFor(2);
        // wait.until(ExpectedConditions.visibilityOf(pageIventory.spanTestProductItem));

        String actualProductTitle = pageIventory.productRecords.getText();
        Assert.assertTrue(actualProductTitle.contains(expectedProductTitle));

    }
}
