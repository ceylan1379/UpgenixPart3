package Step_Definitions;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class BackgroundStepDef {

    WebDriver driver= Driver.getDriver();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("url"));
    }



}

