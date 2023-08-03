package test.US09_US24_US39_US47_US48;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US47_TC001 extends TestBaseReport {
    @Test
    public void TC001 (){
        extentTest = extentReports.createTest("Admin DashBoard'da Locations basligi altindaki ogelerin gorunululugu ve aktifligi testi",
                "Admin DashBoard'da Locations basligi altindaki ogeler gorunur ve aktif olmali");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        extentTest.info("Kullanici admindashboard sayfasina gider");
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        adminDashboard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.adminSignIn);
        extentTest.info("Kullanici email adresi ve sifre ile giris yapar.");

        softAssert.assertTrue(adminDashboard.locationsButon.isDisplayed(),"Locations butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.locationsButon.isEnabled(),"Locations butonu aktif degil");
        extentTest.pass("Locations butonunun gorunurlulugunu ve aktifligini test eder");
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.locationsButon);

        softAssert.assertTrue(adminDashboard.countriesButon.isDisplayed(),"Countries butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.countriesButon.isEnabled(),"Countries butonu aktif degil");
        extentTest.pass("Countries butonunun gorunurlulugunu ve aktifligini test eder");

        softAssert.assertTrue(adminDashboard.statesButon.isDisplayed(),"States butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.statesButon.isEnabled(),"States butonu aktif degil");
        extentTest.pass("States butonunun gorunurlulugunu ve aktifligini test eder");

        softAssert.assertTrue(adminDashboard.citiesButon.isDisplayed(),"Cities butonu gorunmuyor");
        softAssert.assertTrue(adminDashboard.citiesButon.isEnabled(),"Cities butonu aktif degil");
        extentTest.pass("Cities butonunun gorunurlulugunu ve aktifligini test eder");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
