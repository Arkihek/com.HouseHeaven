package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeaderProjects {
    public HeaderProjects(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = " //*[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement projectsCookies;

    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/projects']")
    public WebElement projectsLink;

    @FindBy(xpath = "//*[@class='item-sorting clearfix mb-2']")
    public WebElement numberOfProjects;
    @FindBy(xpath = "//div[@class='listing-img-wrapper']")
    public WebElement allProcets;
    @FindBy(xpath = "(//div[@class='listing-img-wrapper'])[1]")
    public WebElement allProcets1;
@FindBy(xpath = "//div[@class='col-lg-12 col-md-12 col-sm-12']")
    public WebElement ilanDetails;
@FindBy(xpath = "(//div[@class='slick-slide slick-current slick-active'])[1]")
public WebElement ilkIlanGorseli;
@FindBy(xpath = "(//*[@class='listing-img-wrapper'])[1]")
public WebElement palmParadiseResidences;
@FindBy(id ="select2-filter_country_id-container")
    public WebElement countryDropdown;
@FindBy(xpath = "//*[@class='btn search-btn']")
    public WebElement searchButton;
@FindBy(id = "select2-filter_state_id-container")
    public WebElement stateDropdown;
@FindBy(id = "select2-filter_city_id-container")
    public WebElement cityDropdown;
@FindBy(id = "select2-ptypes-container")
    public WebElement categoryDropdown;





}
