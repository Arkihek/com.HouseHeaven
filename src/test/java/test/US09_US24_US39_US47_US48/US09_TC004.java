package test.US09_US24_US39_US47_US48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Blog;
import utilities.*;

public class US09_TC004 extends TestBaseReport {
    @Test(priority = 1)
    public void BirinciBlogSayfa () {

        extentTest = extentReports.createTest("Birinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Birinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.birinciBlogSayfa);
        extentTest.info("Birinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed(),"Featured Properties yazisi gorunmuyor");
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed(),"Birici Featured Properties yazisi gorunmuyor");
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed(),"Ikinci Featured Properties yazisi gorunmuyor");
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed(),"Ucuncu Featured Properties yazisi gorunmuyor");
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed(),"Dorduncu Featured Properties yazisi gorunmuyor");
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed(),"Besinci Featured Properties yazisi gorunmuyor");
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed(),"Related Posts yazisi gorunmuyor");
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed(),"Birinci Related Posts yazisi gorunmuyor");
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed(),"Ikinci Related Posts yazisi gorunmuyor");
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 2)
    public void IkinciBlogSayfa () {

        extentTest = extentReports.createTest("Ikinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Ikinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.ikinciBlogSayfa);
        extentTest.info("Ikinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 3)
    public void UcuncuBlogSayfa () {

        extentTest = extentReports.createTest("Ucuncu blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Ucuncu blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.ucuncuBlogSayfa);
        extentTest.info("Ucuncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 4)
    public void DorduncuBlogSayfa () {

        extentTest = extentReports.createTest("Dorduncu blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Dorduncu blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.dorduncuBlogSayfa);
        extentTest.info("Dorduncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 5)
    public void BesinciBlogSayfa () {

        extentTest = extentReports.createTest("Besinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Besinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.besinciBlogSayfa);
        extentTest.info("Besinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 6)
    public void AltinciBlogSayfa () {

        extentTest = extentReports.createTest("Altinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Altinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.altinciBlogSayfa);
        extentTest.info("Altinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 7)
    public void YedinciBlogSayfa () {

        extentTest = extentReports.createTest("Yedinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Yedinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.yedinciBlogSayfa);
        extentTest.info("Yedinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 8)
    public void SekizinciBlogSayfa () {

        extentTest = extentReports.createTest("Sekizinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Sekizinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.sekizinciBlogSayfa);
        extentTest.info("Sekizinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 9)
    public void DokuzuncuBlogSayfa () {

        extentTest = extentReports.createTest("Dokuzuncu blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Dokuzuncu blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.dokuzuncuBlogSayfa);
        extentTest.info("Dokuzuncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 10)
    public void OnuncuBlogSayfa () {

        extentTest = extentReports.createTest("Onuncu blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Onuncu blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.onuncuBlogSayfa);
        extentTest.info("Onuncu bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 11)
    public void OnbirinciBlogSayfa () {

        extentTest = extentReports.createTest("Onbirinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Onbirinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.onbirinciBlogSayfa);
        extentTest.info("Onbirinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test(priority = 12)
    public void OnikinciBlogSayfa () {

        extentTest = extentReports.createTest("Onikinci blog sayfasi Categories, Recent Posts, Featured Properties alanlarinin testi",
                "Onikinci blog sayfasinin ayrintilari gorunur olmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomePage_Blog userHomePageBlog = new UserHomePage_Blog();
        userHomePageBlog.blog.click();
        extentTest.info("Blog sekmesine tiklar");
        JSUtilities.clickWithJS(Driver.getDriver(), userHomePageBlog.onikinciBlogSayfa);
        extentTest.info("Onikinci bloga tiklar");
        SoftAssert softAssert = new SoftAssert();
        //Categories bolumu testleri
        softAssert.assertTrue(userHomePageBlog.categories.isDisplayed(),"Categories yazisi gorunmuyor");
        extentTest.pass("Categories yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isDisplayed(),"www yazisi gorunmuyor");
        extentTest.pass("www yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.www.isEnabled(),"www sekmesi aktif degil");
        extentTest.pass("www sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isDisplayed(),"Pump Desing yazisi gorunmuyor");
        extentTest.pass("Pump yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.pump.isEnabled(),"Pump sekmesi aktif degil");
        extentTest.pass("Pump sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isDisplayed(),"Pool Designnn yazisi gorunmuyor");
        extentTest.pass("Pool Designnn yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.poolDesign.isEnabled(),"Pool Designnn sekmesi aktif degil");
        extentTest.pass("Pool Designnn sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isDisplayed(),"Garden Desing yazisi gorunmuyor");
        extentTest.pass("Garden Desing yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.gardenDesing.isEnabled(),"Garden Desing sekmesi aktif degil");
        extentTest.pass("Garden Desing sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isDisplayed(),"House Design yazisi gorunmuyor");
        extentTest.pass("House Design yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.houseDesign.isEnabled(),"House Design sekmesi aktif degil");
        extentTest.pass("House Design sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isDisplayed(),"Latest news yazisi gorunmuyor");
        extentTest.pass("Latest news yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.latestNews.isEnabled(),"Latest news sekmesi aktif degil");
        extentTest.pass("Latest news sekmesinin aktifligini test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isDisplayed(),"Building materials yazisi gorunmuyor");
        extentTest.pass("Building materials yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.buildingMaterials.isEnabled(),"Building materials sekmesi aktif degil");
        extentTest.pass("Building materials sekmesinin aktifligini test eder");
        //Featured Properties bolumu testleri
        softAssert.assertTrue(userHomePageBlog.featuredProperties.isDisplayed());
        extentTest.pass("Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birinciFeaturedProperties.isDisplayed());
        extentTest.pass("Birici Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikinciFeaturedProperties.isDisplayed());
        extentTest.pass("Ikinci Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ucuncuFeaturedProperties.isDisplayed());
        extentTest.pass("Ucuncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.dorduncuFeaturedProperties.isDisplayed());
        extentTest.pass("Dorduncu Featured Properties yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.besinciFeaturedProperties.isDisplayed());
        extentTest.pass("Besinci Featured Properties yazisinin gorunurlulugunu test eder");
        //Recent(Related) Posts bolumu testleri
        softAssert.assertTrue(userHomePageBlog.relatedPosts.isDisplayed());
        extentTest.pass("Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.birincirelatedPosts.isDisplayed());
        extentTest.pass("Birinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertTrue(userHomePageBlog.ikincirelatedPosts.isDisplayed());
        extentTest.pass("Ikinci Related Posts yazisinin gorunurlulugunu test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }

}
