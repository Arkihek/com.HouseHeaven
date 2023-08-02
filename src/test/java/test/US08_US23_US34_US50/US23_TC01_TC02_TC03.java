package test.US08_US23_US34_US50;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Header_AgentsPage;

import pages.UserHomepage;
import utilities.*;

import java.util.List;

public class US23_TC01_TC02_TC03 extends TestBaseReport {

    Header_AgentsPage headerAgentsPage = new Header_AgentsPage();
    UserHomepage userHomePage = new UserHomepage();
    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void setup(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        userHomePage.signupButonu.click();
        userHomePage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        userHomePage.loginGiris.click();
        headerAgentsPage.agentsPageAgentLinki.click();
    }

    @Test
    public void TC01() {
        extentTest = extentReports.createTest("Redirect to Agent link", "Agent should be able to click on the link");
        //Browser opens
        // Go to Url
        // Verify and click the Agents link on the top bar of the homepage
        headerAgentsPage.agentsPageAgentLinki.click();
        String expectedTitle = "https://qa.hauseheaven.com/agents";
        String actualTitle = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualTitle.equals(expectedTitle), "Not logged in to the Agents page");
        extentTest.info("Agents page is open");
        softAssert.assertAll();
    }
    @Test
    public void TC02() {

        extentTest = extentReports.createTest("View real estate agent advertisement page and information", "Number of houses should display real estate agent information");

        //Number and information of real estate ads

        headerAgentsPage.agentsPageAgentLinki.click();
        List<WebElement> emlakciEvsayisi = Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("numberOfHouses")));
        for (WebElement each : emlakciEvsayisi) {
            softAssert.assertTrue(each.isDisplayed(), "the number of house adverts could not be displayed");
        }
        extentTest.pass("Home numbers display test");
        List<WebElement> emlakcilarinBilgileri = Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("realtorinformation")));
        for (WebElement eachinformation : emlakcilarinBilgileri) {
            softAssert.assertTrue(eachinformation.isDisplayed(), "Realtor information not displayed");
            System.out.println(eachinformation.getText());
        }
        extentTest.pass("Real estate agent information display test");
        softAssert.assertAll();

    }

    @Test
    public void TC03() {
        extentTest = extentReports.createTest("Display For Sale and For Rent links", "For Sale and For Rent should be viewable and verified");
        JSUtilities.scrollToElement(Driver.getDriver(), headerAgentsPage.agentsPageviewLinkiAgent);
        headerAgentsPage.agentPageAllowCookiesKapama.click();
        ReusableMethods.wait(2);
        headerAgentsPage.agentsPageClickOnPhoto.click();
        JSUtilities.scrollToElement(Driver.getDriver(), headerAgentsPage.agentPageAgentsForSaleLink);
        softAssert.assertTrue(headerAgentsPage.agentPageAgentsForSaleLink.isDisplayed(), "Unable to display Agents for sale link");
        softAssert.assertTrue(headerAgentsPage.agentPageAgentsForSaleLink.isEnabled(), "Agents for sale link inaccessible");
        extentTest.pass("Agents for sale link display and access test");
        softAssert.assertTrue(headerAgentsPage.agentsPageAgentsForRentLinki.isDisplayed(), "Unable to display Agent for Rent link");
        softAssert.assertTrue(headerAgentsPage.agentsPageAgentsForRentLinki.isEnabled(), "Agent for Rent link accessible");
        extentTest.pass("Agents for rent link display and accessibility test");
        softAssert.assertAll();
    }
}




