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
    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[1]")
    public WebElement addToWishList1;
    @FindBy(xpath = "(//*[@class='prt-link-detail'])[2]")
    public WebElement goodPlace2;
    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[2]")
    public WebElement GoodPlaceRightSlickArrow2;
    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[2]")
    public WebElement GoodPlaceLeftSlickArrow2;
    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[2]")
    public WebElement addToWishList2;
    @FindBy(xpath = "(//*[@class='prt-link-detail'])[3]")
    public WebElement goodPlace3;
    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[3]")
    public WebElement GoodPlaceRightSlickArrow3;
    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[3]")
    public WebElement GoodPlaceLeftSlickArrow3;
    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[3]")
    public WebElement addToWishList3;
    @FindBy(xpath = "(//*[@class='prt-link-detail'])[4]")
    public WebElement goodPlace4;
    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[4]")
    public WebElement GoodPlaceRightSlickArrow4;
    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[4]")
    public WebElement GoodPlaceLeftSlickArrow4;
    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[4]")
    public WebElement addToWishList4;
    @FindBy(xpath = "(//*[@class='prt-link-detail'])[5]")
    public WebElement goodPlace5;
    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[5]")
    public WebElement GoodPlaceRightSlickArrow5;
    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[5]")
    public WebElement GoodPlaceLeftSlickArrow5;
    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[5]")
    public WebElement addToWishList5;
    @FindBy(xpath = "(//*[@class='prt-link-detail'])[6]")
    public WebElement goodPlace6;
    @FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[6]")
    public WebElement GoodPlaceRightSlickArrow6;
    @FindBy(xpath = "(//button[@class='slick-prev slick-arrow'])[6]")
    public WebElement GoodPlaceLeftSlickArrow6;
    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[6]")
    public WebElement addToWishList6;
    @FindBy(xpath = "(//*[@class='btn btn-theme-light-2 rounded'])[1]")
    public WebElement browseMoreProperties;


    //*--------Find By Locations--------
    @FindBy(xpath = "(//*[@class='sec-heading center'])[3]")
    public WebElement findByLocations;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4'])[4]")
    public WebElement denverElement;
    @FindBy(xpath = "(//*[@class='lp-property-view'])[1]")
    public WebElement denverElementClick;
    @FindBy(xpath = "//*[@class='m-0']")
    public WebElement findByElementResultProperties;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4'])[5]")
    public WebElement phoenixElement;
    @FindBy(xpath = "(//*[@class='lp-property-view'])[2]")
    public WebElement phoenixElementClick;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4'])[6]")
    public WebElement miamiElement;
    @FindBy(xpath = "(//*[@class='lp-property-view'])[3]")
    public WebElement miamiElementClick;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4'])[7]")
    public WebElement newYorkElement;
    @FindBy(xpath = "(//*[@class='lp-property-view'])[4]")
    public WebElement newYorkElementClick;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4'])[8]")
    public WebElement seattleElement;
    @FindBy(xpath = "(//*[@class='lp-property-view'])[5]")
    public WebElement seattleElementClick;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4'])[9]")
    public WebElement austinElement;
    @FindBy(xpath = "(//*[@class='lp-property-view'])[6]")
    public WebElement austinElementClick;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4'])[10]")
    public WebElement chicagoElement;
    @FindBy(xpath = "(//*[@class='lp-property-view'])[7]")
    public WebElement chicagoElementClick;
    @FindBy(xpath = "(//*[@class='col-lg-4 col-md-4'])[11]")
    public WebElement losAngelesElement;
    @FindBy(xpath = "(//*[@class='lp-property-view'])[8]")
    public WebElement losAngelesElementClick;
    @FindBy(xpath = "(//*[@class='btn btn-theme-light-2 rounded'])[2]")
    public WebElement browseByLocations;

    //*--------Good Reviews By Customers--------

    @FindBy(xpath = "(//*[@class='sec-heading center'])[4]")
    public WebElement goodReviewsByCustomers;
    @FindBy(xpath = "(//*[@class='smart-textimonials smart-center slick-initialized slick-slider'])")
    public WebElement slideBarCustomers;


    //*--------See Our Packages--------
    @FindBy(xpath = "(//*[@class='col-lg-7 col-md-10 text-center'])[4]")
    public WebElement seeOurPackages;
    @FindBy(xpath = "(//*[@class='btn-pricing'])[1]")
    public WebElement firstPostChoosePlanButton;
    @FindBy(xpath = "(//*[@class='btn-pricing'])[2]")
    public WebElement secondPostChoosePlanButton;
    @FindBy(xpath = "(//*[@class='btn-pricing'])[3]")
    public WebElement thirdPostChoosePlanButton;

    //*--------Recently Viewed Properties--------
    @FindBy(xpath = "(//*[@class='container'])[9]")
    public WebElement recentlyViewedProperties;
    @FindBy(xpath = "(//*[@class='prt-link-detail'])[7]")
    public WebElement recentlyViewedPropertiesLeftElement;
    @FindBy(xpath = "(//*[@class='prt-link-detail'])[8]")
    public WebElement recentlyViewedPropertiesCentreElement;
    @FindBy(xpath = "(//*[@class='prt-link-detail'])[9]")
    public WebElement recentlyViewedPropertiesRightElement;
    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[7]")
    public WebElement recentlyViewedPropertiesLeftElementWishlist;
    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[8]")
    public WebElement recentlyViewedPropertiesCentreElementWishlist;
    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[9]")
    public WebElement recentlyViewedPropertiesRightElementWishlist;
    @FindBy(xpath = "(//*[@class='prt-link-detail'])[9]")
    public WebElement houseLink;
    @FindBy(xpath = "(//h3)[1]")
    public WebElement houseName;
    @FindBy(xpath = "(//*[@class='btn-pricing'])[4]")
    public WebElement getRecentlyViewedPropertiesLocate;
    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    public WebElement addedToWishList;


    //*--------realEstateAgent--------
    @FindBy(xpath = "//*[@class='call-to-act-head']")
    public WebElement realEstateAgent;
    @FindBy(xpath = "//*[@class='btn btn-call-to-act']")
    public WebElement signUpTodayButton;

    //*--------search--------
    @FindBy(xpath = "//*[@class='hero-search']")
    public WebElement findAccesibleHomesToRent;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement searchForLocationBox;
    @FindBy(xpath = "(//*[@class='selection'])[1]")
    public WebElement minPriceBox;
    @FindBy(xpath = "(//*[@class='selection'])[2]")
    public WebElement maxPriceBox;
    @FindBy(xpath = "(//*[@class='selection'])[3]")
    public WebElement propertyTypeBox;
    @FindBy(xpath = "(//*[@class='selection'])[4]")
    public WebElement bedRoomsBox;
    @FindBy(xpath = "(//*[@class='selection'])[5]")
    public WebElement propertyLocationBox;
    @FindBy(xpath = "//*[@class='btn search-btn']")
    public WebElement searchResultBox;
    @FindBy(xpath = "(//*[@class='listing-card-info-price'])[1]")
    public WebElement priceElement1;
    @FindBy(xpath = "(//*[@class='listing-card-info-price'])[2]")
    public WebElement priceElement2;
    @FindBy(xpath = "(//*[@class='listing-card-info-price'])[3]")
    public WebElement priceElement3;
    @FindBy(xpath = "(//*[@class='listing-card-info-icon'])[1]")
    public WebElement bedroomNumber;
    @FindBy(xpath = "(//*[@class='listing-location'])[1]")
    public WebElement locationElement;








}
