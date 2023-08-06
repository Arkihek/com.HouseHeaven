package test.US09_US24_US39_US47_US48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.*;

import java.util.List;

public class US48_TC002 extends TestBaseReport {
    @Test
    public void TC002 (){

        extentTest = extentReports.createTest("Admin DashBoard'da Locations basligi altinda Countries sayfasindaki ogelerin gorunululugu ve aktifligi testi",
                "Admin DashBoard'da Locations basligi altinda Countries sayfasindaki ogeler gorunur ve aktif olmali");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        extentTest.info("Kullanici admindashboard sayfasina gider");
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        adminDashboard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.adminSignIn);
        extentTest.info("Kullanici email adresi ve sifre ile giris yapar.");
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.locationsButon);
        extentTest.info("Locations butonuna basar.");
        adminDashboard.countriesButon.click();
        extentTest.info("Countries butonuna basar.");

        softAssert.assertTrue(adminDashboard.countriesKayitSayisi.isDisplayed(),
                "Kayitli countries sayisi gorunmuyor");
        extentTest.pass("Kayitli countries sayisinin gorunurlulugunu test eder");
        System.out.println(adminDashboard.countriesKayitSayisi.getText());

        softAssert.assertTrue(adminDashboard.countriesDropdown.isDisplayed(),
                "Countries sayfasindaki 'Bulk Actios' isimli dropdown menu gorunmuyor");
        softAssert.assertTrue(adminDashboard.countriesDropdown.isEnabled(),
                "Countries sayfasindaki 'Bulk Actios' isimli dropdown menu aktif degil");
        extentTest.pass("Countries sayfasindaki 'Bulk Actios' isimli dropdown menunun gorunurlulugunu ve aktifligini test eder");

        softAssert.assertTrue(adminDashboard.countriesFilters.isDisplayed(),
                "Countries sayfasindaki 'Filters' butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.countriesFilters.isEnabled(),
                "Countries sayfasindaki 'Filters' butonu aktif degil");
        extentTest.pass("Countries sayfasindaki 'Filters' butonunun gorunurlulugunu ve aktifligini test eder");

        softAssert.assertTrue(adminDashboard.countriesSearchTextbox.isDisplayed(),
                "Countries sayfasindaki search textboxi gorunmuyor");
        softAssert.assertTrue(adminDashboard.countriesSearchTextbox.isEnabled(),
                "Countries sayfasindaki search textboxi aktif degil");
        extentTest.pass("Countries sayfasindaki search textboxinin gorunurlulugunu ve aktifligini test eder");

        softAssert.assertTrue(adminDashboard.countriesCreate.isDisplayed(),
                "Countries sayfasindaki 'Create' butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.countriesCreate.isEnabled(),
                "Countries sayfasindaki 'Create' butonu aktif degil");
        extentTest.pass("Countries sayfasindaki 'Create' butonunun gorunurlulugunu ve aktifligini test eder");

        softAssert.assertTrue(adminDashboard.countriesReload.isDisplayed(),
                "Countries sayfasindaki 'Reload' butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.countriesReload.isEnabled(),
                "Countries sayfasindaki 'Reload' butonu aktif degil");
        extentTest.pass("Countries sayfasindaki 'Reload' butonunun gorunurlulugunu ve aktifligini test eder");

        List< WebElement> countriesSayfaIcerigiListesi = Driver.getDriver().findElements(By.xpath("//tr[@role='row']"));

        for (WebElement each:countriesSayfaIcerigiListesi
        ) {
            softAssert.assertTrue(each.isDisplayed(),"Countries sayfasindaki ayrintilarinda gorunmeyen var");
            extentTest.pass("Countries sayfasindaki ayrintilarin gorunurlulugunu test eder");
            System.out.println(each.getText());
        }
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
