package test.US09_US24_US39_US47_US48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.*;

import java.util.List;

public class US39_TC003 extends TestBaseReport {
    @Test
    public void TC003 (){
        extentTest = extentReports.createTest("Admin DashBoard'da Newsletter sayfasindaki ogelerin gorunululugu ve aktifligi testi",
                "Admin DashBoardda Newsletters sayfasindaki ogeler gorunur ve aktif olmali");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        extentTest.info("Kullanici admindashboard sayfasina gider");
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        adminDashboard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.adminSignIn);
        extentTest.info("Kullanici email adresi ve sifre ile giris yapar.");
        softAssert.assertTrue(adminDashboard.adminTest.isDisplayed(),"admin dashboard sayfasina giris yapilamadi");
        extentTest.pass("Kullanicinin admin dashboarda giris yapildigini test eder");
        softAssert.assertTrue(adminDashboard.newsletterButon.isDisplayed(),"Newsletters butonu gorunmuyor");
        extentTest.pass("Kullanici Newsletters butonunun gorunululugunu test eder");
        adminDashboard.newsletterButon.click();
        extentTest.info("Newsletters butonuna tiklar");

        softAssert.assertTrue(adminDashboard.newsletterFiltersButon.isDisplayed(),"Filters butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.newsletterFiltersButon.isEnabled(),"Filters butonu aktif degil");
        extentTest.pass("Filters butonunun gorunurlulugunu ve aktifligini test eder");

        softAssert.assertTrue(adminDashboard.newslettersSearch.isDisplayed(),"Search textbox'i gorunmuyor");
        softAssert.assertTrue(adminDashboard.newslettersSearch.isEnabled(),"Search textbox'i aktif degil");
        extentTest.pass("Search textbox'inin gorunurlulugunu ve aktifligini test eder");

        softAssert.assertTrue(adminDashboard.newslettersExport.isDisplayed(),"Export butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.newslettersExport.isEnabled(),"Export butonu aktif degil");
        extentTest.pass("Export butonunun gorunurlulugunu ve aktifligini test eder");

        softAssert.assertTrue(adminDashboard.newslettersReload.isDisplayed(),"Reload butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.newslettersReload.isEnabled(),"Reload butonu aktif degil");
        extentTest.pass("Reload butonunun gorunurlulugunu ve aktifligini test eder");

        List<WebElement> newslettesSayfaIcerigiListesi = Driver.getDriver().findElements(By.xpath("//tr[@role='row']"));

        for (WebElement each:newslettesSayfaIcerigiListesi
        ) {
            softAssert.assertTrue(each.isDisplayed(),"Newsletters sayfasindaki ayrintilarinda gorunmeyen var");
            extentTest.pass("Newsletters sayfasindaki ayrintilarin gorunurlulugunu test eder");
            System.out.println(each.getText());
        }
        ReusableMethods.waitFor(3);

        softAssert.assertTrue(adminDashboard.newslettersToplamKayitSayisi.isDisplayed(),
                "Toplam Kayit Sayisi gorunmuyor");
        extentTest.pass("Toplam kayit sayisi gorunurlulugunu test eder");
        System.out.println(adminDashboard.newslettersToplamKayitSayisi.getText());
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
