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

    @Given("User is logged in as {string} with password {string} on the Inbox page")
    public void userIsLoggedInAsWithPasswordOnTheUPGENIXInboxPage(String username, String password) {

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

        loginPageDmitry.inputLogin.sendKeys(username);
        loginPageDmitry.inputPassword.sendKeys(password);
        loginPageDmitry.buttonLog.click();

    }


    @When("User clicks on Inventory menu item")
    public void userClicksOnInventoryMenuItem() {

        pageIventory.spanInventory.click();

    }

    @And("User choose Products from the Master Data menu")
    public void userChooseProductsFromTheMasterDataMenu() {

        wait.until(ExpectedConditions.visibilityOf(pageIventory.spanProducts));

        pageIventory.spanProducts.click();

    }


    @And("User push button Create")
    public void userPushButtonCreate() {

        pageIventory.buttonCreate.click();

    }

    @Then("User is on the Products New page")
    public void userIsOnTheProductsNewPage() {

        String expectedTitle = "Products - Odoo";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @And("User leaves Product Name field blank and clicks on the Save button")
    public void userLeavesProductNameFieldBlankAndClicksOnTheSaveButton() {

        pageIventory.buttonSave.click();

    }

    @Then("the error message {string} is appeared")
    public void errorMessageIsAppeared(String expErrorMessage) {

        wait.until(ExpectedConditions.visibilityOf(pageIventory.errorMessage));

        String actualErrorMessage = pageIventory.errorMessage.getText();

        Assert.assertEquals(expErrorMessage, actualErrorMessage);

    }

    @And("input box of Product Name bordered in red color")
    public void inputBoxProductNameBorderedInRedColor() {

        String rgbaExpected = "rgba(217, 83, 79, 1)";
        String rgbaActual  = pageIventory.inputProduct.getCssValue("border-bottom-color");

        Assert.assertEquals(rgbaExpected, rgbaActual);
    }

    @And("put name of the product: {string} in the product name input box")
    public void putTheNameOfTheProductInTheProductNameInputBox(String productName) {

        pageIventory.inputProduct.sendKeys(productName);

    }

    @And("User clicks on the Save button")
    public void userClicksOnTheSaveButton() {

        pageIventory.buttonSave.click();

    }

    @Then("page title would includes entered product name: {string}")
    public void pageTitleIncludesEnteredProductName(String productName) {

        String expectedTitle = productName + " - Odoo";

        wait.until(ExpectedConditions.titleIs(expectedTitle));

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("User enters {string} in the search box and push Enter")
    public void userEntersInTheSearchBoxAndPushEnter(String productName) {

        wait.until(ExpectedConditions.visibilityOf(pageIventory.divProducts));

        pageIventory.inputSearchBox.sendKeys(productName + Keys.ENTER);

    }

    @Then("User see that created product is listed")
    public void userSeeThatCreatedProductIsListed() {

        String expectedProductTitle = "Test Product Item";
        BrowserUtils.waitFor(3);
        // wait.until(ExpectedConditions.visibilityOf(pageIventory.spanTestProductItem));

        String actualProductTitle = pageIventory.productRecords.getText();
        Assert.assertTrue(actualProductTitle.contains(expectedProductTitle));

    }
}
