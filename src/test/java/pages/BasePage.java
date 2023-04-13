package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public void BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[contains(text(),'Calendar')])[1]")
    public WebElement calendar;

    @FindBy(xpath = "//button[.='Week']")
    public WebElement weekDisplay;

    @FindBy(xpath = "//button[.='Day']")
    public WebElement dayDisplay;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement monthDisplay;

    @FindBy(xpath = "(//td[@class='fc-day fc-widget-content fc-thu fc-today fc-state-highlight'])[1]")
    public WebElement createEventTimebox;

    @FindBy(xpath = "//input[@class='o_input']")//"Event1" name
    public WebElement createEventName;

    @FindBy(xpath = "//div[contains(text(), 'Event1')]")
    public WebElement eventIconOnTimebox;

    @FindBy(xpath = "//span[.='Create']")
    public WebElement createBtn;

    @FindBy(xpath = "//span[.='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//span[.='Delete']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[.='Ok']")
    public WebElement Ok;

    @FindBy(xpath = "//*[@id='login']")
    public WebElement loginFormControl;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordFormControl;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement login;

}
