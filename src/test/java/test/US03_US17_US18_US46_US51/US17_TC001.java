package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomePage_Body;
import utilities.*;

public class US17_TC001 extends TestBaseReport {


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
        AccountPage_Property accountPageProperty = new AccountPage_Property();

        //02_As a registered user, log in with the correct username and password from the signin button
        accountPageProperty.signIn.click();
        ReusableMethods.waitFor(1);
        accountPageProperty.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.waitFor(1);
        accountPageProperty.password.sendKeys(ConfigReader.getProperty("userPass"));
        ReusableMethods.waitFor(1);
        accountPageProperty.login.click();
        ReusableMethods.waitFor(3);


        //03_Home confirms that the How It Works? section is visible.
        JSUtilities.scrollToElement(Driver.getDriver(),userHomePageBody.searchResultBox);
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(userHomePageBody.howItWorks.isDisplayed());
        extentTest.info("howItWorks section is visible");
        ReusableMethods.waitFor(2);

        //04_Confirm that the Evaluate Property is visible on the Home page.
        //05_Home confirms that the Meet Your Agent section is visible.
        //06_Confirm that Close The Deal is visible on the Home page.
        WebElement[] webElementsIsDisplay = {userHomePageBody.evaluateProperty, userHomePageBody.meetYourAgent, userHomePageBody.closeTheDeal};
        String[] stringsWebElements = {"Evaluate Property", "Meet Your Agent", "Close The Deal"};

        for (int i = 0; i < 3; i++) {
            softAssert.assertTrue(webElementsIsDisplay[i].isDisplayed());
            extentTest.info(stringsWebElements[i] + " element was tested to be visible");
        }
        softAssert.assertAll();
        //07_Browser is closed.
    }

}
