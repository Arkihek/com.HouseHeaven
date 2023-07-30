package test.US09_US24_US39_US47_US48;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomePage_Blog;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US09_TC001 extends TestBaseReport {
    @Test
    public void TC001 (){

        extentTest = extentReports.createTest("Blog sekmesi gorunurluk testi","Anasayfa ust barinda blog sekmesi gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        Assert.assertTrue(userHomePageBlog.blog.isDisplayed());
        extentTest.pass("Blog sekmesi gorunurlulugunu test eder");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}
