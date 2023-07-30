package test.US09_US24_US39_US47_US48;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomePage_Blog;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US24_TC001 extends TestBaseReport {
    @Test
    public void TC001 (){

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Blog sekmesi gorunurluk testi","Anasayfa ust barinda blog sekmesi gorunur olmali");
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
        Assert.assertTrue(userHomePageBlog.blog.isDisplayed());
        extentTest.pass("Blog sekmesi gorunurlulugunu test eder");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}
