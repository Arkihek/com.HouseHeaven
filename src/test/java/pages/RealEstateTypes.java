package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RealEstateTypes {
    public RealEstateTypes(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Real Estate")
    public WebElement realEstateButonu;
    @FindBy(id = "cms-plugins-real-estate-type")
    public WebElement TypesButton;
    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement numberOfTypes;
    @FindBy(xpath = "//button[@class='btn btn-secondary action-item']")
    public WebElement createButtonTypes;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement createNameButtonTypes;
    @FindBy(xpath = "//input[@id='code']")
    public WebElement createCodeButtonTypes;
    @FindBy(xpath = "//input[@id='slug']")
    public WebElement createSlugTypes;
    @FindBy(xpath = "//input[@id='order']")
    public WebElement createOrderTypes;
    @FindBy(xpath = "(//button[@value='save'])[1]")
    public WebElement saveExitButtonTypes;
    @FindBy(xpath = "(//button[@value='apply'])[1]")
    public WebElement saveButtonTypes;
    @FindBy(xpath = "//button[@class='btn btn-secondary buttons-reload']")
    public WebElement reloadButtonTypes;
    @FindBy(xpath = "//a[@class='btn btn-secondary dropdown-toggle']")
    public WebElement dropdownButtonBulkActions;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-show-table-options']")
    public WebElement filtersButtonTypes;
    @FindBy(xpath = "(//*[@class='ui-select filter-column-key'])[1]")
    public WebElement selectFieldButtonTypes;
    @FindBy(xpath = "(//*[@class='ui-select filter-column-operator'])[1]")
    public WebElement isEqualToButtonTypes;
    @FindBy(xpath = "(//*[@class='form-control filter-column-value'])[1]")
    public WebElement valueButtonTypes;
    @FindBy(xpath = "//*[@class='btn btn-secondary add-more-filter']")
    public WebElement addAdditionalFilterButton;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-apply']")
    public WebElement applyTypes;
    @FindBy(xpath = "//a[text()='Reset']")
    public WebElement resetButtonTypes;
    @FindBy(xpath = "//*[@class='btn-reset-filter-item']")
    public WebElement resetIconTypes;
    @FindBy(xpath = "//input[@class='form-control input-sm']")
    public WebElement searchButtonTypes;
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement editButtonTypes;
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement deleteButtonTypes;
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement confirmDelete;
    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement success;
}
