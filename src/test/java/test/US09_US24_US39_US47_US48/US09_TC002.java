package test.US09_US24_US39_US47_US48;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomePage_Blog;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US09_TC002 extends TestBaseReport {
    @Test
    public void TC002 (){

        extentTest = extentReports.createTest("Blog sayfasi acilmasi testi","Blog sayfasi acilmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        String expectedUrl = "https://qa.hauseheaven.com/blog";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Blog sayfasinin acildigini test eder");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
