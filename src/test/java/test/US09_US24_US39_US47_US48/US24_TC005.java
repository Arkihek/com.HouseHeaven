package test.US09_US24_US39_US47_US48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomePage_Blog;
import utilities.*;

import java.util.Set;

public class US24_TC005 extends TestBaseReport {

    @Test(priority = 1)
    public void BirinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Birinci blog sayfasi paylasim butonlari testi",
                "Birinci blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.birinciBlogSayfa);
        extentTest.info("Birinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 2)
    public void IkinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Ikinci blog sayfasi paylasim butonlari testi",
                "Ikinci blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.ikinciBlogSayfa);
        extentTest.info("Ikinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 3)
    public void UcuncuBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Ucuncu blog sayfasi paylasim butonlari testi",
                "Ucuncu blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.ucuncuBlogSayfa);
        extentTest.info("Ucuncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 4)
    public void DorduncuBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Dorduncu blog sayfasi paylasim butonlari testi",
                "Dorduncu blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.dorduncuBlogSayfa);
        extentTest.info("Dorduncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 5)
    public void BesinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Besinci blog sayfasi paylasim butonlari testi",
                "Besinci blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.besinciBlogSayfa);
        extentTest.info("Besinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 6)
    public void AltinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Altinci blog sayfasi paylasim butonlari testi",
                "Altinci blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.altinciBlogSayfa);
        extentTest.info("Altinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 7)
    public void YedinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Yedinci blog sayfasi paylasim butonlari testi",
                "Yedinci blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.yedinciBlogSayfa);
        extentTest.info("Yedinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 8)
    public void SekizinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Sekizinci blog sayfasi paylasim butonlari testi",
                "Sekizinci blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.sekizinciBlogSayfa);
        extentTest.info("Sekizinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 9)
    public void DokuzuncuBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Dokuzuncu blog sayfasi paylasim butonlari testi",
                "Dokuzuncu blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.dokuzuncuBlogSayfa);
        extentTest.info("Dokuzuncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 10)
    public void OnuncuBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Onuncu blog sayfasi paylasim butonlari testi",
                "Onuncu blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.onuncuBlogSayfa);
        extentTest.info("Onuncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 11)
    public void OnbirinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Onbirinci blog sayfasi paylasim butonlari testi",
                "Onbirinci blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.onbirinciBlogSayfa);
        extentTest.info("Onbirinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
    @Test(priority = 12)
    public void OnikinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Onikinci blog sayfasi paylasim butonlari testi",
                "Onikinci blog sayfasinin paylasim butonlari gorunur ve aktif olmali");
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
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.onikinciBlogSayfa);
        extentTest.info("Onikinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();

        //Facebook butonu testi
        softAssert.assertTrue(userHomePageBlog.facebookButonu.isDisplayed(),"Facebook butonu gorunmuyor");
        extentTest.pass("Facebook butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.facebookButonu);
        String blogSayfasiWHD = Driver.getDriver().getWindowHandle();
        Set<String> wHDSeti1 = Driver.getDriver().getWindowHandles();
        String facebookSayfaHandle="";
        for (String each: wHDSeti1
        ) {
            if (!each.equals(blogSayfasiWHD)){
                facebookSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(facebookSayfaHandle);
        String expectedFacebookBaslik = "Facebook";
        String actualFacebookBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualFacebookBaslik,expectedFacebookBaslik,"Facebook sayfasi acilmadi");
        extentTest.pass("Facebook sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Linkedin butonu testi
        softAssert.assertTrue(userHomePageBlog.linkedinButonu.isDisplayed(),"Linkedin butonu gorunmuyor");
        extentTest.pass("Linkedin butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.linkedinButonu);
        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String linkedinSayfaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(blogSayfasiWHD)){
                linkedinSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(linkedinSayfaHandle);
        String expectedLinkedinBaslik = "LinkedIn Oturum Açma, Kayıt Olma | LinkedIn";
        String actualLinkedinBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualLinkedinBaslik,expectedLinkedinBaslik,"LinkedIn sayfasi acilmadi");
        extentTest.pass("LinkedIn sayfasinin acildigini test eder");
        Driver.getDriver().switchTo().window(blogSayfasiWHD);

        //Twitter butonu testi
        softAssert.assertTrue(userHomePageBlog.twitterButonu.isDisplayed(),"Twitter butonu gorunmuyor");
        extentTest.pass("Twitter butonunun gorunurlulugunu test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.twitterButonu);
        ReusableMethods.waitFor(2);
        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String twitterSayfaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(blogSayfasiWHD)){
                twitterSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(twitterSayfaHandle);
        String expectedTwitterBaslik = "Twitter'a giriş yap / X";
        String actualTwitterBaslik = Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTwitterBaslik,expectedTwitterBaslik,"Twitter sayfasi acilmadi");
        extentTest.pass("Twitter sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.quitDriver();
    }
}
