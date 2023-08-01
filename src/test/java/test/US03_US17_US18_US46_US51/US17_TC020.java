package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomePage_Body;
import pages.UserHomepage;
import utilities.*;

public class US17_TC020 extends TestBaseReport {
    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();
    Actions actions = new Actions(Driver.getDriver());
    AccountPage_Property accountPageProperty = new AccountPage_Property();
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void test20(){
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        //02_As a registered user, log in with the correct username and password from the signin button







        //10_Browser will be closed.

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

        //03_Click on the Listing page
        JSUtilities.clickWithJS(Driver.getDriver(),userHomepage.ListingButton);
        ReusableMethods.waitFor(3);

        //04_Click on any house and save its name
        JSUtilities.scrollToElement(Driver.getDriver(),userHomePageBody.houseLink);
        ReusableMethods.waitFor(3);
        JSUtilities.clickWithJS(Driver.getDriver(),userHomePageBody.houseLink);
        ReusableMethods.waitFor(3);
        JSUtilities.scrollToElement(Driver.getDriver(),userHomePageBody.houseName);
        ReusableMethods.waitFor(3);
        String houseName = userHomePageBody.houseName.getText();
        System.out.println(houseName);


        //05_Back to page Home
        Driver.getDriver().navigate().to(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //06_Recently Viewed Properties is verified to be visible.
        JSUtilities.scrollToElement(Driver.getDriver(),userHomePageBody.getRecentlyViewedPropertiesLocate);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.recentlyViewedProperties.isDisplayed(),"Recently Viewed Properties section is not visible.");
        extentTest.pass("Recently Viewed Properties is visible");

        //07_It is confirmed that the house we have previously saved is visible in the Recently section.
        String recentlyHouseName = userHomePageBody.recentlyViewedPropertiesLeftElement.getText();
        System.out.println(recentlyHouseName);
        softAssert.assertEquals(recentlyHouseName,houseName);
        extentTest.pass("Same house is visible in the Recently section");

        //08_Test that the button to add the element to the wishlist is visible and active
        userHomePageBody.recentlyViewedPropertiesLeftElementWishlist.click();
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.addedToWishList.isDisplayed());
        ReusableMethods.waitFor(3);
        extentTest.info("Add to wish list is selected");

        //09_Confirm that clicking Element takes you to the page with details.
        recentlyHouseName = userHomePageBody.recentlyViewedPropertiesLeftElement.getText();
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.recentlyViewedPropertiesLeftElement);
        extentTest.pass("Same house is visible in the Recently section");
        System.out.println(recentlyHouseName);
        softAssert.assertEquals(recentlyHouseName,houseName);
        softAssert.assertAll();

        //10_Browser will be closed.
    }

}
