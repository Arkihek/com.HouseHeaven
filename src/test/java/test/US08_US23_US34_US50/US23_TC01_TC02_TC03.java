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

    @Test
    public void TC01() {

        Header_AgentsPage headerAgentsPage1 = new Header_AgentsPage();
        UserHomepage userHomePage1 = new UserHomepage();
        SoftAssert softAssert1 = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        userHomePage1.signupButonu.click();
        userHomePage1.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage1.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        userHomePage1.loginGiris.click();
        headerAgentsPage1.agentsPageAgentLinki.click();
        extentTest = extentReports.createTest("Redirect to Agent link", "Agent should be able to click on the link");
        //Browser opens
        // Go to Url
        // Verify and click the Agents link on the top bar of the homepage
        headerAgentsPage1.agentsPageAgentLinki.click();
        String expectedTitle = "https://qa.hauseheaven.com/agents";
        String actualTitle = Driver.getDriver().getCurrentUrl();
        softAssert1.assertTrue(actualTitle.equals(expectedTitle), "Not logged in to the Agents page");
        extentTest.info("Agents page is open");

        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
    @Test
    public void TC02() {
        Header_AgentsPage headerAgentsPage1 = new Header_AgentsPage();
        UserHomepage userHomePage1 = new UserHomepage();
        SoftAssert softAssert1 = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        userHomePage1.signupButonu.click();
        userHomePage1.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage1.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        userHomePage1.loginGiris.click();
        headerAgentsPage1.agentsPageAgentLinki.click();

        extentTest = extentReports.createTest("View real estate agent advertisement page and information", "Number of houses should display real estate agent information");

        //Number and information of real estate ads

        headerAgentsPage1.agentsPageAgentLinki.click();
        List<WebElement> emlakciEvsayisi = Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("numberOfHouses")));
        for (WebElement each : emlakciEvsayisi) {
            softAssert1.assertTrue(each.isDisplayed(), "the number of house adverts could not be displayed");
        }
        extentTest.pass("Home numbers display test");
        List<WebElement> emlakcilarinBilgileri = Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("realtorinformation")));
        for (WebElement eachinformation : emlakcilarinBilgileri) {
            softAssert1.assertTrue(eachinformation.isDisplayed(), "Realtor information not displayed");
            System.out.println(eachinformation.getText());
        }
        extentTest.pass("Real estate agent information display test");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();

    }

    @Test
    public void TC03() {
        Header_AgentsPage headerAgentsPage1 = new Header_AgentsPage();
        UserHomepage userHomePage1 = new UserHomepage();
        SoftAssert softAssert1 = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        userHomePage1.signupButonu.click();
        userHomePage1.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage1.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        userHomePage1.loginGiris.click();
        ReusableMethods.waitFor(2);
        headerAgentsPage1.agentsPageAgentLinki.click();
        ReusableMethods.waitFor(2);
        extentTest = extentReports.createTest("Display For Sale and For Rent links", "For Sale and For Rent should be viewable and verified");
        JSUtilities.scrollToElement(Driver.getDriver(), headerAgentsPage1.agentsPageviewLinkiAgent);
        headerAgentsPage1.agentPageAllowCookiesKapama.click();
        ReusableMethods.wait(2);
        headerAgentsPage1.agentsPageClickOnPhoto.click();
        JSUtilities.scrollToElement(Driver.getDriver(), headerAgentsPage1.agentPageAgentsForSaleLink);
        softAssert1.assertTrue(headerAgentsPage1.agentPageAgentsForSaleLink.isDisplayed(), "Unable to display Agents for sale link");
        softAssert1.assertTrue(headerAgentsPage1.agentPageAgentsForSaleLink.isEnabled(), "Agents for sale link inaccessible");
        extentTest.pass("Agents for sale link display and access test");
        softAssert1.assertTrue(headerAgentsPage1.agentsPageAgentsForRentLinki.isDisplayed(), "Unable to display Agent for Rent link");
        softAssert1.assertTrue(headerAgentsPage1.agentsPageAgentsForRentLinki.isEnabled(), "Agent for Rent link accessible");
        extentTest.pass("Agents for rent link display and accessibility test");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
}





