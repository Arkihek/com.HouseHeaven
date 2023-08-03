package test.US11_US28_US29_US30_US31;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class US30 extends TestBaseReport {


    AdminDashboard adminDashboard=new AdminDashboard();


    @Test
    public void Test01() {
        extentTest = extentReports.createTest("Is the Admin Dashboard page active",
                "Admin Dashboard page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin21"+ Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847"+Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();




        String expectedUrl = "https://qa.hauseheaven.com/admin";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Admin login successful");


    }

    @Test
    public void Test02() {
        extentTest = extentReports.createTest("Is the Admin Dashboard page active",
                "Admin Dashboard page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();

        adminDashboard.blogBasligindakiler.isDisplayed();
    }

    @Test
    public void Test03() {
        extentTest = extentReports.createTest("Is the Admin Dashboard page active",
                "Admin Dashboard Catagories page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin24" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();


        adminDashboard.blog.click();
        adminDashboard.dashboardCatagories.click();
        String expectedUrl = "https://qa.hauseheaven.com/admin/blog/categories";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Catagories is successful");

    }

    @Test
    public void Test04() {
        extentTest = extentReports.createTest("Is the Admin Dashboard page active",
                "Admin Dashboard Catagories page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin24" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();


        adminDashboard.blog.click();
        adminDashboard.dashboardCatagories.click();

        adminDashboard.catagoriesName.sendKeys("New Home" + Keys.ENTER);
        // adminDashboard.catagoriesParent.click();
        // adminDashboard.catagoriesParentSelect2.click();

        //  adminDashboard.catagoriesParentSelect.click();
        // adminDashboard.catagoriesDescription.click();
        adminDashboard.catagoriesDescription.sendKeys("neww" + Keys.TAB);
        //adminDashboard.catagoriesIcon.sendKeys("ekleme"+Keys.ENTER);

        // adminDashboard.catagoriesOrder.sendKeys("4"+Keys.ENTER);
        adminDashboard.catagoriesSaveExit.click();

    }




}
