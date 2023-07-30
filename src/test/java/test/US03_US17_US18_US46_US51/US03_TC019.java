package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Body;
import utilities.*;

public class US03_TC019 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test19() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test","On the home page See Our Packages in the section Elements Visible and activation of buttons");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_SEE OUR Packages section is confirmed.
        JSUtilities.scrollToElement(Driver.getDriver(),userHomePageBody.seeOurPackages);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.seeOurPackages.isDisplayed());
        extentTest.pass("See Our Packages section is visible");

        //03_choose plan buttons are visible and active.
        WebElement[] chooseButtonsElement = {userHomePageBody.firstPostChoosePlanButton,userHomePageBody.secondPostChoosePlanButton,userHomePageBody.thirdPostChoosePlanButton};
        int number = 1;
        for (WebElement eachElement : chooseButtonsElement
             ) {
            softAssert.assertTrue(eachElement.isDisplayed());
            extentTest.info(number+". choose plan is visible");
            softAssert.assertTrue(eachElement.isEnabled());
            extentTest.info(number+". choose plan is enable");
            number++;
        }
        extentTest.pass("choose plan buttons are visible and active.");
        ReusableMethods.waitFor(3);

        //04_When the left button is pressed, it is confirmed that it redirects to the login page
        JSUtilities.clickWithJS(Driver.getDriver(),userHomePageBody.firstPostChoosePlanButton);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/login";
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("When the left button is pressed, it redirects to the login page");

        //05_ To the previous page is returned.
        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(3);

        //06_When the centre button is pressed, it is confirmed that it redirects to the login page
        JSUtilities.clickWithJS(Driver.getDriver(),userHomePageBody.secondPostChoosePlanButton);
        ReusableMethods.waitFor(3);
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.hauseheaven.com/login";
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("When the centre button is pressed, it redirects to the login page");

        //07_ To the previous page is returned.
        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(3);

        //08_When the button on the right is pressed, it is confirmed that it redirects to the login page
        JSUtilities.clickWithJS(Driver.getDriver(),userHomePageBody.thirdPostChoosePlanButton);
        ReusableMethods.waitFor(3);
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.hauseheaven.com/login";
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("When the right button is pressed, it redirects to the login page");

        softAssert.assertAll();

        //09_Browser is closed.



    }
}

