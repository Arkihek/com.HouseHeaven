package test.US08_US23_US34_US50;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AdminDashBoard_RealEstate_Properties;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.time.Duration;
import java.util.List;

public class US34_TC01_TC02_TC03_TC04_TC05 extends TestBaseReport {

    @Test
    public void TC01() {


        AdminDashBoard_RealEstate_Properties realEstate = new AdminDashBoard_RealEstate_Properties();
        AdminDashboard adminDashBoard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(1);
        adminDashBoard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        ReusableMethods.waitFor(1);
        adminDashBoard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashBoard.adminSignIn.click();


        // You must log in to the admin dashboard.
        extentTest = extentReports.createTest("Admin login", "You must log in to the admin dashboard.");

        //  Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        //  adminDashBoard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        //  adminDashBoard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        //  adminDashBoard.adminSignIn.click();
        String expectedAdminDashboard = ConfigReader.getProperty("urlAdmin");
        String actualAddminDashboard = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualAddminDashboard.equals(expectedAdminDashboard));



        extentTest.info("admin login logged in test");
        extentTest.pass("Login successful");
        realEstate.adminLogout.click();
        realEstate.admincikis.click();
        Driver.closeDriver();

    }
    @Test
    public void TC02() {


        AdminDashBoard_RealEstate_Properties realEstate = new AdminDashBoard_RealEstate_Properties();
        AdminDashboard adminDashBoard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(1);
        adminDashBoard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        ReusableMethods.waitFor(1);
        adminDashBoard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashBoard.adminSignIn.click();

        extentTest = extentReports.createTest("real estate and properties login", "Real Estate title should be clickable and properties under it should be accessible.");
        //Real Estate title should be clicked and properties under it should be accessible.
        //  Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        //  adminDashBoard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        //  adminDashBoard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        //  adminDashBoard.adminSignIn.click();
        ReusableMethods.waitFor(2);
        realEstate.RealEstatePropertiesRealEstateLinki.click();
        Assert.assertTrue(realEstate.RealEstatePropertiesPropertiesLinki.isEnabled());

        extentTest.info("click and login successful");
        extentTest.pass("test successful");
        ReusableMethods.waitFor(2);
        realEstate.adminLogout.click();
        ReusableMethods.waitFor(2);
        realEstate.admincikis.click();
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
    @Test
    public void TC03() {

        AdminDashBoard_RealEstate_Properties realEstate = new AdminDashBoard_RealEstate_Properties();
        AdminDashboard adminDashBoard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(2);
        adminDashBoard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        ReusableMethods.waitFor(1);
        adminDashBoard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashBoard.adminSignIn.click();
        extentTest = extentReports.createTest("Number of active postings", "The number of advertisements and active advertisements on the page should be displayed.");
        ReusableMethods.waitFor(2);
        realEstate.RealEstatePropertiesRealEstateLinki.click();
        ReusableMethods.waitFor(2);
        realEstate.RealEstatePropertiesPropertiesLinki.click();
        ReusableMethods.waitFor(2);
        softAssert.assertTrue(realEstate.RealEstatePropertiesilanSayisi.isDisplayed(), "ilan sayıları görüntülenemiyor");
        // posting numbers should be displayed.
        List<WebElement> aktifilanSayisi = Driver.getDriver().findElements(By.xpath("PropertiesRealEstateAktifIlanSayisi"));
        for (WebElement eachIlan : aktifilanSayisi) {
            softAssert.assertTrue(eachIlan.isEnabled(), "İlanlar ulaşılabilir");
        }
        extentTest.info("ad numbers viewed and verified");
        extentTest.pass("posting number test passed");
        ReusableMethods.waitFor(2);
        realEstate.adminLogout.click();
        ReusableMethods.waitFor(2);
        realEstate.admincikis.click();
        ReusableMethods.waitFor(1);
        Driver.closeDriver();
    }

    @Test
    public void TC04() {

        AdminDashBoard_RealEstate_Properties realEstate = new AdminDashBoard_RealEstate_Properties();
        AdminDashboard adminDashBoard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(2);
        adminDashBoard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        ReusableMethods.waitFor(2);
        adminDashBoard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashBoard.adminSignIn.click();
        extentTest = extentReports.createTest("Create button posting information", "New ad information should be entered with the Create button and should be saved");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        // New ad information should be entered with the Create button
        // and should be saved
        //   Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        //   adminDashBoard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        //   adminDashBoard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        //   adminDashBoard.adminSignIn.click();
        ReusableMethods.waitFor(2);
        realEstate.RealEstatePropertiesRealEstateLinki.click();
        ReusableMethods.waitFor(2);
        realEstate.RealEstatePropertiesPropertiesLinki.click();
        ReusableMethods.waitFor(2);
        // Click the Create button
        realEstate.RealEstatePropertiesCreateButon.click();
        ReusableMethods.waitFor(2);

        // New ad information must be entered

        Actions actions = new Actions(Driver.getDriver());
        actions.click(realEstate.RealEstatePropertiesFormTitleButon)
                .sendKeys("DENME1500")
                .sendKeys(Keys.TAB)
                .sendKeys("Law firm consultancy service is provided. The office is of high quality.")
                .sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB);

        ReusableMethods.waitFor(2);

        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Greetings to the extraordinary wonderful Mr. Melih")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
        actions.sendKeys("Branch Brook")
                .sendKeys(Keys.TAB)
                .sendKeys("1.462261")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("103.812531")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("2")
                .sendKeys(Keys.TAB)
                .sendKeys("2")
                .sendKeys(Keys.TAB)
                .sendKeys("5")
                .sendKeys(Keys.TAB)
                .sendKeys("1")
                .sendKeys(Keys.TAB)
                .sendKeys("500$")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys("100")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER).perform();

        realEstate.RealEstatePropertiesSaveAndExitButton.click();
        ReusableMethods.waitFor(2);

        WebDriverWait saveConfirm = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement savewait = saveConfirm.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast toast-success']")));
        softAssert.assertTrue(savewait.isDisplayed(), "not saved");
        ReusableMethods.waitFor(2);
        //Must be saved by pressing the Save & Exit button
        //realEstate.RealEstatePropertiesSaveAndExitButton.click();
        ReusableMethods.waitFor(2);
        extentTest.info("New ad information should be entered with the Create button\n" + "and save test done");
        extentTest.pass("Test status successful");
        ReusableMethods.waitFor(1);
        realEstate.RealEstatePropertiesRealEstateLinki.click();
        realEstate.RealEstatePropertiesPropertiesLinki.click();
        // Must be able to edit the newly added post with edit
        realEstate.RealEstatePropertiesEditButton.click();
        Actions actions1 = new Actions(Driver.getDriver());
        actions.click(realEstate.RealEstatePropertiesFormTitleButon)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.CLEAR)
                .sendKeys("Melih").perform();
        realEstate.RealEstatePropertiesSaveAndExitButton.click();
        ReusableMethods.waitFor(1);
        // and should be deleted with delete
        realEstate.RealEstatePropertiesDeleteButton.click();
        ReusableMethods.waitFor(2);
        realEstate.RealEstatePropertiesDeleteButonapprove.click();
        ReusableMethods.waitFor(1);
        WebDriverWait deleteWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement deleteconfirm = deleteWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-title']")));
        softAssert.assertTrue(deleteconfirm.isDisplayed(), "not deleted");
        extentTest.info("Deleted Test");
        ReusableMethods.waitFor(2);
        realEstate.adminLogout.click();
        ReusableMethods.waitFor(2);
        realEstate.admincikis.click();
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
}
