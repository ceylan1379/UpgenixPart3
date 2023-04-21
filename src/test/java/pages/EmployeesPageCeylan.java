package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPageCeylan {
    public EmployeesPageCeylan() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "login")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickLogInButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='hr.menu_hr_root']")
    public WebElement clickEmployeesModule;
    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement clickCreateButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy(id = "o_field_input_619")
    public WebElement employeesName;

    @FindBy(xpath = "//div[@class='o_thread_message_content']/p")
    public WebElement createdMessage;
    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement clickListButton;
}
