package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Body;
import utilities.*;

public class US03_TC001 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();

    @Test
    public void test01() {

        extentTest = extentReports.createTest("Hauseheaven test", "The user must be able to verify that the requested element is visible");

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(1);
        userHomePageBody.cookiesButton.click();
        ReusableMethods.waitFor(3);

        //02_How It Works on Home page. It is confirmed that the section is visible.
        softAssert.assertTrue(userHomePageBody.howItWorks.isDisplayed());
        extentTest.info("howItWorks section is visible");
        ReusableMethods.waitFor(3);


        //03_On the home page, it is correct that the EVALUATE PROPERTY section is visible.
        //04_On the home page, it is correct that Meet Your Agent is visible.
        //05_On the home page, the Close The Deal section is visible.
        WebElement[] webElementsIsDisplay = {userHomePageBody.evaluateProperty, userHomePageBody.meetYourAgent, userHomePageBody.closeTheDeal};
        String[] stringsWebElements = {"Evaluate Property", "Meet Your Agent", "Close The Deal"};

        for (int i = 0; i < 3; i++) {
            softAssert.assertTrue(webElementsIsDisplay[i].isDisplayed());
            extentTest.info(stringsWebElements[i] + " element was tested to be visible");
        }
        //06_Browser is closed.
    }
}
