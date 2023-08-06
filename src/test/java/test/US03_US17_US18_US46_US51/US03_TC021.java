package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Body;
import utilities.*;

public class US03_TC021 extends TestBaseReport {



    @Test
    public void test21(){
        SoftAssert softAssert = new SoftAssert();
        UserHomePage_Body userHomePageBody = new UserHomePage_Body();
        Actions actions = new Actions(Driver.getDriver());

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test","On the home page, make sure that Recently Viewed Properties visible and active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_ Want To Become A Real Estate Agent? is confirmed to be visible.
        JSUtilities.scrollToElement(Driver.getDriver(),userHomePageBody.realEstateAgent);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.realEstateAgent.isDisplayed(),"Want To Become A Real Estate Agent? is not visible");
        extentTest.pass("Want To Become A Real Estate Agent? is visible");

        //03_Sign Up Today button is displayed and confirmed to be active.
        softAssert.assertTrue(userHomePageBody.signUpTodayButton.isDisplayed());
        extentTest.info("Sign Up Today button is displayed ");
        softAssert.assertTrue(userHomePageBody.signUpTodayButton.isEnabled());
        extentTest.info("Sign Up Today button is enable ");
        extentTest.pass("Sign Up Today button is displayed and enable");

        //04_Sign Up Today confirms that it redirects to the Register page when clicked.
        JSUtilities.clickWithJS(Driver.getDriver(),userHomePageBody.signUpTodayButton);
        ReusableMethods.waitFor(3);
        String expectedUrl = "https://qa.hauseheaven.com/register";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("this button goes to https://qa.hauseheaven.com/register url");

        softAssert.assertAll();

        //05_Browser is closed.


    }

}
