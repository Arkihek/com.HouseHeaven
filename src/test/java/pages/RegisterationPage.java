package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterationPage {

    public RegisterationPage(){
          PageFactory.initElements(Driver.getDriver(),this);
}

    //REGİSTER

    @FindBy(xpath = "//*[@class='add-listing']")  //Sign in locate
    public WebElement sigInButonu;

    @FindBy(xpath = "//*[@class='link d-block d-sm-inline-block text-sm-left text-center']")  //new Register locate
    public WebElement registerNewAccount;


    @FindBy(id="first_name") //Register first name locate
    public WebElement registerFirstName;

    @FindBy(id="last_name") //Register Last name locate
    public WebElement registerLastName;

    @FindBy(id="email") // Register E mail locate
    public WebElement registerEMail;

    @FindBy(id="username")  // Register username
    public WebElement registerUserName;

    @FindBy(id="password") // Register password locate
    public WebElement registerPassword;

    @FindBy(id="password-confirm") //Register password tekrar
    public WebElement registerPasswordConfirm;

    @FindBy(xpath = "//*[@class='btn btn-md full-width btn-theme-light-2 rounded']") // Register buton locate
    public WebElement registerButon;

    @FindBy(xpath = "Dasbord yazi locate ==== //*[@title='Profile']")
    public WebElement dashbordYazi;


    @FindBy(id="email")
    public WebElement email;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(xpath = "//*[@class='btn btn-md full-width btn-theme-light-2 rounded']")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@rel='nofollow'])[1]")
    public WebElement user;
    @FindBy(xpath = "//*[@title='Settings']")
    public WebElement settingsButton;
    @FindBy(xpath = "//*[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement cookies;
    @FindBy(xpath = "//*[@title='credits']")
    public WebElement buyCredits;
    @FindBy(xpath ="//*[@title='Properties']")
    public WebElement properties;
    @FindBy(xpath = "//*[@class='ti-unlock']")
    public WebElement security;
    @FindBy(xpath ="//*[@class='dashboard-stat widget-1']" )
    public WebElement approvedProperties;
    @FindBy(xpath = "//*[@class='dashboard-stat widget-2']")
    public WebElement pendingApproved;
    @FindBy(xpath = "//*[@class='dashboard-stat widget-3']")
    public WebElement rejectedProperties;
    @FindBy(xpath = "//*[@title='Profile']")
    public WebElement dashboardButton;
    @FindBy(xpath = "(//*[@rel='nofollow'])[2]")
    public WebElement logout;



}
