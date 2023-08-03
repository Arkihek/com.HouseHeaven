package test.US09_US24_US39_US47_US48;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.*;

public class US48_TC001 extends TestBaseReport {
    @Test
    public void TC001 (){

        extentTest = extentReports.createTest("Admin DashBoard'da Locations basligi altinda Countries sayfasinin gorunurlulugu ve aktifligi testi",
                "Admin DashBoard'da Locations basligi altinda Countries sayfasi gorunur ve aktif olmali");
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
        ReusableMethods.waitFor(2);
        String expectedUrl = "https://qa.hauseheaven.com/admin/countries";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Countries sayfasi acilmadi");
        extentTest.pass("Countries sayfasinin acildigini test eder");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
