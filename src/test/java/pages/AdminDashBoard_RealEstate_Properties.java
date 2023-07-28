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

}
