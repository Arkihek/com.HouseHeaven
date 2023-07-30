package test.US09_US24_US39_US47_US48;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomePage_Blog;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US24_TC002 extends TestBaseReport {
    @Test
    public void TC002 (){

        extentTest = extentReports.createTest("Kullanici girisi sonrasiBlog sayfasi acilmasi testi",
                "Blog sayfasi acilmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        AccountPage_Property kullanici = new AccountPage_Property();
        kullanici.signIn.click();
        extentTest.info("Kullanici Sign In butonuna tiklar");
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        JSUtilities.clickWithJS(Driver.getDriver(), kullanici.login);
        extentTest.info("Kullanici email adresi ve sifre ile giris yapar.");
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