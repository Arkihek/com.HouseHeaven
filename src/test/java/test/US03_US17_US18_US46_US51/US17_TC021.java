package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomePage_Body;
import pages.UserHomepage;
import utilities.*;

public class US17_TC021 extends TestBaseReport {


    @Test
    public void test21(){
        SoftAssert softAssert = new SoftAssert();
        UserHomePage_Body userHomePageBody = new UserHomePage_Body();
        Actions actions = new Actions(Driver.getDriver());
        AccountPage_Property accountPageProperty = new AccountPage_Property();
        UserHomepage userHomepage = new UserHomepage();

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test","On the home page, make sure that Recently Viewed Properties visible and active");
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

        //03_ Want To Become A Real Estate Agent? is confirmed to be visible.
        JSUtilities.scrollToElement(Driver.getDriver(),userHomePageBody.realEstateAgent);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.realEstateAgent.isDisplayed(),"Want To Become A Real Estate Agent? is not visible");
        extentTest.pass("Want To Become A Real Estate Agent? is visible");

        //04_Sign Up Today button is displayed and confirmed to be active.
        softAssert.assertTrue(userHomePageBody.signUpTodayButton.isDisplayed());
        extentTest.info("Sign Up Today button is displayed ");
        softAssert.assertTrue(userHomePageBody.signUpTodayButton.isEnabled());
        extentTest.info("Sign Up Today button is enable ");
        extentTest.pass("Sign Up Today button is displayed and enable");

        softAssert.assertAll();

        Driver.closeDriver();

        //06_Browser is closed.


    }

}
