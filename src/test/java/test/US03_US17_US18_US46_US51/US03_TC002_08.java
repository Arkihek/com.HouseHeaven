package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Body;
import utilities.*;

public class US03_TC002_08 extends TestBaseReport {
    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();
    Actions actions = new Actions(Driver.getDriver());

    @Test(priority = 1)
    public void TC002() {
        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Explore Good Places The element \"9876 Elmwood Avenue\" visible and active");
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //On the 02_home page, the Explore Good Places section is visible.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.exploreGoodPlaces);
        softAssert.assertTrue(userHomePageBody.exploreGoodPlaces.isDisplayed());
        extentTest.info("exploreGoodPlaces section is visible");
        ReusableMethods.waitFor(3);

        //03_ "9876 Elmwood Avenue" element is visible and active.
        softAssert.assertTrue(userHomePageBody.goodPlace1.isDisplayed());
        extentTest.info("First good place element is visible");
        softAssert.assertTrue(userHomePageBody.goodPlace1.isEnabled());
        extentTest.info("First good place element is enable");

        //04_ "9876 Elmwood Avenue" element is correct by the slide buttons.
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

        //05_"9876 Elmwood Avenue" is climbed to the page of the details.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.goodPlace1);
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/properties/9876-elmwood-avenue";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Went to the page with the details.");
        ReusableMethods.waitFor(3);
        extentTest.pass("On the home page Explore Good Places The element \"9876 Elmwood Avenue\" visible and active");

        //06_Browser is closed.
    }

    @Test(priority = 2)
    public void TC003() {
        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Explore Good Places The element \"9876 Elmwood Avenue\" visible and active");
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //On the 02_home page, the Explore Good Places section is visible.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.exploreGoodPlaces);
        softAssert.assertTrue(userHomePageBody.exploreGoodPlaces.isDisplayed());
        extentTest.info("exploreGoodPlaces section is visible");
        ReusableMethods.waitFor(3);

        //03_ "9876 Elmwood Avenue" element is visible and active.
        softAssert.assertTrue(userHomePageBody.goodPlace1.isDisplayed());
        extentTest.info("First good place element is visible");
        softAssert.assertTrue(userHomePageBody.goodPlace1.isEnabled());
        extentTest.info("First good place element is enable");

        //04_ "9876 Elmwood Avenue" element is correct by the slide buttons.
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

        //05_"9876 Elmwood Avenue" is climbed to the page of the details.
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.goodPlace1);
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/properties/9876-elmwood-avenue";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Went to the page with the details.");
        ReusableMethods.waitFor(3);
        extentTest.pass("On the home page Explore Good Places The element \"9876 Elmwood Avenue\" visible and active");

        //06_Browser is closed.
    }
}
