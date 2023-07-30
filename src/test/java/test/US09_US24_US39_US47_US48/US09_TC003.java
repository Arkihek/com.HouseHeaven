package test.US09_US24_US39_US47_US48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Blog;
import utilities.*;

public class US09_TC003 extends TestBaseReport {

    @Test (priority = 1)
    public void BirinciBlogSayfasi () {

        extentTest = extentReports.createTest("Birinci blog sayfasi ayrintilari testi","Birinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.birinciBlogSayfa);
        extentTest.info("Birinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(),"baslik gorunmuyor");
        extentTest.pass("Birinci blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(),"resim gorunmuyor");
        extentTest.pass("Birinci blog sayfasinin resminin gorunurlulugunu test eder");
        String birinciBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(birinciBlogIcerikStr.isEmpty(),"Blog icerigi bos");
        extentTest.pass("Birinci blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 2)
    public void IkinciBlogSayfasi (){
        extentTest = extentReports.createTest("Ikinci blog sayfasi ayrintilari testi","Ikinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.ikinciBlogSayfa);
        extentTest.info("Ikinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(),"baslik gorunmuyor");
        extentTest.pass("Ikinci blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(),"resim gorunmuyor");
        extentTest.pass("Ikinci blog sayfasinin resminin gorunurlulugunu test eder");
        String ikinciBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(ikinciBlogIcerikStr.isEmpty(),"Blog icerigi bos");
        extentTest.pass("Ikinci blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 3)
    public void UcuncuBlogSayfasi () {
        extentTest = extentReports.createTest("Ucuncu blog sayfasi ayrintilari testi", "Ucuncu blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.ucuncuBlogSayfa);
        extentTest.info("Ucuncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Ucuncu blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Ucuncu blog sayfasinin resminin gorunurlulugunu test eder");
        String ucuncuBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(ucuncuBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Ucuncu blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 4)
    public void DorduncuBlogSayfasi () {
        extentTest = extentReports.createTest("Dorduncu blog sayfasi ayrintilari testi", "Dorduncu blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.dorduncuBlogSayfa);
        extentTest.info("Dorduncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Dorduncu blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Dorduncu blog sayfasinin resminin gorunurlulugunu test eder");
        String dorduncuBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        System.out.println(dorduncuBlogIcerikStr);
        softAssert.assertFalse(dorduncuBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Dorduncu blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 5)
    public void BesinciBlogSayfasi () {
        extentTest = extentReports.createTest("Besinci blog sayfasi ayrintilari testi", "Besinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.besinciBlogSayfa);
        extentTest.info("Besinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Besinci blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Besinci blog sayfasinin resminin gorunurlulugunu test eder");
        String besinciBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(besinciBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Besinci blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 6)
    public void AltinciBlogSayfasi () {
        extentTest = extentReports.createTest("Altinci blog sayfasi ayrintilari testi", "Altinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.altinciBlogSayfa);
        extentTest.info("Altinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Altinci blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Altinci blog sayfasinin resminin gorunurlulugunu test eder");
        String altinciBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(altinciBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Altinci blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 7)
    public void YedinciBlogSayfasi () {
        extentTest = extentReports.createTest("Yedinci blog sayfasi ayrintilari testi", "Yedinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.yedinciBlogSayfa);
        extentTest.info("Yedinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Yedinci blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Yedinci blog sayfasinin resminin gorunurlulugunu test eder");
        String yedinciBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(yedinciBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Yedinci blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 8)
    public void SekizinciBlogSayfasi () {
        extentTest = extentReports.createTest("Sekizinci blog sayfasi ayrintilari testi", "Sekizinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.sekizinciBlogSayfa);
        extentTest.info("Sekizinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Sekizinci blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Sekizinci blog sayfasinin resminin gorunurlulugunu test eder");
        String sekizinciBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(sekizinciBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Sekizinci blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 9)
    public void DokuzuncuBlogSayfasi () {
        extentTest = extentReports.createTest("Dokuzuncu blog sayfasi ayrintilari testi", "Dokuzuncu blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.dokuzuncuBlogSayfa);
        extentTest.info("Dokuzuncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Dokuzuncu blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Dokuzuncu blog sayfasinin resminin gorunurlulugunu test eder");
        String dokuzuncuBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(dokuzuncuBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Dokuzuncu blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 10)
    public void OnuncuBlogSayfasi () {
        extentTest = extentReports.createTest("Onuncu blog sayfasi ayrintilari testi", "Onuncu blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.onuncuBlogSayfa);
        extentTest.info("Onuncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Onuncu blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Onuncu blog sayfasinin resminin gorunurlulugunu test eder");
        String onuncuBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(onuncuBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Onuncu blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 11)
    public void OnbirinciBlogSayfasi () {
        extentTest = extentReports.createTest("Onbirinci blog sayfasi ayrintilari testi", "Onbirinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.onbirinciBlogSayfa);
        extentTest.info("Onbirinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Onbirinci blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Onbirinci blog sayfasinin resminin gorunurlulugunu test eder");
        String onbirinciBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(onbirinciBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Onbirinci blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 12)
    public void OnikinciBlogSayfasi () {
        extentTest = extentReports.createTest("Onikinci blog sayfasi ayrintilari testi", "Onikinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.onikinciBlogSayfa);
        extentTest.info("Onikinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userHomePageBlog.blogBaslik.isDisplayed(), "baslik gorunmuyor");
        extentTest.pass("Onikinci blog sayfasinin basliginin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.blogResim.isDisplayed(), "resim gorunmuyor");
        extentTest.pass("Onikinci blog sayfasinin resminin gorunurlulugunu test eder");
        String onikinciBlogIcerikStr = userHomePageBlog.blogIcerik.getText();
        softAssert.assertFalse(onikinciBlogIcerikStr.isEmpty(), "Blog icerigi bos");
        extentTest.pass("Onikinci blog sayfasinin iceriginin bos olup olmadigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }

}
