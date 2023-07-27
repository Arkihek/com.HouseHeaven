package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage_Property {


    // Giris sayfa
    @FindBy(className = "text-success")
    public WebElement addProperty;
    @FindBy(className = "add-listing")
    public WebElement signIn;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement mailKutusu;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement login;

    // Add Property bölümü
    @FindBy(xpath = "//input[@id='name']")
    public WebElement title;
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement description;
    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement content;
    @FindBy(xpath = "//div[@id='multiple-upload']")
    public WebElement images;
    @FindBy(xpath = "//span[@id='select2-city_id-container']")
    public WebElement city;
    @FindBy(xpath = "//input[@placeholder='Property location']")
    public WebElement PropertyLocation;
    @FindBy(xpath = "//input[@id='latitude']")
    public WebElement Latitude;
    @FindBy(xpath = "//input[@id='longitude']")
    public WebElement Longitude;
    @FindBy(xpath = "//input[@id='number_bedroom']")
    public WebElement NumberBedrooms;
    @FindBy(xpath = "//input[@id='number_bathroom']")
    public WebElement NumberBathrooms;
    @FindBy(xpath = "//input[@id='number_floor']")
    public WebElement NumberFloors;
    @FindBy(xpath = "//input[@id='square']")
    public WebElement Square;
    @FindBy(xpath = "//input[@id='price-number']")
    public WebElement Price;
    @FindBy(xpath = "//input[@id='label']")
    public WebElement PropertyLabel;
    @FindBy(xpath = "//select[@class='ui-select']")
    public WebElement cityCenter;
    @FindBy(xpath = "//select[@id='type_id']")
    public WebElement typeForSale;
    @FindBy(xpath = "//button[@value='save']")
    public WebElement saveExit;
    @FindBy(xpath = "//button[@value='apply']")
    public WebElement save;

    // Add Property bölümü (Feature kısmı)
    @FindBy(xpath = "(//input[@value='1'])[3]")
    public WebElement wifi;
    @FindBy(xpath = "//input[@value='2']")
    public WebElement parking;
    @FindBy(xpath = "//input[@value='3']")
    public WebElement swimmingPool;
    @FindBy(xpath = "//input[@value='4']")
    public WebElement balcony;
    @FindBy(xpath = "//input[@value='5']")
    public WebElement garden;
    @FindBy(xpath = "//input[@value='6']")
    public WebElement security;
    @FindBy(xpath = "//input[@value='7']")
    public WebElement fitnessCenter;
    @FindBy(xpath = "//input[@value='8']")
    public WebElement airConditioning;
    @FindBy(xpath = "//input[@value='9']")
    public WebElement centralHeating;
    @FindBy(xpath = "//input[@value='10']")
    public WebElement laundryRoom;
    @FindBy(xpath = "//input[@value='11']")
    public WebElement petsAllow ;
    @FindBy(xpath = "//input[@value='12']")
    public WebElement spaMassage;
    @FindBy(xpath = "//input[@value='14']")
    public WebElement landscapedBackyard;
    @FindBy(xpath = "//input[@value='15']")
    public WebElement coveredPatio;
    @FindBy(xpath = "//input[@value='16']")
    public WebElement fireplace;
    @FindBy(xpath = "//input[@value='17']")
    public WebElement landscapedYard;
    @FindBy(xpath = "//input[@value='18']")
    public WebElement attachedGarage;
    @FindBy(xpath = "//input[@value='19']")
    public WebElement rooftopDeck;
    @FindBy(xpath = "//input[@value='20']")
    public WebElement privateBalcony;
    @FindBy(xpath = "//input[@value='21']")
    public WebElement walkinCloset;
    @FindBy(xpath = "//input[@value='22']")
    public WebElement Backyard;
    @FindBy(xpath = "//input[@value='23']")
    public WebElement lowMaintenanceLandscaping;
    @FindBy(xpath = "//input[@value='24']")
    public WebElement SoaringCeilings;
    @FindBy(xpath = "//input[@value='25']")
    public WebElement wellMaintainedGarden;
    @FindBy(xpath = "//input[@value='26']")
    public WebElement highCeilings;
    @FindBy(xpath = "//input[@value='27']")
    public WebElement privateBackyard;
    @FindBy(xpath = "//input[@value='28']")
    public WebElement privateElevator;
    @FindBy(xpath = "//input[@value='29']")
    public WebElement highEndKitchenAppliances;
    @FindBy(xpath = "//input[@value='30']")
    public WebElement rooftopTerraceWithJacuzzi;
    @FindBy(xpath = "//input[@value='31']")
    public WebElement gatedCommunityWithSecurity;
    @FindBy(xpath = "//input[@value='32']")
    public WebElement fitnessCenterAndSpa;
    @FindBy(xpath = "//input[@value='33']")
    public WebElement smartHomeTechnology;
    @FindBy(xpath = "//input[@value='34']")
    public WebElement smartHomeAutomation;
    @FindBy(xpath = "//input[@value='35']")
    public WebElement wineCellar;
    @FindBy(xpath = "//input[@value='36']")
    public WebElement InfinityPool;
    @FindBy(xpath = "//input[@value='37']")
    public WebElement rooftopDeckWithCityViews ;
    @FindBy(xpath = "//input[@value='38']")
    public WebElement SecurityAndConciergeServices;
    @FindBy(xpath = "//input[@value='39']")
    public WebElement privateLanai;
    @FindBy(xpath = "//input[@value='40']")
    public WebElement chefsKitchenWithHighEndAppliances;
    @FindBy(xpath = "//input[@value='41']")
    public WebElement outdoorBarbecueArea;
    @FindBy(xpath = "//input[@value='42']")
    public WebElement resortStylePoolAndClubhouse;
    @FindBy(xpath = "//input[@value='43']")
    public WebElement gourmetKitchenWithQuartzCountertops;
    @FindBy(xpath = "//input[@value='44']")
    public WebElement homeTheaterAndGameRoom;
    @FindBy(xpath = "//input[@value='45']")
    public WebElement gatedCommunityWithSecurity45;
    @FindBy(xpath = "//input[@value='46']")
    public WebElement privateRooftopDeckWithInfinityPool;
    @FindBy(xpath = "//input[@value='47']")
    public WebElement chefsKitchenWithPremiumAppliances ;
    @FindBy(xpath = "//input[@value='48']")
    public WebElement privateHotTubAndOutdoorFireplace ;
    @FindBy(xpath = "//input[@value='49']")
    public WebElement homeOffice;
    @FindBy(xpath = "//input[@value='50']")
    public WebElement skiinSkiOutAccess;
    @FindBy(xpath = "//input[@value='51']")
    public WebElement privateRooftopTerraceWithinfinityPool ;
    @FindBy(xpath = "//input[@value='52']")
    public WebElement stateoftheartKitchenWithPremiumAppliances;
    @FindBy(xpath = "//input[@value='53']")
    public WebElement spainspiredBathrooms;
    @FindBy(xpath = "//input[@value='54']")
    public WebElement yogaStudio;
    @FindBy(xpath = "//input[@value='55']")
    public WebElement securityAndValetServices ;
    @FindBy(xpath = "//input[@value='56']")
    public WebElement homeTheaterAndGameRoom56;




    // Sayfaya loginden sonraki AccountPage bölümü
    @FindBy(xpath = "//a[@title='Profile']")
    public WebElement dashboard;
    @FindBy(xpath = "//a[@title='Settings']")
    public WebElement settings;
    @FindBy(xpath = "//a[@title='credits']")
    public WebElement buyCredits;
    @FindBy(xpath = "//a[@title='Properties']")
    public WebElement properties;
    @FindBy(xpath = "//a[@title='Write a property']")
    public WebElement writeaProperty;
    @FindBy(xpath = "//i[@class='ti-unlock']")
    public WebElement securitybody;
    @FindBy(xpath = "//a[@title='Logout']")
    public WebElement logout;

    //buycredits
    @FindBy(xpath = "(//button[@class='btn btn-primary mt-2'])[3]")
    public WebElement credits5puan;

    // Kredi Kartı Locet'leri
    @FindBy(xpath = "//input[@id='stripe-number']")
    public WebElement cardNumber;
    @FindBy(xpath = "//input[@id='stripe-exp']")
    public WebElement cardYilGun;
    @FindBy(xpath = "//input[@id='stripe-cvc']")
    public WebElement cardCVC;
    @FindBy(xpath = "//input[@id='stripe-name']")
    public WebElement cardName;
    @FindBy(xpath = "//button[@class='payment-checkout-btn btn btn-info']")
    public WebElement checkout;

}




