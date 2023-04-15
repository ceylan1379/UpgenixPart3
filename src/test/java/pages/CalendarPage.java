package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='o_calendar_button_week btn btn-sm btn-default active']")
    public WebElement weekDisplayButtonOn;

    @FindBy(xpath = "//button[@class='o_calendar_button_day btn btn-sm btn-default']")
    public WebElement dayDisplayButtonOff;

    @FindBy(xpath = "//button[@class='o_calendar_button_week btn btn-sm btn-default']")
    public WebElement weekDisplayButtonOff;


    @FindBy(xpath = "//button[@class='o_calendar_button_day btn btn-sm btn-default active']")
    public WebElement dayDisplayButtonOn;

    @FindBy(xpath = "//button[@class='o_calendar_button_month btn btn-sm btn-default active']")
    public WebElement monthDisplayButtonOn;

    @FindBy(xpath = "//button[@class='o_calendar_button_month btn btn-sm btn-default']")
    public WebElement monthDisplayButtonOff;




}
