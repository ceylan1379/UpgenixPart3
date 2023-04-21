package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class InventoryPage_Ozer {

    public InventoryPage_Ozer(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[data-menu='347'] span[class='oe_menu_text']")
    public WebElement spanInventory;

    @FindBy(css = "a[data-menu='378'] span[class='oe_menu_text']")
    public WebElement spanProducts;

    @FindBy(css = "button[class$='btn-default']")
    public WebElement buttonCreate;

    @FindBy(css = "button[class$='save']")
    public WebElement buttonSave;

    @FindBy(className = "o_notification_title")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@placeholder='Product Name']")
    public WebElement inputProduct;

    @FindBy(css = "input[class='o_searchview_input']")
    public WebElement inputSearchBox;

    @FindBy(xpath = "//div[contains(@class, 'oe_kanban_global_click')]")
    public WebElement productRecords;

    @FindBy(xpath = "//div[@class='o_facet_values']")
    public WebElement divProducts;


}
