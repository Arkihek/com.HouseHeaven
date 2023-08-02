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

}


