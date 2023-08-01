package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomePage_Body;
import utilities.*;

public class US17_TC002_08 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();
    AccountPage_Property accountPageProperty = new AccountPage_Property();

    @Test(priority = 1)
    public void TC002() {

        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Explore Good Places The element \"9876 Elmwood Avenue\" visible and active");
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_As a registered user, log in with the correct username and password from the signin button
        accountPageProperty.signIn.click();
        ReusableMethods.waitFor(1);
        accountPageProperty.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.waitFor(1);
        accountPageProperty.password.sendKeys(ConfigReader.getProperty("userPass"));
        ReusableMethods.waitFor(1);
        accountPageProperty.login.click();
        ReusableMethods.waitFor(3);


        //03_Confirm that Explore Good Places is visible on the Home page.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.evaluateProperty);
        softAssert.assertTrue(userHomePageBody.exploreGoodPlaces.isDisplayed());
        extentTest.info("exploreGoodPlaces section is visible");
        ReusableMethods.waitFor(3);

        //04_"9876 Elmwood Avenue" is confirmed to be visible and active.
        softAssert.assertTrue(userHomePageBody.goodPlace1.isDisplayed());
        extentTest.info("1. good place element is visible");
        softAssert.assertTrue(userHomePageBody.goodPlace1.isEnabled());
        extentTest.info("1. good place element is enable");

        //05_"9876 Elmwood Avenue" is verified that the scroll buttons work and the add to favourites button works.
        userHomePageBody.GoodPlaceLeftSlickArrow1.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceLeftSlickArrow1.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceLeftSlickArrow1.isEnabled());
        extentTest.info("Left slick arrow is works");

        userHomePageBody.GoodPlaceRightSlickArrow1.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceRightSlickArrow1.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceRightSlickArrow1.isEnabled());
        extentTest.info("Right slick arrow is works");

        userHomePageBody.addToWishList1.click();
        softAssert.assertTrue(userHomePageBody.addToWishList1.isSelected());
        extentTest.info("Add to wish list is selected");

        //06_Clicking on element "9876 Elmwood Avenue" confirms that it redirects to the page with details.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.goodPlace1);
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/properties/9876-elmwood-avenue";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Went to the page with the details.");
        ReusableMethods.waitFor(3);
        extentTest.pass("On the home page Explore Good Places The element \"9876 Elmwood Avenue\" visible and active");

        //07_Browser is closed.
    }

    @Test(priority = 2)
    public void TC003() {


        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Explore Good Places The element \"13579 Elmwood Avenue\" visible and active");
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_As a registered user, log in with the correct username and password from the signin button
        accountPageProperty.signIn.click();
        ReusableMethods.waitFor(1);
        accountPageProperty.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.waitFor(1);
        accountPageProperty.password.sendKeys(ConfigReader.getProperty("userPass"));
        ReusableMethods.waitFor(1);
        accountPageProperty.login.click();
        ReusableMethods.waitFor(3);

        //03_"13579 Elmwood Avenue" is confirmed to be visible and active.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.evaluateProperty);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.goodPlace2.isDisplayed());
        extentTest.info("2. good place element is visible");
        softAssert.assertTrue(userHomePageBody.goodPlace2.isEnabled());
        extentTest.info("2. good place element is enable");

        //04_"13579 Elmwood Avenue" is verified that the scroll buttons work and the add to favourites button works.
        userHomePageBody.GoodPlaceLeftSlickArrow2.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceLeftSlickArrow2.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceLeftSlickArrow2.isEnabled());
        extentTest.info("Left slick arrow is works");

        userHomePageBody.GoodPlaceRightSlickArrow2.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceRightSlickArrow2.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceRightSlickArrow2.isEnabled());
        extentTest.info("Right slick arrow is works");

        userHomePageBody.addToWishList2.click();
        softAssert.assertTrue(userHomePageBody.addToWishList2.isSelected());
        extentTest.info("Add to wish list is selected");

        //05_Clicking on the element "13579 Elmwood Avenue" confirms that it redirects to the page with details.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.goodPlace2);
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/properties/13579-elmwood-avenue";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Went to the page with the details.");
        ReusableMethods.waitFor(3);
        extentTest.pass("On the home page Explore Good Places The element \"13579 Elmwood Avenue\" visible and active");

        //06_Browser is closed.
    }

    @Test(priority = 3)
    public void TC004() {

        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Explore Good Places The element \"2468 Pine Street\" visible and active");
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_As a registered user, log in with the correct username and password from the signin button
        accountPageProperty.signIn.click();
        ReusableMethods.waitFor(1);
        accountPageProperty.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.waitFor(1);
        accountPageProperty.password.sendKeys(ConfigReader.getProperty("userPass"));
        ReusableMethods.waitFor(1);
        accountPageProperty.login.click();
        ReusableMethods.waitFor(3);

        //03_"2468 Pine Street" is confirmed to be visible and active.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.evaluateProperty);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.goodPlace3.isDisplayed());
        extentTest.info("3. good place element is visible");
        softAssert.assertTrue(userHomePageBody.goodPlace3.isEnabled());
        extentTest.info("3. good place element is enable");

        //04_"2468 Pine Street" element is verified that the scroll buttons work and the add to favourites button works.
        userHomePageBody.GoodPlaceLeftSlickArrow3.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceLeftSlickArrow3.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceLeftSlickArrow3.isEnabled());
        extentTest.info("Left slick arrow is works");

        userHomePageBody.GoodPlaceRightSlickArrow3.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceRightSlickArrow3.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceRightSlickArrow3.isEnabled());
        extentTest.info("Right slick arrow is works");

        userHomePageBody.addToWishList3.click();
        softAssert.assertTrue(userHomePageBody.addToWishList3.isSelected());
        extentTest.info("Add to wish list is selected");

        //05_Clicking on element "2468 Pine Street" confirms that it redirects to the page with details.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.goodPlace3);
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/properties/2468-pine-street-1";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Went to the page with the details.");
        ReusableMethods.waitFor(3);
        extentTest.pass("On the home page Explore Good Places The element \"2468 Pine Street\" visible and active");

        //06_Browser is closed.
    }

    @Test(priority = 4)
    public void TC005() {

        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Explore Good Places The element \"9876 Pine Avenue\" visible and active");
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_As a registered user, log in with the correct username and password from the signin button
        accountPageProperty.signIn.click();
        ReusableMethods.waitFor(1);
        accountPageProperty.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.waitFor(1);
        accountPageProperty.password.sendKeys(ConfigReader.getProperty("userPass"));
        ReusableMethods.waitFor(1);
        accountPageProperty.login.click();
        ReusableMethods.waitFor(3);

        //03_"9876 Pine Avenue" is confirmed to be visible and active.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.exploreGoodPlaces);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.goodPlace4.isDisplayed());
        extentTest.info("4. good place element is visible");
        softAssert.assertTrue(userHomePageBody.goodPlace4.isEnabled());
        extentTest.info("4. good place element is enable");

        //04_"9876 Pine Avenue" element is verified that the scroll buttons work and the add to favourites button works.
        userHomePageBody.GoodPlaceLeftSlickArrow4.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceLeftSlickArrow4.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceLeftSlickArrow4.isEnabled());
        extentTest.info("Left slick arrow is works");

        userHomePageBody.GoodPlaceRightSlickArrow4.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceRightSlickArrow4.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceRightSlickArrow4.isEnabled());
        extentTest.info("Right slick arrow is works");

        userHomePageBody.addToWishList4.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.addToWishList4.isSelected());
        extentTest.info("Add to wish list is selected");

        //05_Clicking on element "9876 Pine Avenue" confirms that it redirects to the page with details.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.goodPlace4);
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/properties/9876-pine-avenue";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Went to the page with the details.");
        ReusableMethods.waitFor(3);
        extentTest.pass("On the home page Explore Good Places The element \"9876 Pine Avenue\" visible and active");

        //06_Browser is closed.

    }

    @Test(priority = 5)
    public void TC006() {

        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Explore Good Places The element \"13579 Willow Street\" visible and active");
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_As a registered user, log in with the correct username and password from the signin button
        accountPageProperty.signIn.click();
        ReusableMethods.waitFor(1);
        accountPageProperty.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.waitFor(1);
        accountPageProperty.password.sendKeys(ConfigReader.getProperty("userPass"));
        ReusableMethods.waitFor(1);
        accountPageProperty.login.click();
        ReusableMethods.waitFor(3);

        //03_"13579 Willow Street" is confirmed to be visible and active.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.exploreGoodPlaces);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.goodPlace5.isDisplayed());
        extentTest.info("5. good place element is visible");
        softAssert.assertTrue(userHomePageBody.goodPlace5.isEnabled());
        extentTest.info("5. good place element is enable");

        //04_"13579 Willow Street" element is verified that the scroll buttons work and the add to favourites button works.
        userHomePageBody.GoodPlaceLeftSlickArrow5.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceLeftSlickArrow5.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceLeftSlickArrow5.isEnabled());
        extentTest.info("Left slick arrow is works");

        userHomePageBody.GoodPlaceRightSlickArrow5.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceRightSlickArrow5.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceRightSlickArrow5.isEnabled());
        extentTest.info("Right slick arrow is works");

        userHomePageBody.addToWishList5.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.addToWishList5.isSelected());
        extentTest.info("Add to wish list is selected");

        //05_Clicking on element "13579 Willow Street" confirms that it redirects to the page with details.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.goodPlace5);
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/properties/13579-willow-street";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Went to the page with the details.");
        ReusableMethods.waitFor(3);
        extentTest.pass("On the home page Explore Good Places The element \"13579 Willow Street\" visible and active");

        //06_Browser is closed.
    }

    @Test(priority = 6)
    public void TC007() {


        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Explore Good Places The element \"2468 Willow Street\" visible and active");
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_As a registered user, log in with the correct username and password from the signin button
        accountPageProperty.signIn.click();
        ReusableMethods.waitFor(1);
        accountPageProperty.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.waitFor(1);
        accountPageProperty.password.sendKeys(ConfigReader.getProperty("userPass"));
        ReusableMethods.waitFor(1);
        accountPageProperty.login.click();
        ReusableMethods.waitFor(3);


        //03_"2468 Willow Street" is confirmed to be visible and active.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.exploreGoodPlaces);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.goodPlace6.isDisplayed());
        extentTest.info("6. good place element is visible");
        softAssert.assertTrue(userHomePageBody.goodPlace6.isEnabled());
        extentTest.info("6. good place element is enable");

        //04_"2468 Willow Street" element is verified that the scroll buttons work and the add to favourites button works.
        userHomePageBody.GoodPlaceLeftSlickArrow6.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceLeftSlickArrow6.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceLeftSlickArrow6.isEnabled());
        extentTest.info("Left slick arrow is works");

        userHomePageBody.GoodPlaceRightSlickArrow6.click();
        ReusableMethods.waitFor(1);
        userHomePageBody.GoodPlaceRightSlickArrow6.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.GoodPlaceRightSlickArrow6.isEnabled());
        extentTest.info("Right slick arrow is works");

        userHomePageBody.addToWishList6.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.addToWishList6.isSelected());
        extentTest.info("Add to wish list is selected");

        //05_Clicking on element "2468 Willow Street" confirms that it redirects to the page with details.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.goodPlace6);
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/properties/2468-willow-street";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Went to the page with the details.");
        ReusableMethods.waitFor(3);
        extentTest.pass("On the home page Explore Good Places The element \"2468 Willow Street\" visible and active");

        //06_Browser is closed.

    }

    @Test(priority = 7)
    public void TC008() {
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        //02_As a registered user, log in with the correct username and password from the signin button
        //03_Browse More Properties Button is displayed and tested to be active.
        //04_Browse More Properties When the button is clicked, it is tested that it directs to properties page.
        //05_Browser is closed.

        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Explore Good Places The element \"Browse more properties\" visible and active");
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_As a registered user, log in with the correct username and password from the signin button
        accountPageProperty.signIn.click();
        ReusableMethods.waitFor(1);
        accountPageProperty.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.waitFor(1);
        accountPageProperty.password.sendKeys(ConfigReader.getProperty("userPass"));
        ReusableMethods.waitFor(1);
        accountPageProperty.login.click();
        ReusableMethods.waitFor(3);

        //03_Browse More Properties Button is displayed and tested to be active.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.goodPlace4);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.browseMoreProperties.isDisplayed(),"Browse more properties is not visible");
        extentTest.info("Browse more properties is visible");
        softAssert.assertTrue(userHomePageBody.browseMoreProperties.isEnabled(),"Browse more properties is not enable");
        extentTest.info("Browse more properties is enable");

        //04_Browse More Properties When the button is clicked, it is tested that it directs to properties page.
        userHomePageBody.browseMoreProperties.click();
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/properties";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"We couldn't get to the page with the details.");
        extentTest.pass("On the home page Explore Good Places The element \"Browse more properties\" visible and active");

        //05_browser is closed.

    }
}
