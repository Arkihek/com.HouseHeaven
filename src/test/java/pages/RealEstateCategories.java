package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RealEstateCategories {
    public RealEstateCategories(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Real Estate")
    public WebElement realEstateButonu;
    @FindBy(id = "cms-plugins-real-estate-category")
    public WebElement realEstateCategoriesLink;
    @FindBy(xpath = "//*[@class='badge bg-secondary bold badge-dt']")
    public WebElement numberOfCategories;
    @FindBy(xpath = "//button[@class='btn btn-secondary action-item']")
    public WebElement createButtonCategories;
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement createNameButtonCategories;
    @FindBy(id = "description")
    public WebElement descriptionCategories;
    @FindBy(id = "order")
    public WebElement orderCategories;
    @FindBy(id = "select2-status-container")
    public WebElement statusDropdownButtonCategories;
    @FindBy(xpath = "(//button[@value='save'])[1]")
    public WebElement saveExitButtonCategories;
    @FindBy(xpath = "(//button[@value='apply'])[1]")
    public WebElement saveButtonCategories;
    @FindBy(xpath = "//a[@class='btn btn-secondary dropdown-toggle']")
    public WebElement dropdownButtonBulkActionsCategories;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-show-table-options']")
    public WebElement filtersButtonCategories;
    @FindBy(xpath = "(//*[@class='ui-select filter-column-key'])[1]")
    public WebElement selectFieldButtonCategories;
    @FindBy(xpath = "(//*[@class='ui-select filter-column-operator'])[1]")
    public WebElement isEqualToButtonCategories;
    @FindBy(xpath = "(//*[@class='form-control filter-column-value'])[1]")
    public WebElement valueButtonCategories;
    @FindBy(xpath = "//*[@class='btn btn-secondary add-more-filter']")
    public WebElement addAdditionalFilterButtonCategories;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-apply']")
    public WebElement applyButtonCategories;
    @FindBy(xpath = "//a[text()='Reset']")
    public WebElement resetButtonCategories;
    @FindBy(xpath = "//input[@class='form-control input-sm']")
    public WebElement searchButtonCategories;
    @FindBy(xpath = "//button[@class='btn btn-secondary buttons-reload']")
    public WebElement reloadButtonCategories;
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement editButtonCategories;
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement deleteButtonCategories;
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement confirmDelete;
    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement success;


}
