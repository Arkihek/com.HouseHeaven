package test.US09_US24_US39_US47_US48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomePage_Blog;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

import java.util.List;

public class US24_TC004 extends TestBaseReport {

    @Test(priority = 1)
    public void BirinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Birinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Birinci blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 2)
    public void IkinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Ikinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Ikinci blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 3)
    public void UcuncuBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Ucuncu blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Ucuncu blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 4)
    public void DorduncuBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Dorduncu blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Dorduncu blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 5)
    public void BesinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Besinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Besinci blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 6)
    public void AltinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Altinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Altinci blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 7)
    public void YedinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Yedinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Yedinci blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 8)
    public void SekizinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Sekizinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Sekizinci blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 9)
    public void DokuzuncuBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Dokuzuncu blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Dokuzuncu blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 10)
    public void OnuncuBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Onuncu blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Onuncu blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 11)
    public void OnbirinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Onbirinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Onbirinci blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 12)
    public void OnikinciBlogSayfa () {

        extentTest = extentReports.createTest("Kullanici girisi sonrasi Onikinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Onikinci blog sayfasinin ayrintilari gorunur olmali");
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
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        List<WebElement> categoriesListesi = Driver.getDriver().findElements(By.xpath("//a[@class='text-dark']"));
        for (int i = 1; i < categoriesListesi.size(); i++) {
            softAssert.assertTrue(categoriesListesi.get(i).isDisplayed(),"Categories alaninda gorunmeyen oge var");
            extentTest.pass("Categories alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(categoriesListesi.get(i).isEnabled(),"Categories alaninda aktif olmayan oge var");
            extentTest.pass("Categories alanindaki ogelerin aktifligini test eder");
            System.out.println(categoriesListesi.get(i).getText());
        }

        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        List<WebElement> featuredPropertiesListesi = Driver.getDriver().findElements(By.xpath("//div[@class='sides_list_property_detail']"));
        for (int i = 1; i < featuredPropertiesListesi.size(); i++) {
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isDisplayed(),"Featured Properties alaninda gorunmeyen oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(featuredPropertiesListesi.get(i).isEnabled(),"Featured Properties alaninda aktif olmayan oge var");
            extentTest.pass("Featured Properties alanindaki ogelerin aktifligini test eder");
            System.out.println(featuredPropertiesListesi.get(i).getText());
        }

        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        List<WebElement> relatedPostsListesi = Driver.getDriver().findElements(By.xpath("//div[@class='blog-wrap-grid']"));
        for (int i = 1; i < relatedPostsListesi.size(); i++) {
            softAssert.assertTrue(relatedPostsListesi.get(i).isDisplayed(),"Related Posts alaninda gorunmeyen oge var");
            extentTest.pass("Related Posts alanindaki ogelerin gorunurlulugunu test eder");
            softAssert.assertTrue(relatedPostsListesi.get(i).isEnabled(),"Related Posts alaninda aktif olmayan oge var");
            extentTest.pass("Related Posts alanindaki ogelerin aktifligini test eder");
            System.out.println(relatedPostsListesi.get(i).getText());
        }
        // Tag bolumu testi
        softAssert.assertTrue(userHomePageBlog.tag.isDisplayed(),"Tag alani gorunmuyor");
        extentTest.pass("Tag alaninin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }

}
