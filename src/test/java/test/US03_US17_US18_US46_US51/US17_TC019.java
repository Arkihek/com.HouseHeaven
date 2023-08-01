package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomePage_Body;
import utilities.*;

public class US17_TC019 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();
    Actions actions = new Actions(Driver.getDriver());
    AccountPage_Property accountPageProperty = new AccountPage_Property();

    @Test
    public void test19() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test","On the home page See Our Packages in the section Elements Visible and activation of buttons");
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

        //03_See Our Packages is confirmed to be visible.
        JSUtilities.scrollToElement(Driver.getDriver(),userHomePageBody.seeOurPackages);
        ReusableMethods.waitFor(3);
        softAssert.assertTrue(userHomePageBody.seeOurPackages.isDisplayed());
        extentTest.pass("See Our Packages section is visible");

        //04_Choose Plan buttons are visible and confirmed to be active.
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

        //05_When the button on the left is pressed, it is confirmed that it redirects to the login page
        JSUtilities.clickWithJS(Driver.getDriver(),userHomePageBody.firstPostChoosePlanButton);
        ReusableMethods.waitFor(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/login";
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("When the left button is pressed, it redirects to the login page");

        //06_Return to the previous page.
        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(3);

        //07_When the middle button is pressed, it is confirmed that it redirects to the login page
        JSUtilities.clickWithJS(Driver.getDriver(),userHomePageBody.secondPostChoosePlanButton);
        ReusableMethods.waitFor(3);
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.hauseheaven.com/login";
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("When the centre button is pressed, it redirects to the login page");

        //08_Return to the previous page.
        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(3);

        //09_When the button on the right is pressed, it is confirmed that it redirects to the login page
        JSUtilities.clickWithJS(Driver.getDriver(),userHomePageBody.thirdPostChoosePlanButton);
        ReusableMethods.waitFor(3);
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.hauseheaven.com/login";
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("When the right button is pressed, it redirects to the login page");

        softAssert.assertAll();

        //10_Browser is closed.



    }
}
