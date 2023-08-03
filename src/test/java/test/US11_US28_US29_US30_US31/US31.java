package test.US11_US28_US29_US30_US31;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US31 extends TestBaseReport {

    AdminDashboard adminDashboard = new AdminDashboard();


    @Test
    public void Test01() {
        extentTest = extentReports.createTest("Is the Admin Dashboard page active",
                "Admin Dashboard page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin23" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();


        String expectedUrl = "https://qa.hauseheaven.com/admin";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.pass("Admin login successful");


    }

    @Test
    public void Test02() {
        extentTest = extentReports.createTest("Is the Admin Tags page active",
                "Admin Tags page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin23" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();

        adminDashboard.blogBasligindakiler.isDisplayed();
        adminDashboard.blog.click();
        adminDashboard.dashboardTags.click();
        String expectedUrl = "https://qa.hauseheaven.com/admin/blog/tags";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.pass("Tags is successful");
    }

    @Test
    public void Test03() {
        extentTest = extentReports.createTest("Is the Admin Tags page active",
                "Admin Dashboard Tags page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin23" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();


        adminDashboard.blog.click();
        adminDashboard.dashboardTags.click();
        String expectedUrl = "https://qa.hauseheaven.com/admin/blog/tags";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);


        adminDashboard.tagsRecordSayi.isDisplayed();
        adminDashboard.tagsOrnek.click();
        extentTest.pass("Tags is successful");

    }

    @Test
    public void Test04() {
        extentTest = extentReports.createTest("Is the Admin New Tags page active",
                "Admin New Tags  page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin23" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();


        adminDashboard.blog.click();
        adminDashboard.dashboardTags.click();

        adminDashboard.tagsCreate.click();
        String expectedUrl = "https://qa.hauseheaven.com/admin/blog/tags/create";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

        adminDashboard.tagsName.sendKeys("NEW TAGS" + Keys.TAB);
        //  adminDashboard.tagsDescription.sendKeys("new tag"+Keys.TAB);
        adminDashboard.tagsSave.click();


    }

    @Test
    public void Test05() {
        extentTest = extentReports.createTest("Is the Admin Tags page active",
                "Admin Tags page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin23" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();


        adminDashboard.blog.click();
        adminDashboard.dashboardTags.click();
        adminDashboard.tagsUpdate.click();

        adminDashboard.tagsName.sendKeys(" UPDATE"+Keys.TAB);
        adminDashboard.tagsSave.click();
        extentTest.pass("Tag is update");

    }

    @Test
    public void Test06() {
        extentTest = extentReports.createTest("Is the Admin Tags page active",
                "Admin Tags page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin23" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();


        adminDashboard.blog.click();
        adminDashboard.dashboardTags.click();
        adminDashboard.tagsDelete.click();
        adminDashboard.tagsDeleteOnay.click();
        extentTest.pass("Tag is deleted");

    }

}