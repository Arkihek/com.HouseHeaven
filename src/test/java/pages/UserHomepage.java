package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomepage {

    public UserHomepage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // HEADER
    // Home Link locate on header -- Header kismindaki home linki
    @FindBy(xpath = "(//*[@href='https://qa.hauseheaven.com/'])[3]")
    public WebElement home;
    @FindBy(xpath = "//*[@href='https://qa.hauseheaven.com/properties?layout=sidebar']")
    public WebElement listing;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/projects']")
    public WebElement projects;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/agents']")
    public WebElement agents;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/blog']")
    public WebElement blog;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/contact']")
    public WebElement contact;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/login'][1]")
    public WebElement signUp;
    @FindBy(xpath = "(//a[@href='https://qa.hauseheaven.com/login'])[2]")
    public WebElement signIn;
    @FindBy(xpath = "//a[@class='text-success']")
    public WebElement addProperty;
    @FindBy(xpath = "//button[@class='btn search-btn']")
    public WebElement searchResult;
    @FindBy(xpath = "//a[text() = 'Advanced Search']")
    public WebElement advancedSearch;
    @FindBy(xpath = "//*[text() = 'Search']")
    public WebElement search;
    @FindBy(xpath = "//*[text() = 'All Agents']")
    public WebElement allAgents;
    @FindBy(xpath = "//h2[text() = 'Blog']")
    public WebElement Blog;
    @FindBy(xpath = "//h2[text() = 'Contact']")
    public WebElement Contact;
    @FindBy(xpath = "//a[@class = 'link']")
    public WebElement forgotYourPassword;
    @FindBy(xpath = "//input[@type = 'checkbox']")
    public WebElement rememberMe;
    @FindBy(xpath = "//a[@class = 'link d-block d-sm-inline-block text-sm-left text-center']")
    public WebElement registerANewAccount;

    //Kayıtlı kullanıcı locateleri
    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    public WebElement signupButonu;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement usernamegiris;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordGiris;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginGiris;

    //Subscribe(Newsletters) Locateleri
    @FindBy(xpath = "//input[@type='email']")
    public WebElement subscribeTextbox;
    @FindBy(xpath = "//button[@class='btn bg-dark text-white']")
    public WebElement subscribeButon;
    @FindBy(xpath = "//div[@id='alert-container']")
    public WebElement subscribeAlert;


    // Kayıtlı Kullanici HEADER
    // Home Link locate on header -- Header kismindaki home linki

    @FindBy(xpath = "//i[@class ='fas fa-user']")
    public WebElement team5Team5;
    @FindBy(xpath = "//i[@class ='fas fa-sign-out-alt']")
    public WebElement logout;
    @FindBy(xpath = "//h4[text() ='Your Current Credits: ']")
    public WebElement yourCurrentCredits;
    @FindBy(xpath = "//h1[text()='Find accessible homes to rent']")
    public WebElement findAccessibleHomes;

    @FindBy(xpath = "//a[@class='text-white']")
    public WebElement wishlist;
  
     @FindBy(xpath = "(//a[@href='https://qa.hauseheaven.com/properties?layout=sidebar'])[1]")
    public WebElement ListingButton;















 



}
