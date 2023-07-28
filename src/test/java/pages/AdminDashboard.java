package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {

    public AdminDashboard(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Admin DashBoard Giris

    @FindBy(xpath = "//input[@placeholder='Email/Username']")
    public WebElement adminUsername;


    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement  adminPassword;


    @FindBy(xpath = "//span[@class='signin']")
    public WebElement  AdminSigninButon;





}
