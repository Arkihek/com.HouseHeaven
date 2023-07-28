package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Header_AgentsPage {

public Header_AgentsPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/agents']")
    public WebElement agentsPageAgentLinki;



@FindBy(xpath = "(//span[@class='fr-position'])[1]")
    public WebElement agentsRealEstateNumberOfHomes1;

    @FindBy(xpath = "(//span[@class='fr-position'])[2]")
    public WebElement agentsRealEstateNumberOfHomes2;

    @FindBy(xpath = "(//span[@class='fr-position'])[3]")
    public WebElement agentsRealEstateNumberOfHomes3;
    @FindBy(xpath = "(//span[@class='fr-position'])[4]")
    public WebElement agentsRealEstateNumberOfHomes4;
    @FindBy(xpath = "(//span[@class='fr-position'])[5]")
    public WebElement agentsRealEstateNumberOfHomes5;
    @FindBy(xpath = "(//span[@class='fr-position'])[6]")
    public WebElement agentsRealEstateNumberOfHomes6;
    @FindBy(xpath = "(//span[@class='fr-position'])[7]")
    public WebElement agentsRealEstateNumberOfHomes7;

    @FindBy(xpath = "(//span[@class='fr-position'])[8]")
    public WebElement agentsRealEstateNumberOfHomes8;

    @FindBy(xpath = "(//span[@class='fr-position'])[9]")
    public WebElement agentsRealEstateNumberOfHomes9;

    @FindBy(xpath = "(//span[@class='fr-position'])[10]")
    public WebElement agentsRealEstateNumberOfHomes10;
    @FindBy(xpath = "(//span[@class='fr-position'])[11]")
    public WebElement agentsRealEstateNumberOfHomes11;
    @FindBy(xpath = "(//span[@class='fr-position'])[12]")
    public WebElement agentsRealEstateNumberOfHomes12;

    @FindBy(xpath = "(//a[text()='View'])[1]")
    public WebElement agentsPageviewLinkiAgent;

    @FindBy(xpath = "//ul[@class='dw-proprty-info']")
    public WebElement agentsPageAgentsInfoView;

    @FindBy(xpath = "(//a[normalize-space()='For Sale'])[1]")
    public WebElement agentPageAgentsForSaleLink;
    @FindBy(xpath = "(//span[@class='prt-types sale'])[1]")
    public WebElement agentsPageAgentForSaleClickTesti;


    @FindBy(xpath = "//a[text()='For Rent']")
    public WebElement agentsPageAgentsForRentLinki;


    @FindBy(xpath = "//button[normalize-space()='Allow cookies']")
    public WebElement agentPageAllowCookiesKapama;

    @FindBy(xpath = "(//div[@class='fr-grid-thumb'])[1]")
    public WebElement agentsPageClickOnPhoto;






}
