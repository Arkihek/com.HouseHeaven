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

}


