package pages;

import Utilities.Driver;
import org.junit.runner.manipulation.Alphanumeric;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Surveys_Nikita {

    public Surveys_Nikita(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    private static final String SURVEYS = "Surveys";
@FindBy(xpath = "//a/span[contains(.,'Surveys')]")
    public WebElement surveys;

@FindBy(xpath = "//a[@href=\"/web#menu_id=476&action=641\"]/span[contains(.,'Surveys')]")
public WebElement surveysLink;


@FindBy(id="login")
public WebElement login;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement confirmButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@placeholder='Survey Title']")
    public WebElement surveyTitle;


    @FindBy(name = "title")
    public WebElement titleSurvetyCreate;

    @FindBy(css = "button[accesskey='s']")
    public WebElement saveButtonSurvetyCreation;


    @FindBy(xpath = "//div/p[.='Survey created']")
    public WebElement surveyCreated;


    @FindBy(xpath = "//div/p/small[@title]")
    public WebElement timeTitle;

    @FindBy(css = "input[class='o_searchview_input']")
    public WebElement surveysMenuInput;

    @FindBy(xpath = "//div[@class='o_kanban_record_top']")
    public WebElement itemsInDraft;
////div[@class='o_notification_title'][contains(.,'The following fields are invalid')]
    @FindBy(xpath = "//div[@class='o_notification_title'][contains(.,'The following fields are invalid')]")
    public WebElement validation;
public  WebElement getElement(String element){

    switch (element){
        case "SURVEYS" : return surveys;
        case "LOGIN" : return login;
        case "PASSWORD" : return password;
        case "BUTTON" : return confirmButton;
        case "CREATE" : return createButton;
        case "SURVEY_TITLE" : return surveyTitle;
        case "CREATION_TITLE" : return titleSurvetyCreate;
        case "SAVE" : return saveButtonSurvetyCreation;
        case "SURVEY_CREATED" : return surveyCreated;
        case "TIME_TITLE" : return timeTitle;
        case "SURVEY_MODULE" : return surveysLink;
        case "SURVEY_SEARCH" : return surveysMenuInput;
        case "DRAFT" : return itemsInDraft;
        case "VALIDATION" : return validation;
        default: throw new NoSuchElementException("element not found");

    }



}

public static String assertHomeUrl = "channel_inbox";


public static String usernamePos(int i){

    return "posmanager"+i+"@info.com";


}

public static String passwordPos(String type){

    switch (type){
        //does break needed here?
        case "true" : type = "posmanager";
        break;
        case "false" : type = "wrong";
        break;


    }
    return type;

}


public static String actualTime(){
String time = "";
    DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
   time =  LocalDateTime.now().format(format);
return time;


}

public WebElement serchInDraft(String name){

   return Driver.getDriver().findElement(By.xpath("//span[contains(.,'"+name+"')]"));

}

}

