package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPageDima extends UpgenixLogInPageDima{

    public InboxPageDima(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Sales']")
    public WebElement salesButton;

    @FindBy(xpath = "//a[@href='/web#menu_id=447&action=48']")
    public WebElement customersButton;

    @FindBy(xpath = "//button[normalize-space()='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(className = "o_notification_title")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement inputBoxName;

    @FindBy(className = "o_searchview_input")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record']")
    public WebElement resultName;



}
