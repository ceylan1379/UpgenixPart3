package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public void LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id=\"login\"]")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    public WebElement loginButton;
}
