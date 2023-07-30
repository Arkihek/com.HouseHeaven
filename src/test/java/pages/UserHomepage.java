package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomepage {

    public UserHomepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

// HEADER
    // Home Link locate on header -- Header kismindaki home linki
    @FindBy(xpath = "(//*[@href='https://qa.hauseheaven.com/'])[3]")
    public WebElement home;
    @FindBy(xpath = "//*[@href='https://qa.hauseheaven.com/properties?layout=sidebar']")
    public WebElement listing;

    //Kayıtlı kullanıcı locateleri
    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    public WebElement signupButonu;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement usernamegiris;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordGiris;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginGiris;

    @FindBy(xpath = "//a[@class='text-white']")
    public WebElement wishlist;















}
