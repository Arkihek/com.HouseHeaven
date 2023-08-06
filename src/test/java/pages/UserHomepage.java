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














}
