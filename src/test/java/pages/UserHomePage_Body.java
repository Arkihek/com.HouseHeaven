package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomePage_Body {

    public UserHomePage_Body() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //--------Cookies--------
    @FindBy(xpath = "//button[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement cookiesButton;


    //--------How It Works?--------
    @FindBy(xpath = "(//*[@class='col-lg-7 col-md-10 text-center'])[1]")
    public WebElement howItWorks;

    @FindBy(xpath = "(//*[@class='middle-icon-features-content'])[1]")
    public WebElement evaluateProperty;

    @FindBy(xpath = "(//*[@class='middle-icon-features-content'])[2]")
    public WebElement meetYourAgent;

    @FindBy(xpath = "(//*[@class='middle-icon-features-content'])[3]")
    public WebElement closeTheDeal;


    //*--------Explore Good Places--------
    @FindBy(xpath = "(//*[@class='sec-heading center'])[2]")
    public WebElement exploreGoodPlaces;

    @FindBy(xpath = "(//*[@class='prt-link-detail'])[1]")
    public WebElement goodPlace1;

    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[1]")
    public WebElement GoodPlaceRightSlickArrow1;

    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[1]")
    public WebElement GoodPlaceLeftSlickArrow1;

    @FindBy(xpath = "(//*[@class='prt-link-detail'])[2]")
    public WebElement goodPlace2;

    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[2]")
    public WebElement GoodPlaceRightSlickArrow2;

    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[2]")
    public WebElement GoodPlaceLeftSlickArrow2;

    @FindBy(xpath = "(//*[@class='prt-link-detail'])[3]")
    public WebElement goodPlace3;

    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[3]")
    public WebElement GoodPlaceRightSlickArrow3;

    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[3]")
    public WebElement GoodPlaceLeftSlickArrow3;

    @FindBy(xpath = "(//*[@class='prt-link-detail'])[4]")
    public WebElement goodPlace4;

    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[4]")
    public WebElement GoodPlaceRightSlickArrow4;

    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[4]")
    public WebElement GoodPlaceLeftSlickArrow4;

    @FindBy(xpath = "(//*[@class='prt-link-detail'])[5]")
    public WebElement goodPlace5;

    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[5]")
    public WebElement GoodPlaceRightSlickArrow5;

    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[5]")
    public WebElement GoodPlaceLeftSlickArrow5;

    @FindBy(xpath = "(//*[@class='prt-link-detail'])[6]")
    public WebElement goodPlace6;

    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[6]")
    public WebElement GoodPlaceRightSlickArrow6;

    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[6]")
    public WebElement GoodPlaceLeftSlickArrow6;


    //*--------search--------
    @FindBy(xpath = "//*[@class='input-with-icon']")
    public WebElement searchForLocationsBox;


}
