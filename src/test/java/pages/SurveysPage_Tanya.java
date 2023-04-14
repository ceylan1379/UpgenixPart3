package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysPage_Tanya {

    public SurveysPage_Tanya(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement usernameInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//a[@data-menu-xmlid=\"survey.menu_surveys\"]")
    public WebElement surveysModule;

    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement createButton;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement saveButton;

    @FindBy(className = "o_notification_title")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@placeholder=\"Survey Title\"]")
    public WebElement titleFieldInput;

    @FindBy(className = "o_thread_message_content")
    public WebElement successMessage;

    @FindBy(xpath = "//h4[.='title']")
    public WebElement surveyInList;
}
