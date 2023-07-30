package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Body;
import utilities.*;

public class US03_TC009_017 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();
    Actions actions = new Actions(Driver.getDriver());

    @Test(priority = 1)
    public void test09() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page Find by Locations \"Denver\" in the section pears your element And being active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //On the 02_home page, it is correct that the Find by Locations section is visible.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.findByLocations);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.findByLocations.isDisplayed(), "Find by locations is not visible");
        extentTest.pass("Find by locations is visible");

        //03_ "Denver" element is visible and active.
        softAssert.assertTrue(userHomePageBody.denverElement.isDisplayed(), "Denver Element is not visible");
        softAssert.assertTrue(userHomePageBody.denverElement.isEnabled(), "Denver Element is not enable");
        extentTest.pass("Denver Element is visible and enable");

        //04_ When the "denver" element is clicked on, it is correct.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.denverElementClick);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/city/denver";
        softAssert.assertEquals(actualUrl, expectedUrl, "We couldn't get to the page with the details.");
        extentTest.pass("Went to the page with the details.");

        //05_ When the number of properties shown in the "Denver" element is clicked on the page where the details are in the same number is the same.
        String expectedPropertiesNumber = "1 Results";
        System.out.println(userHomePageBody.findByElementResultProperties.getText());
        String actualPropertiesNumber = userHomePageBody.findByElementResultProperties.getText();

        Assert.assertTrue(actualPropertiesNumber.contains(expectedPropertiesNumber), "The expected number of results and the result are not the same");
        extentTest.pass("The number of expected results and the result are the same ");
        softAssert.assertAll();

        //06_Browser is closed.

    }

    @Test(priority = 2)
    public void test10() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page Find by Locations \"Phoenix\" in the section pears your element And being active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.findByLocations);
        ReusableMethods.waitFor(3);

        //02_ "Phoenix" element is visible and active.
        softAssert.assertTrue(userHomePageBody.phoenixElement.isDisplayed(), "Phonix Element is not visible");
        softAssert.assertTrue(userHomePageBody.phoenixElement.isEnabled(), "Phonix Element is not enable");
        extentTest.pass("Phonix Element is visible and enable");

        //03_ When the "Phoenix" element is clicked on, it is correct.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.phoenixElementClick);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/city/phoenix";
        softAssert.assertEquals(actualUrl, expectedUrl, "We couldn't get to the page with the details.");
        extentTest.pass("Went to the page with the details.");

        //04_ When the number of properties shown in the "Phoenix" element is clicked on the page where the details are the same.
        String expectedPropertiesNumber = "1 Results";
        System.out.println(userHomePageBody.findByElementResultProperties.getText());
        String actualPropertiesNumber = userHomePageBody.findByElementResultProperties.getText();

        Assert.assertTrue(actualPropertiesNumber.contains(expectedPropertiesNumber), "The expected number of results and the result are not the same");
        extentTest.pass("The number of expected results and the result are the same ");
        softAssert.assertAll();

        //05_Browser is closed.
    }

    @Test(priority = 3)
    public void test11() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page Find by Locations \"Miami\" in the section pears your element And being active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.findByLocations);
        ReusableMethods.waitFor(3);

        //02_ "Miami" element is visible and active.
        softAssert.assertTrue(userHomePageBody.miamiElement.isDisplayed(), "Miami Element is not visible");
        softAssert.assertTrue(userHomePageBody.miamiElement.isEnabled(), "Miami Element is not enable");
        extentTest.pass("Miami Element is visible and enable");

        //03_ When the "miami" element is clicked on, it is correct.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.miamiElementClick);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/city/miami";
        softAssert.assertEquals(actualUrl, expectedUrl, "We couldn't get to the page with the details.");
        extentTest.pass("Went to the page with the details.");

        //04_ When the number of properties shown in the "miami" element is clicked on the page where the details are the same.
        String expectedPropertiesNumber = "3 Results";
        System.out.println(userHomePageBody.findByElementResultProperties.getText());
        String actualPropertiesNumber = userHomePageBody.findByElementResultProperties.getText();

        Assert.assertTrue(actualPropertiesNumber.contains(expectedPropertiesNumber), "The expected number of results and the result are not the same");
        extentTest.pass("The number of expected results and the result are the same ");
        softAssert.assertAll();

        //05_Browser is closed.
    }

    @Test(priority = 4)
    public void test12() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page Find by Locations \"New York\" in the section pears your element And being active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.newYorkElement);
        ReusableMethods.waitFor(3);

        //02_ "New York" element is visible and active.
        softAssert.assertTrue(userHomePageBody.newYorkElement.isDisplayed(), "New York Element is not visible");
        softAssert.assertTrue(userHomePageBody.newYorkElement.isEnabled(), "New York Element is not enable");
        extentTest.pass("New York Element is visible and enable");

        //03_ When the "New York" element is clicked on, the details are directed to the page.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.newYorkElementClick);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/city/new-york";
        softAssert.assertEquals(actualUrl, expectedUrl, "We couldn't get to the page with the details.");
        extentTest.pass("Went to the page with the details.");

        //04_ When the number of properties shown in the "New York" element is clicked on the page where the details are the same.
        String expectedPropertiesNumber = "5 Results";
        System.out.println(userHomePageBody.findByElementResultProperties.getText());
        String actualPropertiesNumber = userHomePageBody.findByElementResultProperties.getText();

        softAssert.assertTrue(actualPropertiesNumber.contains(expectedPropertiesNumber), expectedPropertiesNumber + ": expected result - " + userHomePageBody.findByElementResultProperties.getText() + ": actual result");
        extentTest.pass("The number of expected results and the result are the same ");
        softAssert.assertAll();

        //05_Browser is closed.
    }

    @Test(priority = 5)
    public void test13() {
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        //02_ "Seattle" element is visible and active.
        //03_ When the "seattle" element is clicked on, the details are directed to the page.
        //04_ When the number of proprtetes shown in the "Seattle" element is clicked on the page where the details are the same.
        //05_Browser is closed.

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page Find by Locations \"Seattle\" in the section pears your element And being active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.seattleElement);
        ReusableMethods.waitFor(3);

        //02_ "Seattle" element is visible and active.
        softAssert.assertTrue(userHomePageBody.seattleElement.isDisplayed(), "Seattle Element is not visible");
        softAssert.assertTrue(userHomePageBody.seattleElement.isEnabled(), "Seattle Element is not enable");
        extentTest.pass("Seattle Element is visible and enable");

        //03_ When the "seattle" element is clicked on, the details are directed to the page.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.seattleElementClick);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/city/seattle";
        softAssert.assertEquals(actualUrl, expectedUrl, "We couldn't get to the page with the details.");
        extentTest.pass("Went to the page with the details.");

        //04_ When the number of properties shown in the "seattle" element is clicked on the page where the details are the same.
        String expectedPropertiesNumber = "1 Results";
        System.out.println(userHomePageBody.findByElementResultProperties.getText());
        String actualPropertiesNumber = userHomePageBody.findByElementResultProperties.getText();

        Assert.assertTrue(actualPropertiesNumber.contains(expectedPropertiesNumber), "The expected number of results and the result are not the same");
        extentTest.pass("The number of expected results and the result are the same ");
        softAssert.assertAll();

        //05_Browser is closed.
    }

    @Test(priority = 6)
    public void test14() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page Find by Locations \"Austin\" in the section pears your element And being active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.seattleElement);
        ReusableMethods.waitFor(3);

        //02_ "Austin" element is visible and active.
        softAssert.assertTrue(userHomePageBody.austinElement.isDisplayed(), "Austin Element is not visible");
        softAssert.assertTrue(userHomePageBody.austinElement.isEnabled(), "Austin Element is not enable");
        extentTest.pass("Austin Element is visible and enable");

        //03_ When the "Austin" element is clicked on, the details are directed to the page.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.austinElementClick);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/city/austin";
        softAssert.assertEquals(actualUrl, expectedUrl, "We couldn't get to the page with the details.");
        extentTest.pass("Went to the page with the details.");

        //04_ When the number of properties shown in the "Austin" element is clicked on the page where the details are the same.
        String expectedPropertiesNumber = "3 Results";
        System.out.println(userHomePageBody.findByElementResultProperties.getText());
        String actualPropertiesNumber = userHomePageBody.findByElementResultProperties.getText();

        Assert.assertTrue(actualPropertiesNumber.contains(expectedPropertiesNumber), "The expected number of results and the result are not the same");
        extentTest.pass("The number of expected results and the result are the same ");
        softAssert.assertAll();

        //05_Browser is closed.
    }

    @Test(priority = 7)
    public void test15() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page Find by Locations \"Chicago\" in the section pears your element And being active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.chicagoElement);
        ReusableMethods.waitFor(3);

        //02_ "Chicago" element is visible and active.
        softAssert.assertTrue(userHomePageBody.chicagoElement.isDisplayed(), "Chicago Element is not visible");
        softAssert.assertTrue(userHomePageBody.chicagoElement.isEnabled(), "Chicago Element is not enable");
        extentTest.pass("Chicago Element is visible and enable");

        //03_ When the "Chicago" element is clicked on, the details are directed to the page.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.chicagoElementClick);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/city/chicago";
        softAssert.assertEquals(actualUrl, expectedUrl, "We couldn't get to the page with the details.");
        extentTest.pass("Went to the page with the details.");

        //04_ When the number of properties shown in the "Chicago" element is clicked on the page where the details are the same.
        String expectedPropertiesNumber = "1 Results";
        System.out.println(userHomePageBody.findByElementResultProperties.getText());
        String actualPropertiesNumber = userHomePageBody.findByElementResultProperties.getText();

        Assert.assertTrue(actualPropertiesNumber.contains(expectedPropertiesNumber), "The expected number of results and the result are not the same");
        extentTest.pass("The number of expected results and the result are the same ");
        softAssert.assertAll();

        //05_Browser is closed.
    }

    @Test(priority = 8)
    public void test16() {
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        //02_ "Los Angeles" element is visible and active.
        //03_ When the "Los Angeles" element is clicked on, it is accurately directed to the page of the details.
        //04_ When the number of properties shown in the "Los Angeles" element is clicked on the page where the details are the same.
        //05_Browser is closed.


        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page Find by Locations \"Los Angeles\" in the section pears your element And being active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.chicagoElement);
        ReusableMethods.waitFor(3);

        //02_ "Los Angeles" element is visible and active.
        softAssert.assertTrue(userHomePageBody.losAngelesElement.isDisplayed(), "Los Angeles Element is not visible");
        softAssert.assertTrue(userHomePageBody.losAngelesElement.isEnabled(), "Los Angeles Element is not enable");
        extentTest.pass("Los Angeles Element is visible and enable");

        //03_ When the "Los Angeles" element is clicked on, the details are directed to the page.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.losAngelesElementClick);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/city/los-angeles";
        softAssert.assertEquals(actualUrl, expectedUrl, "We couldn't get to the page with the details.");
        extentTest.pass("Went to the page with the details.");

        //04_ When the number of properties show in the "Los Angeles" element is clicked on the page where the details are the same.
        String expectedPropertiesNumber = "4 Results";
        System.out.println(userHomePageBody.findByElementResultProperties.getText());
        String actualPropertiesNumber = userHomePageBody.findByElementResultProperties.getText();

        Assert.assertTrue(actualPropertiesNumber.contains(expectedPropertiesNumber), "The expected number of results and the result are not the same");
        extentTest.pass("The number of expected results and the result are the same ");
        softAssert.assertAll();

        //05_Browser is closed.
    }

    @Test(priority = 9)
    public void test17() {
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page In the Find by Locations section \"Browse by Locations\" button to appear and active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.chicagoElement);
        ReusableMethods.waitFor(3);

        //02_Browse by locations button is visible and tested that it is active.
        softAssert.assertTrue(userHomePageBody.browseByLocations.isDisplayed(), "Browse by locations Element is not visible");
        softAssert.assertTrue(userHomePageBody.browseByLocations.isEnabled(), "Browse by locations Element is not enable");
        extentTest.pass("Browse by locations is visible and enable");

        //03_browse by locations button is tested to the Properties page.
        JSUtilities.clickWithJS(Driver.getDriver(),userHomePageBody.browseByLocations);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/properties";
        softAssert.assertEquals(actualUrl,expectedUrl,"Did not go to the requested page");
        extentTest.pass("went to properties page");

        softAssert.assertAll();

        //04_browser is closed.
    }
}

