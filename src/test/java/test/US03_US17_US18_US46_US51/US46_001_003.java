package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.AdminDashboard;
import pages.RegisterationPage;
import pages.UserHomePage_Body;
import utilities.*;

public class US46_001_003 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();
    Actions actions = new Actions(Driver.getDriver());
    AccountPage_Property accountPageProperty = new AccountPage_Property();
    RegisterationPage registerationPage = new RegisterationPage();
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void test01() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "Log in as a registered user, purchase new credits from the home body");
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

        //"03_In the body section of the user home page by clicking the choose plan button in see our packages section it must be confirmed that it goes to the payment page"
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePageBody.seeOurPackages);
        ReusableMethods.waitFor(2);
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBody.secondPostChoosePlanButton);
        ReusableMethods.waitFor(1);
        String expectedUrl = "https://qa.hauseheaven.com/account/packages/2/subscribe";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, "Sites are not the same");
        extentTest.pass("went to the payment page");

        //04_Credit card information must be entered and checkout button must be clicked
        accountPageProperty.cardNumber.sendKeys(ConfigReader.getProperty("cardNumber"));
        accountPageProperty.cardName.sendKeys(ConfigReader.getProperty("cardName"));
        accountPageProperty.cardYilGun.sendKeys(ConfigReader.getProperty("cardYilGun"));
        accountPageProperty.cardCVC.sendKeys(ConfigReader.getProperty("cardCVC"));
        ReusableMethods.waitFor(1);
        userHomePageBody.cookiesButton.click();
        JSUtilities.clickWithJS(Driver.getDriver(), accountPageProperty.checkout);
        ReusableMethods.waitFor(4);
        extentTest.info("Credit purchased");
        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);

        //05_Logout from the header page and verify
        JSUtilities.clickWithJS(Driver.getDriver(), accountPageProperty.logout);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerationPage.sigInButonu.isDisplayed());
        extentTest.info("Withdrawn from the account");
        extentTest.pass("You can log in as a registered user and purchase new credits");

        //06_Browser is closed.
        // Driver.closeDriver();
    }

    @Test
    public void test02() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "You should be able to log in as a registered user, buy new credits on the accont page");
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

        //03_buy credit of page Accont by selecting the loan from the section it must be confirmed that it goes to the payment page"
        JSUtilities.clickWithJS(Driver.getDriver(), accountPageProperty.girisYaptiginaDairBilgi);
        ReusableMethods.waitFor(1);
        JSUtilities.clickWithJS(Driver.getDriver(), accountPageProperty.buyCredits);
        ReusableMethods.waitFor(1);
        JSUtilities.clickWithJS(Driver.getDriver(), accountPageProperty.credits5puan);
        ReusableMethods.waitFor(1);
        String expectedUrl = "https://qa.hauseheaven.com/account/packages/2/subscribe";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, "Sites are not the same");
        extentTest.pass("went to the payment page");

        //04_Credit card information must be entered and checkout button must be clicked
        accountPageProperty.cardNumber.sendKeys(ConfigReader.getProperty("cardNumber"));
        accountPageProperty.cardName.sendKeys(ConfigReader.getProperty("cardName"));
        accountPageProperty.cardYilGun.sendKeys(ConfigReader.getProperty("cardYilGun"));
        accountPageProperty.cardCVC.sendKeys(ConfigReader.getProperty("cardCVC"));
        ReusableMethods.waitFor(1);
        // userHomePageBody.cookiesButton.click();
        JSUtilities.clickWithJS(Driver.getDriver(), accountPageProperty.checkout);
        ReusableMethods.waitFor(2);
        extentTest.info("Credit purchased");

        //05_Logout from the header page and verify
        JSUtilities.clickWithJS(Driver.getDriver(), accountPageProperty.logout);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerationPage.sigInButonu.isDisplayed());
        extentTest.info("Withdrawn from the account");
        extentTest.pass("You can log in as a registered user and purchase new credits");

        //06_Browser is closed.
        //Driver.closeDriver();
    }

    @Test
    public void test03() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "Must be able to log in as admin and should be able to visualise the credit received");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(2);
        extentTest.info("User goes to Hause Heaven Admin page");

        //02_As a registered user, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1") + Keys.TAB);
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass") + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        Assert.assertTrue(adminDashboard.dashboardButton.isDisplayed());
        extentTest.pass("Admin login successful");

        //03_Confirms that the payments section is active and visible in the dashbord menu
        softAssert.assertTrue(adminDashboard.paymentsButton.isDisplayed());
        extentTest.info("Payments button is visible");
        softAssert.assertTrue(adminDashboard.paymentsButton.isEnabled());
        extentTest.info("Payments button is enable");

        //"04_When pressing Payments section, Transactions section as sub menu is visible and confirmed to be active"
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.paymentsButton);
        ReusableMethods.waitFor(2);
        softAssert.assertTrue(adminDashboard.transactionsButton.isDisplayed());
        extentTest.info("Transactions button is visible");
        softAssert.assertTrue(adminDashboard.transactionsButton.isEnabled());
        extentTest.info("Transactions button is enable");

        //"05_Click on Transactions and select confirms that the page on which it is displayed has been opened"
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.transactionsButton);
        ReusableMethods.waitFor(2);
        String expectedUrl = "https://qa.hauseheaven.com/admin/payments/transactions";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("https://qa.hauseheaven.com/admin/payments/transactions goes to the site");


        //06_Verify that the credit purchase made as a user is recognised
        String expectedPayerName = "Team5 Team5";
        WebElement[] paymentsPayerNameArray = {adminDashboard.paymentsPayerName1, adminDashboard.paymentsPayerName2, adminDashboard.paymentsPayerName3
                , adminDashboard.paymentsPayerName4, adminDashboard.paymentsPayerName5, adminDashboard.paymentsPayerName6, adminDashboard.paymentsPayerName7
                , adminDashboard.paymentsPayerName8, adminDashboard.paymentsPayerName9, adminDashboard.paymentsPayerName10};
        for (WebElement eachPayerElement : paymentsPayerNameArray
        ) {
            if (eachPayerElement.getText().equals(expectedPayerName)) {
                extentTest.pass("The credit purchase made as a user is monitored");
                break;
            }
        }
        softAssert.assertAll();
        //07_Browser is closed.
       // Driver.closeDriver();
    }
}

