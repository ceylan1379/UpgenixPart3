package pages;

import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public void BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
