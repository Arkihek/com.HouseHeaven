package test.US11_US28_US29_US30_US31;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.RegisterationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US28_TC01 extends TestBaseReport {

    AdminDashboard adminDashboard = new AdminDashboard();


    @Test
    public void Test01() {
        extentTest = extentReports.createTest("Is the Admin Dashboard page active",
                "Admin Dashboard page functions should be view");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin21"+Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847"+Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.pass("Admin login successful");
    }

    @Test
    public void test02(){

        extentTest = extentReports.createTest("is the blog title visible",
                "Blog title must be visible");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin21"+Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847"+Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");


        adminDashboard.blog.click();
        adminDashboard.blogBasligindakiler.isEnabled();
        extentTest.pass("Blog title is visible ");
    }

    @Test
    public void test03(){

        extentTest = extentReports.createTest("is the blog title visible",
                "Blog title must be visible");


        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        extentTest.info("User goes to Hause Heaven Admin page");

        adminDashboard.adminEMail.sendKeys("admin21"+Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847"+Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");


        adminDashboard.blog.click();
        adminDashboard.blogBasligindakiler.isEnabled();

        extentTest.pass("Blog title is visible ");

    }
}