package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {

    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Newsletters Locate'leri
    @FindBy(xpath = "(//a[@class='nav-link nav-toggle'])[5]")
    public WebElement newsletterButon;
    @FindBy(xpath = "//div[@class='wrapper-action']")
    public WebElement newsletterFiltersButon;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement newslettersSearch;
    @FindBy (xpath = "//button[@class='btn btn-secondary buttons-collection dropdown-toggle buttons-export']")
    public WebElement newslettersExport;
    @FindBy(xpath = "//button[@class='btn btn-secondary buttons-reload']")
    public WebElement newslettersReload;
    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement newslettersToplamKayitSayisi;

    //Locations Locate'leri
    @FindBy(xpath = "(//span[@class='title'])[11]")
    public WebElement locationsButon;
    @FindBy(xpath = "//li[@id='cms-plugins-country']")
    public WebElement countriesButon;
    @FindBy(xpath = "//li[@id='cms-plugins-state']")
    public WebElement statesButon;
    @FindBy(xpath = "//li[@id='cms-plugins-city']")
    public WebElement citiesButon;
    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement countriesKayitSayisi;
    @FindBy(xpath = "//a[@class='btn btn-secondary dropdown-toggle']")
    public WebElement countriesDropdown;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-show-table-options']")
    public WebElement countriesFilters;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement countriesSearchTextbox;
    @FindBy(xpath = "//span[@data-action='create']")
    public WebElement countriesCreate;
    @FindBy(xpath = "//button[@class='btn btn-secondary buttons-reload']")
    public WebElement countriesReload;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement countriesName;
    @FindBy(xpath = "//input[@placeholder='Nationality']")
    public WebElement countriesNationality;
    @FindBy(xpath = "//input[@placeholder='ISO country code, uppercase. Ex: US.']")
    public WebElement countriesISOCode;
    @FindBy(xpath = "//input[@placeholder='Dial code']")
    public WebElement countriesDialCode;
    @FindBy(xpath = "//input[@placeholder='Order by']")
    public WebElement countriesOrder;
    @FindBy(xpath = "//button[@value='save']")
    public WebElement countriesSaveExit;
    @FindBy(xpath = "//button[@value='apply']")
    public WebElement countriesSave;
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement countriesSaveMessage;
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement countriesDeleteOnay;

}
