package test.US08_US23_US34_US50;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Header_AgentsPage;
import utilities.*;

import java.util.List;

public class US08_TC01_TC02_TC03 extends TestBaseReport {

    @Test
    public void TC01() {

        Header_AgentsPage headerAgentsPage = new Header_AgentsPage();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("Redirect to Agent link", "Agent should be able to click on the link");
        //Browser opens
        // Go to Url

        headerAgentsPage.agentsPageAgentLinki.click();
        // Verify and click the Agents link on the top bar of the homepage

        ReusableMethods.waitFor(3);
        softAssert.assertTrue(headerAgentsPage.agentsPageAgentLinki.isDisplayed(), "Agent link cannot be displayed");
        extentTest.info("Agent Link verified");

        // Verifies that it goes to the Agent page
        String expectedTitle = "https://qa.hauseheaven.com/agents";
        String actualTitle = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualTitle.equals(expectedTitle), "Not logged in to the Agents page");
        extentTest.info("Agents page is open");
        ReusableMethods.waitFor(2);
        // softAssert.assertAll();

    }

    @Test
    public void TC02() {
        Header_AgentsPage headerAgentsPage = new Header_AgentsPage();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        headerAgentsPage.agentsPageAgentLinki.click();
        extentTest = extentReports.createTest("View real estate agent advertisement page and information", "Number of houses should display real estate agent information");

        ReusableMethods.waitFor(3);
        //Number and information of real estate ads
        List<WebElement> emlakciEvsayisi = Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("numberOfHouses")));
        for (WebElement each : emlakciEvsayisi) {
            softAssert.assertTrue(each.isDisplayed(), "the number of house adverts could not be displayed");
            System.out.println(each.getText());
        }
        extentTest.pass("Home numbers display test");
        List<WebElement> emlakcilarinBilgileri = Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("realtorinformation")));
        for (WebElement eachinformation : emlakcilarinBilgileri) {
            softAssert.assertTrue(eachinformation.isDisplayed(), "Realtor information not displayed");
            System.out.println(eachinformation.getText());
        }
        extentTest.info("Realtor information display");
        extentTest.pass("Real estate agent information display test");
        ReusableMethods.waitFor(2);

    }

    @Test
    public void TC03() {
        Header_AgentsPage headerAgentsPage = new Header_AgentsPage();
        SoftAssert softAssert = new SoftAssert();

        extentTest = extentReports.createTest("Display For Sale and For Rent links", "For Sale and For Rent should be viewable and verified");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        headerAgentsPage.agentsPageAgentLinki.click();

        ReusableMethods.waitFor(3);
        headerAgentsPage.agentsPageClickOnPhoto.click();
        //For Sale and For Rent should be viewable and verified
        JSUtilities.scrollToElement(Driver.getDriver(), headerAgentsPage.agentPageAgentsForSaleLink);
        softAssert.assertTrue(headerAgentsPage.agentPageAgentsForSaleLink.isDisplayed(), "Unable to display Agents for sale link");
        softAssert.assertTrue(headerAgentsPage.agentPageAgentsForSaleLink.isEnabled(), "Agents for sale link inaccessible");
        extentTest.pass("Agents for sale link display and access test");
        softAssert.assertTrue(headerAgentsPage.agentsPageAgentsForRentLinki.isDisplayed(), "Unable to display Agent for Rent link");
        softAssert.assertTrue(headerAgentsPage.agentsPageAgentsForRentLinki.isEnabled(), "Agent for Rent link accessible");
        extentTest.pass("Agents for rent link display and accessibility test");
        ReusableMethods.waitFor(2);

    }

}