package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class InventoryFunc_dmitry {

    public InventoryFunc_dmitry(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='login']")
    public WebElement inputLogin;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[text() = 'Inventory']")
    public WebElement spanInventory;

    @FindBy(css = "a[data-menu='378'] span[class='oe_menu_text']")
    public WebElement spanProducts;

    @FindBy(css = "button[class$='btn-default']")
    public WebElement buttonCreate;
    
    @FindBy(css = "button[class$='save']")
    public WebElement buttonSave2;

    @FindBy(xpath = "//input[@placeholder='Product Name']")
    public WebElement inputProduct;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement inputSearchBox;

    @FindBy(xpath = "//*[text() = 'New Product Item']")
    public WebElement spanNewProductItem;


}
