package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPageCeylan {
    public EmployeesPageCeylan() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickLogInButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='hr.menu_hr_root']")
    public WebElement clickEmployeesModule;
    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement clickCreateButton;
}
