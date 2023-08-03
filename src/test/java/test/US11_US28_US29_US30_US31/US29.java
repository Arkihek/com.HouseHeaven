package test.US11_US28_US29_US30_US31;

import com.mongodb.operation.DeleteOperation;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US29 extends TestBaseReport {
    AdminDashboard adminDashboard = new AdminDashboard();


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

        String expectedUrl = "https://qa.hauseheaven.com/admin";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);



        extentTest.pass("Blog title is visible ");

    }

    @Test
    public void test03(){

        extentTest = extentReports.createTest("is the New posts title visible",
                " New Posts title must be visible");


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
        adminDashboard.dashboardPosts.click();

        String expectedUrl = "https://qa.hauseheaven.com/admin/blog/posts";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        adminDashboard.postCreate.click();
        adminDashboard.postCreateName.sendKeys("Ahmet"+Keys.TAB);
        adminDashboard.postDescription.sendKeys("New Post");
        adminDashboard.postParagraf.sendKeys("New Location is wonderful");
        adminDashboard.postStatus.click();
        adminDashboard.postCatagories.click();
        adminDashboard.postSave.click();




        extentTest.pass("New post is created ");

    }

    @Test
    public void test04(){

        extentTest = extentReports.createTest("is the posts title current",
                "Posts title must be current");


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
        adminDashboard.dashboardPosts.click();
        adminDashboard.postUpdate.click();


        adminDashboard.postCreateName.sendKeys("suleyman"+Keys.TAB);
        adminDashboard.postDescription.sendKeys("New Post update");
        adminDashboard.postParagraf.sendKeys("New Location is'not wonderful");
        adminDashboard.postStatus.click();
        adminDashboard.postCatagories.click();
        adminDashboard.postSave.click();




        extentTest.pass("New post is update ");

    }

    @Test
    public void test5(){

        extentTest = extentReports.createTest("Is the post deleted?",
                "Post should be deleted");


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
        adminDashboard.dashboardPosts.click();
        adminDashboard.postDelete.click();
        adminDashboard.confirmDelete.click();


        extentTest.pass("post is deleted");

    }

}
