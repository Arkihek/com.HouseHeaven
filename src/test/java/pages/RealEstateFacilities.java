package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RealEstateFacilities {
    public RealEstateFacilities() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Real Estate")
    public WebElement realEstateButonu;
    @FindBy(id = "cms-plugins-facility")
    public WebElement facilitiesButton;
    @FindBy(id = "botble-real-estate-tables-facility-table_info")
    public WebElement numberOfFacilities;
    @FindBy(xpath = "//button[@class='btn btn-secondary action-item']")
    public WebElement createButtonFacilities;
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement createNameButtonFacilities;
    @FindBy(id = "select2-icon-container")
    public WebElement iconDropdownButtonFacilities;
    @FindBy(id = "select2-status-container")
    public WebElement statusDropdownButtonFacilities;
    @FindBy(xpath = "(//button[@value='save'])[1]")
    public WebElement saveExitButtonFacilities;
    @FindBy(xpath = "(//button[@value='apply'])[1]")
    public WebElement saveButtonFacilities;
    @FindBy(xpath = "//button[@class='btn btn-secondary buttons-reload']")
    public WebElement reloadButtonFacilities;
    @FindBy(xpath = "//a[@class='btn btn-secondary dropdown-toggle']")
    public WebElement dropdownButtonBulkActions;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-show-table-options']")
    public WebElement filtersButtonFacilities;
    @FindBy(xpath = "(//*[@class='ui-select filter-column-key'])[1]")
    public WebElement selectFieldButtonFacilities;
    @FindBy(xpath = "(//*[@class='ui-select filter-column-operator'])[1]")
    public WebElement isEqualToButtonFacilities;
    @FindBy(xpath = "(//*[@class='form-control filter-column-value'])[1]")
    public WebElement valueButtonFacilities;
    @FindBy(xpath = "//*[@class='btn btn-secondary add-more-filter']")
    public WebElement addAdditionalFilterButton;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-apply']")
    public WebElement applyButtonFacilities;
    @FindBy(xpath = "//a[text()='Reset']")
    public WebElement resetButtonFacilities;
    @FindBy(xpath = "//*[@class='btn-reset-filter-item']")
    public WebElement resetIconFacilities;
    @FindBy(xpath = "//input[@class='form-control input-sm']")
    public WebElement searchButtonFacilities;
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement editButtonFacilities;
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement deleteButtonFacilities;
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement confirmDelete;
    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement success;


}
