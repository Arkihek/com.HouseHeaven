package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Body;
import utilities.*;

public class US03_TC018 extends TestBaseReport {


    @Test
    public void test18(){

        SoftAssert softAssert = new SoftAssert();
        UserHomePage_Body userHomePageBody = new UserHomePage_Body();
        Actions actions = new Actions(Driver.getDriver());

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On Home Page page Good Reviews by Customers in the section Elements appear And the feature of the shifting");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_Good Reviews by Customers is visible.
        JSUtilities.scrollToElement(Driver.getDriver(),userHomePageBody.browseByLocations);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.goodReviewsByCustomers.isDisplayed());
        extentTest.pass("Good Reviews by Customers is visible");

        //03_Good Reviews By Customers confirms that the scrolling reviews in the section are visible.
        softAssert.assertTrue(userHomePageBody.slideBarCustomers.isDisplayed());
        extentTest.pass("Good Reviews By Customers confirms that the scrolling reviews in the section are visible");
        ReusableMethods.waitFor(5);

        softAssert.assertAll();

        //04_browser is closed.






    }

}
