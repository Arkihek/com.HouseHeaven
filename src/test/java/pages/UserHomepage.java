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


















}
