package Step_Definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import Utilities.Driver;
import pages.InventoryPage_dmitry;

public class InventoryFunc_dmitry {

    InventoryPage_dmitry page = new InventoryPage_dmitry();
    WebDriver driver = Driver.getDriver();

    @Given("user is logged in as {string} with password {string} on the UPGENIX Inbox page")
    public void userIsLoggedInAsWithPasswordOnTheUPGENIXInboxPage(String username, String password) {


    }
}
