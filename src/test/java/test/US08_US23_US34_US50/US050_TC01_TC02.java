package test.US08_US23_US34_US50;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
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

public class US050_TC01_TC02 extends TestBaseReport {

    @Test
    public void TC01() {
        AdminDashBoard_RealEstate_Properties adminDashBLocationsCities = new AdminDashBoard_RealEstate_Properties();
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashBoard = new AdminDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashBoard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        adminDashBoard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashBoard.adminSignIn.click();
        extentTest = extentReports.createTest("Admin must login to dashboard", "Click on the Locations title under the Dashboard and the Cities page under it should be visible and accessible.");
        ReusableMethods.waitFor(4);
        adminDashBLocationsCities.adminDashboardLocationsButonu.click();
        //Assert.assertTrue(adminDashBLocationsCities.aDbLocationsCitiesButonu.isDisplayed());
        ReusableMethods.waitFor(1);
        adminDashBLocationsCities.aDbLocationsCitiesButonu.click();
        softAssert.assertTrue(adminDashBLocationsCities.LocationsBulkActions.isDisplayed(), "\n" +
                "Bulk actions could not be displayed");
        extentTest.info("Loactions clicked, cities displayed");
        softAssert.assertTrue(adminDashBLocationsCities.LocationsReload.isDisplayed(), "Locations button not displayed");
        ReusableMethods.waitFor(2);
        adminDashBLocationsCities.adminLogout.click();
        ReusableMethods.waitFor(2);
        adminDashBLocationsCities.admincikis.click();
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    @Test
    public void TC02() {
        AdminDashBoard_RealEstate_Properties adminDashBLocationsCities = new AdminDashBoard_RealEstate_Properties();
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashBoard = new AdminDashboard();
        ReusableMethods.waitFor(4);
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashBoard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        adminDashBoard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashBoard.adminSignIn.click();
        extentTest = extentReports.createTest("Adding Cites page elements and cities", "city \u200B\u200Bnumbers and sites can be added and displayed");
        ReusableMethods.waitFor(2);
        adminDashBLocationsCities.adminDashboardLocationsButonu.click();
        ReusableMethods.waitFor(2);
        adminDashBLocationsCities.aDbLocationsCitiesButonu.click();
        ReusableMethods.waitFor(2);
        // The elements on the page can be viewed and verified to be active
        List<WebElement> aktifilanSayisi = Driver.getDriver().findElements(By.xpath("LocationsCitiesAktifIlanSayisi"));
        for (WebElement eachIlan : aktifilanSayisi) {
            Assert.assertTrue(eachIlan.isEnabled());
        }
        extentTest.info("The elements on the page can be viewed and verified to be active");
        // city numbers should be displayed
        softAssert.assertTrue(adminDashBLocationsCities.aDbLocationsCitiesNumberOfResult.isDisplayed(), "City numbers could not be displayed");
        // Clicking Create
        adminDashBLocationsCities.aDbLocationsCitiesCretaeButon.click();
        ReusableMethods.waitFor(2);
        //Must be able to add a new city (district)
        Actions actions = new Actions(Driver.getDriver());
        actions.click(adminDashBLocationsCities.aDbLocationsAddNewCities).sendKeys("Mel.")
                .sendKeys(Keys.TAB)
                .sendKeys("Alabama 281.Street").perform();
        actions.moveToElement(adminDashBLocationsCities.aDbLocationsState).click().perform();
        WebElement cityOption = Driver.getDriver().findElement(By.xpath("//input[@aria-label='Search']"));
        cityOption.click();
        actions.sendKeys("Alabama").perform();
        //
        ReusableMethods.waitFor(2);
        //   If site fixes, line 99 will be removed from the comment.
        // actions.click(Driver.getDriver().findElement(By.xpath("(//li[@role='option'])[1]"))).perform();
        ReusableMethods.waitFor(3);
        actions.moveToElement(adminDashBLocationsCities.aDbLocationsCountryButon).click().perform();
        ReusableMethods.waitFor(2);
        actions.click(Driver.getDriver().findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']"))).perform();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(2);
        actions.click(adminDashBLocationsCities.aDbOrder).perform();
        actions.sendKeys(Keys.ARROW_LEFT).perform();
        ReusableMethods.waitFor(1);
        actions.sendKeys("1").perform();
        // Must be saved with Save & Exit
        ReusableMethods.waitFor(3);
        adminDashBLocationsCities.aDbLocationsSaveAndExit.click();
        ReusableMethods.waitFor(2);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));
        //Save and exit confirm message test
        Assert.assertTrue(notification.isDisplayed());
        ReusableMethods.waitFor(2);
        String actual = Driver.getDriver().findElement(By.xpath("//div[@id='stack-footer']")).getText();
        System.out.println(actual);
        adminDashBLocationsCities.aDbLocationsEditButon.click();
        actions.click(adminDashBLocationsCities.aDbLocationsAddNewCities).sendKeys("Melih i.")
                .sendKeys(Keys.TAB)
                .sendKeys("300. Alabama Street").perform();
        ReusableMethods.waitFor(3);
        adminDashBLocationsCities.duzenlemedenSonraSaveButonu.click();
        ReusableMethods.waitFor(3);
        adminDashBLocationsCities.duzenlemedensonrakiSaveExt.click();
        ReusableMethods.waitFor(2);
        //It must be deleted with the delete button
        adminDashBLocationsCities.aDbLocationsDeleteButon.click();
        ReusableMethods.waitFor(2);
        adminDashBLocationsCities.aDbLocationsDeleteButonConfirm.click();
        WebDriverWait deleteJS = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement deleleteWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-title']")));
        softAssert.assertTrue(deleleteWait.isDisplayed(),"could not be displayed");
        ReusableMethods.waitFor(2);
        extentTest.pass("Login to the admin dashboard and add ialn numbers and advertisements from the cities section, deleted");
        ReusableMethods.waitFor(2);
        adminDashBLocationsCities.adminLogout.click();
        ReusableMethods.waitFor(2);
        adminDashBLocationsCities.admincikis.click();
        ReusableMethods.waitFor(2);
    }

}







