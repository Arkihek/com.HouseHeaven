package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomePage_Blog {

    public UserHomePage_Blog(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Blog sayfasi
    @FindBy (xpath = "//a[@href='https://qa.hauseheaven.com/blog']")
    public WebElement blog;
    //Tum blog sayfalarinin linklerinin locate'leri
    @FindBy (xpath = "(//a[@class='bl-continue'])[1]")
    public WebElement birinciBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[2]")
    public WebElement ikinciBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[3]")
    public WebElement ucuncuBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[4]")
    public WebElement dorduncuBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[5]")
    public WebElement besinciBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[6]")
    public WebElement altinciBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[7]")
    public WebElement yedinciBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[8]")
    public WebElement sekizinciBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[9]")
    public WebElement dokuzuncuBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[10]")
    public WebElement onuncuBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[11]")
    public WebElement onbirinciBlogSayfa;
    @FindBy (xpath = "(//a[@class='bl-continue'])[12]")
    public WebElement onikinciBlogSayfa;
    @FindBy (xpath = "(//a[@href='https://qa.hauseheaven.com/news/pratical-tips-for-home-design'])[2]")
    public WebElement onucuncuBlogSayfa;






















    //US09_TC003 locate'leri
    @FindBy(className = "ipt-title")
    public WebElement blogBaslik;
    @FindBy(className = "post-featured-img")
    public WebElement blogResim;
    @FindBy(className = "ck-content")
    public WebElement blogIcerik;

    //US09_TC004 locate'leri
    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement categories;
    @FindBy(xpath = "(//a[@class='text-dark'])[1]")
    public WebElement gardenDesing;
    @FindBy(xpath = "(//a[@class='text-dark'])[1]")
    public WebElement houseDesign;
    @FindBy(xpath = "(//a[@class='text-dark'])[1]")
    public WebElement latestNews;
    @FindBy(xpath = "(//a[@class='text-dark'])[1]")
    public WebElement buildingMaterials;
    @FindBy(xpath = "//*[text()='Featured properties']")
    public WebElement featuredProperties;
    @FindBy(xpath = "(//div[@class='sides_list_property_detail'])[1]")
    public WebElement birinciFeaturedProperties;
    @FindBy(xpath = "(//div[@class='sides_list_property_detail'])[2]")
    public WebElement ikinciFeaturedProperties;
    @FindBy(xpath = "(//div[@class='sides_list_property_detail'])[3]")
    public WebElement ucuncuFeaturedProperties;
    @FindBy(xpath = "(//div[@class='sides_list_property_detail'])[4]")
    public WebElement dorduncuFeaturedProperties;
    @FindBy(xpath = "(//div[@class='sides_list_property_detail'])[5]")
    public WebElement besinciFeaturedProperties;


    //US09_TC005 locate'leri
    @FindBy(xpath = "//a[@title='Share on Facebook']")
    public WebElement facebookButonu;
    @FindBy(xpath = "//a[@title='Share on Linkedin']")
    public WebElement linkedinButonu;
    @FindBy(xpath = "//a[@title='Share on Twitter']")
    public WebElement twitterButonu;


}
