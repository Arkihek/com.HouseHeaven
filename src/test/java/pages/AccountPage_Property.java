package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class AccountPage_Property {

    public AccountPage_Property(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Giris sayfa
    @FindBy(xpath = "//img[@class='mr-2']")
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
    @FindBy(xpath = "//input[@role='searchbox']")
    public WebElement cityClicktenSonraYeniKutu;
    @FindBy(xpath = "//input[@placeholder='Property location']")
    public WebElement propertyLocation;
    @FindBy(xpath = "//input[@id='latitude']")
    public WebElement latitude;
    @FindBy(xpath = "//input[@id='longitude']")
    public WebElement longitude;
    @FindBy(xpath = "//input[@id='number_bedroom']")
    public WebElement numberBedrooms;
    @FindBy(xpath = "//input[@id='number_bathroom']")
    public WebElement numberBathrooms;
    @FindBy(xpath = "//input[@id='number_floor']")
    public WebElement numberFloors;
    @FindBy(xpath = "//input[@id='square']")
    public WebElement square;
    @FindBy(xpath = "//input[@id='price-number']")
    public WebElement price;
    @FindBy(xpath = "//input[@id='label']")
    public WebElement propertyLabel;
    @FindBy(xpath = "//select[@class='ui-select']")
    public WebElement cityCenter;
    @FindBy(xpath = "//select[@id='type_id']")
    public WebElement typeForSale;
    @FindBy(xpath = "//button[@value='save']")
    public WebElement saveExit;
    @FindBy(xpath = "//button[@value='apply']")
    public WebElement save;
    @FindBy(xpath = "//span[@id='select2-category_id-container']")
    public WebElement category;
    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement categoryClicktenSonraYeniKutu;
    @FindBy(xpath = "//a[@class='dz-remove']")
    public WebElement removeFile;
    @FindBy(xpath = "(//a[@class='prt-link-detail'])[1]")
    public WebElement listingIlkUrun;
    @FindBy(xpath = "//h3[@class='prt-price-fix']")
    public WebElement yuklenenMulkFiyat;
    @FindBy(xpath = "//*[@id=\"clOne\"]/div/ul/li[3]/text()")
    public WebElement yuklenenMullkSquare;
    @FindBy(xpath = "//*[@id=\"clOne\"]/div/ul/li[2]/text()")
    public WebElement yuklenenMulkBathrooms;
    @FindBy(xpath = "(//div[@class='block-body'])[2]")
    public WebElement yuklenenMulkDescription;
    @FindBy(xpath = "(//i[@class='fa fa-edit'])[1]")
    public WebElement yuklenenMulkEdit;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement yuklenenMulkEditSaveKontol;

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
    public WebElement backyard;
    @FindBy(xpath = "//input[@value='23']")
    public WebElement lowMaintenanceLandscaping;
    @FindBy(xpath = "//input[@value='24']")
    public WebElement soaringCeilings;
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
    public WebElement infinityPool;
    @FindBy(xpath = "//input[@value='37']")
    public WebElement rooftopDeckWithCityViews ;
    @FindBy(xpath = "//input[@value='38']")
    public WebElement securityAndConciergeServices;
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
    @FindBy(xpath = "//*[@class='ti-dashboard']")
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

    //dashboard
    @FindBy(xpath = "//h4[text() = 'Your Current Credits: ']")
    public WebElement yourCurentCredits;
    //settings
    @FindBy(xpath = "//button[@class='btn btn-primary fw6']")
    public WebElement Save;
    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
    public WebElement successful;
    @FindBy(xpath = "//h4[text()='Account Information']")
    public WebElement accountInformation;

    //buycredits
    @FindBy(xpath = "(//button[@class='btn btn-primary mt-2'])[2]")
    public WebElement credits5puan;
    @FindBy(xpath = "(//button[@class='btn btn-primary mt-2'])[3]")
    public WebElement credits6puan;
    @FindBy(xpath = "(//button[@class='btn btn-primary mt-2'])[4]")
    public WebElement credits7puan;
    @FindBy(xpath = "(//button[@class='btn btn-primary mt-2'])[5]")
    public WebElement credits8puan;
    //security
    @FindBy(xpath = "//button[text()='Update password']")
    public WebElement updatePassword;
    @FindBy(xpath = "//span[@data-dismiss='alert']")
    public WebElement Successfull;


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
    @FindBy(xpath = "//button[@data-processing-text='Processing. Please wait...']")
    public WebElement checkout12;

    // ilandaki mülk sahibine mesaj gönderme kısmı

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameIletisim;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement PhoneIletisim;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailIletisim;
    @FindBy(xpath = "//textarea[@placeholder='Message']")
    public WebElement messageIletisim;
    @FindBy(xpath = "//button[@class='btn btn-black btn-md rounded full-width']")
    public WebElement sendMessageIletisim;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement sendMessageIletisimOnay;

    // Mulk islemleri yükleme silme düzenleme vb.
    @FindBy(xpath = "(//div [@class='click slick-initialized slick-slider'])[2]")
    public WebElement mulkIlani;
    @FindBy(xpath = "(//a[@rel='nofollow'])[1]")
    public WebElement girisYaptiginaDairBilgi;
    @FindBy(xpath = "//span[@data-action='create']")
    public WebElement createaccounproperty;
    @FindBy(xpath = "//span[@class='dt-length-records']")
    public WebElement ilanSayiBilgi;
    @FindBy(xpath = "//button[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement cookies;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement yuklenenMulk;
    @FindBy(xpath = "(//i[@class='fa fa-edit'])[1]")
    public WebElement mulkDuzenleme;
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement yuklenenMulkuSil;
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement yuklenenMulkuSilBilgiKutusu;
    @FindBy(xpath = "//span[text()='Publish']")
    public WebElement saveExitUstuElement;
    @FindBy(xpath = "//span[text()='The name field is required.']")
    public WebElement titleGirilmdigindeVerilenHata;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    public WebElement contentGirilmedigindeVerilenHata;
    @FindBy(xpath = "//td[@class='column-key-id sorting_1 dtr-control']")
    public WebElement yuklenenMulkID;


}




