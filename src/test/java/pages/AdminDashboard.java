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
    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[4]")
    public WebElement realEstate;

    @FindBy(xpath = "//*[@id='cms-plugins-real-estate']")
    public WebElement realEstateBasligindakiler;
    @FindBy(xpath = "//*[@id='cms-plugins-re-feature']")
    public WebElement features;
    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[11]")
    public WebElement locations;
    @FindBy(xpath = "//*[@id='cms-plugins-location']")
    public WebElement locationsBasligindakiler;
    @FindBy(xpath = "//*[@id='cms-plugins-state']")
    public WebElement states;

    @FindBy(xpath = "//a[text()='1']")
    public WebElement page1;
    @FindBy(xpath = "//a[text()='2']")
    public WebElement page2;
    @FindBy(xpath = "//a[text()='3']")
    public WebElement page3;
    @FindBy(xpath = "//a[text()='4']")
    public WebElement page4;
    @FindBy(xpath = "//a[text()='5']")
    public WebElement page5;
    @FindBy(xpath = "//a[text()='6']")
    public WebElement page6;
    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement records;
    @FindBy(xpath = "//span[@data-action='create']")
    public WebElement create;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement title;
    @FindBy(xpath = "//span[@role='textbox']")
    public WebElement icon;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement save;
    @FindBy(xpath = "(//a[@href='https://qa.hauseheaven.com/admin/real-estate/property-features/edit/76'])[3]")
    public WebElement edit;
    @FindBy(xpath = "(//a[@href='#'])[3]")
    public WebElement delete;
    @FindBy(xpath = "//i[@class='fas fa-sync']")
    public WebElement reload;
    @FindBy(xpath = "//span[@class='dt-length-records']")
    public WebElement stetasSayisi;
    @FindBy(xpath = "//input[@id='name']")
    public  WebElement name;
    @FindBy(xpath = "//input[@id='abbreviation']")
    public  WebElement abbreviation;
    @FindBy(xpath = "//span[text()='Select a country...']")
    public  WebElement country;
    @FindBy(xpath = "//input[@id='order']")
    public  WebElement order;
    @FindBy(xpath = "//i[@class='fa fa-check-circle']")
    public WebElement savee;
    @FindBy(xpath = "//i[@class='fa fa-edit']")
    public WebElement ediit;
    @FindBy(xpath = "//a[@role='button']")
    public WebElement deletee;




        
    

    // Admin DashBoard Giris

    @FindBy(xpath = "//input[@placeholder='Email/Username']")
    public WebElement adminUsername;


    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement  adminPasswordd;


    @FindBy(xpath = "//span[@class='signin']")
    public WebElement  AdminSigninButon;





}
