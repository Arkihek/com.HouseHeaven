package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {

public AdminDashboard() {


    PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@name='username']")
    public WebElement adminEMail;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement adminPassword;

    @FindBy(xpath = "//*[@class='signin']")
    public WebElement adminSignIn;

    @FindBy(xpath = "//*[@name='remember']")
    public WebElement adminRemember;
    @FindBy(xpath = "(//*[@class='dropdown-toggle dropdown-header-name'])[3]")
    public WebElement adminGirisKontrol;

    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[2]")
    public  WebElement blog;

    @FindBy(xpath = "//*[@id='cms-plugins-blog']")
    public WebElement blogBasligindakiler;


    // Admin DashBoard Giris

    @FindBy(xpath = "//input[@placeholder='Email/Username']")
    public WebElement adminUsername;


    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement  adminPasswordd;


    @FindBy(xpath = "//span[@class='signin']")
    public WebElement  AdminSigninButon;


    @FindBy(xpath = "(//span[@class='title'])[4]")
    public WebElement realEstate;

    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    public WebElement realEstateProperties;

    @FindBy(xpath = "(//i[@class='fa fa-edit'])[2]")
    public WebElement yukklenenIlanIDAdminEdit;

    @FindBy(xpath = "//span[@id='select2-moderation_status-container']")
    public WebElement moderationStatus;

    @FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
    public WebElement adminModernStatusUstuSaveExit;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement pendingAprowed;


    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[10]")
    public WebElement paymentsButton;

    @FindBy(xpath = "(//*[@class='nav-link'])[9]")
    public WebElement transactionsButton;

    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[1]")
    public WebElement paymentsPayerName1;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[2]")
    public WebElement paymentsPayerName2;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[3]")
    public WebElement paymentsPayerName3;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[4]")
    public WebElement paymentsPayerName4;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[5]")
    public WebElement paymentsPayerName5;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[6]")
    public WebElement paymentsPayerName6;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[7]")
    public WebElement paymentsPayerName7;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[8]")
    public WebElement paymentsPayerName8;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[9]")
    public WebElement paymentsPayerName9;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[10]")
    public WebElement paymentsPayerName10;
    @FindBy(xpath = "(//*[@class='nav-item '])[1]")
    public WebElement dashboardButton;

    @FindBy(xpath = "(//*[@class='nav-link'])[1]")
    public WebElement dashboardPosts;

    @FindBy(xpath = "(//*[@class='nav-link'])[2]")
    public WebElement dashboardCatagories;

    @FindBy(xpath = "(//*[@class='nav-link'])[3]")
    public  WebElement dashboardTags;

    @FindBy(xpath = "//*[@data-action='create']")
    public WebElement postCreate;

    @FindBy(xpath = "//*[@class='btn btn-secondary buttons-collection dropdown-toggle buttons-export']")
    public WebElement postExportButton;

    @FindBy(xpath = "//*[@class='btn btn-secondary buttons-reload']")
    public WebElement postReoledButton;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement postCreateName;

    @FindBy(xpath = "(//textarea[@class='form-control'])[1]")
    public WebElement postDescription;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement postParagraf;

    @FindBy(xpath = "(//button[@name='submit'])[1]")
    public WebElement postSaveExit;

    @FindBy(xpath = "(//button[@name='submit'])[2]")
    public WebElement postSave;

    @FindBy(xpath = "(//*[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement postUpdate;

    @FindBy(xpath = "(//*[@data-bs-original-title='Delete'])[1]")
    public WebElement postDelete;

    @FindBy(xpath = "//*[@name='status']")
    public WebElement postStatus;

    @FindBy(xpath = "(//*[@type='checkbox'])[3]")
    public WebElement postCatagories;

    @FindBy(xpath  ="(//*[@class='float-end btn btn-danger delete-crud-entry'])[1]")
    public WebElement confirmDelete;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement catagoriesName;

    @FindBy(xpath = "//*[@class='select2-selection__rendered']")
    public WebElement catagoriesParent;

    @FindBy(xpath = "(//*[@class='form-control is-valid'])[2]")
    public WebElement catagoriesDescription;

    @FindBy(xpath = "(//*[@class='form-control is-valid'])[3]")
    public WebElement catagoriesOrder;

    @FindBy(xpath = "(//*[@class='form-control'])[4]")
    public WebElement catagoriesIcon;

    @FindBy(xpath = "(//*[@class='btn btn-info'])[1]")
    public WebElement catagoriesSaveExit;

    @FindBy(id="select2-parent_id-result-ltip-1")
    public WebElement catagoriesParentSelect2;


    @FindBy(xpath = "(//*[@class='select2-results__option select2-results__option--selectable'])[1]")
    public WebElement catagoriesParentSelect;

    @FindBy(xpath = "(//*[@class='datatables__info_wrap'])")
    public WebElement tagsRecordSayi;

    @FindBy(xpath = "//*[@class='column-key-id sorting_1']")
    public WebElement tagsOrnek;

    @FindBy(xpath = "//*[@data-action='create']")
    public WebElement tagsCreate;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement tagsDescription;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement tagsName;

    @FindBy(xpath = "(//*[@name='submit'])[2]")
    public WebElement tagsSave;

    @FindBy(xpath = "(//*[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement tagsUpdate;

    @FindBy(xpath = "(//*[@class='fa fa-trash'])[1]")
    public WebElement tagsDelete;

    @FindBy(xpath = "(//*[@class='float-end btn btn-danger delete-crud-entry'])[1]")
    public WebElement tagsDeleteOnay;
}


