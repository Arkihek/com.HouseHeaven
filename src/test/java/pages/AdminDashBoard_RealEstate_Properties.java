package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashBoard_RealEstate_Properties {

    public AdminDashBoard_RealEstate_Properties(){
        PageFactory.initElements(Driver.getDriver(),this);

    }




    //US34 Admin Dashboard RealEstate Properties Location
    @FindBy(xpath = "//input[@placeholder='Email/Username']")
    public WebElement RealEstatePropertiesAdminUsername;


    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement  RealEstatePropertiesadminPssword;


    @FindBy(xpath = "//span[@class='signin']")
    public WebElement  RealEstatePropertiesAdminSigninButonu;

    @FindBy(xpath = "(//a[@class='nav-link nav-toggle'])[4]")
    public WebElement  RealEstatePropertiesRealEstateLinki;

    @FindBy(xpath = "(//a[normalize-space()='Properties'])[1]")
    public WebElement  RealEstatePropertiesPropertiesLinki;

    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement RealEstatePropertiesilanSayisi;

    @FindBy(xpath = "//span[@data-action='create']")
    public WebElement RealEstatePropertiesCreateButon;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement RealEstatePropertiesFormTitleButon;

    @FindBy(xpath = "(//span[@role='combobox'])[1]")
    public WebElement RealEstatePropertiesFormCityButton;


    @FindBy(xpath = "//button[@value='save']")
    public WebElement RealEstatePropertiesSaveAndExitButton;


    @FindBy(xpath = "(//i[@class='fa fa-edit'])[2]")
    public WebElement RealEstatePropertiesEditButton;

    @FindBy(xpath = "(//i[@class='fa fa-trash'])[1]")
    public WebElement RealEstatePropertiesDeleteButton;

    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement RealEstatePropertiesDeleteButonapprove;


    @FindBy(xpath = "//span[normalize-space()='Locations']")
    public WebElement adminDashboardLocationsButonu;

    @FindBy(xpath = "//a[normalize-space()='Cities']")
    public WebElement aDbLocationsCitiesButonu;


    @FindBy(xpath = "//span[@class='dt-length-records']")
    public WebElement aDbLocationsCitiesNumberOfResult;

    @FindBy(xpath = "//span[@data-href='https://qa.hauseheaven.com/admin/cities/create']")
    public WebElement aDbLocationsCitiesCretaeButon;


    @FindBy(xpath = "//input[@id='name']")
    public WebElement aDbLocationsAddNewCities;


    @FindBy(xpath = "(//span[@role='combobox'])[1]")
    public WebElement aDbLocationsState;

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement aDbLocationsStateSearch;


    @FindBy(xpath = "(//button[@value='save'])[1]")
    public WebElement aDbLocationsSaveAndExit;

    @FindBy(xpath = "//span[@id='select2-country_id-container']")
    public WebElement aDbLocationsCountryButon;

    @FindBy(xpath = "//span[@id='select2-state_id-container']")
    public WebElement adBselect;

    @FindBy(xpath = "//input[@id='order']")
    public WebElement aDbOrder;

    @FindBy(xpath = "(//i[@class='fa fa-edit'])[2]")
    public WebElement aDbLocationsEditButon;

    @FindBy(xpath = "(//i[@class='fa fa-trash'])[1]")
    public WebElement aDbLocationsDeleteButon;

    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement aDbLocationsDeleteButonConfirm;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement aDbLocationsSaveConfirmmessage;

    @FindBy(xpath = "//div[@class='widget-body']//button[@name='submit'][normalize-space()='Save & Exit']")
    public WebElement duzenlemedensonrakiSaveExt;


    @FindBy(xpath = "//div[@class='widget-body']//button[@name='submit'][normalize-space()='Save']")
    public WebElement duzenlemedenSonraSaveButonu;

    @FindBy(xpath = "//a[normalize-space()='Bulk Actions']\n")
    public WebElement LocationsBulkActions;

    @FindBy(xpath = "//span[normalize-space()='Reload']")
    public WebElement LocationsReload;

    @FindBy(xpath = "//span[@class='username d-none d-sm-inline']")
    public WebElement adminLogout;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement admincikis;


}
