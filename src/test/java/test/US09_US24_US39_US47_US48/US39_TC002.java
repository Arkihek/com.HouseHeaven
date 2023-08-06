package test.US09_US24_US39_US47_US48;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US39_TC002 extends TestBaseReport {
    @Test
    public void TC002 (){
        extentTest = extentReports.createTest("Admin DashBoard'inda Newsletter sayfasi aktifligi testi",
                "Admin DashBoard sayfasi acilmali ve Newsletter sayfasi aktif olmali");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        extentTest.info("Kullanici admindashboard sayfasina gider");
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        adminDashboard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.adminSignIn);
        extentTest.info("Kullanici email adresi ve sifre ile giris yapar.");
        softAssert.assertTrue(adminDashboard.adminDasboardButton.isDisplayed(),"admin dashboard sayfasina giris yapilamadi");
        extentTest.pass("Kullanicinin admin dashboarda giris yapildigini test eder");
        softAssert.assertTrue(adminDashboard.newsletterButon.isDisplayed(),"Newsletters butonu gorunmuyor");
        extentTest.pass("Kullanici Newsletters butonunun gorunululugunu test eder");
        adminDashboard.newsletterButon.click();
        extentTest.info("Newsletters butonuna tiklar");
        String actualNewslettersUrl = Driver.getDriver().getCurrentUrl();
        String expectedNewslettersUrl = "https://qa.hauseheaven.com/admin/newsletters";
        softAssert.assertEquals(actualNewslettersUrl,expectedNewslettersUrl,"Newsletters sayfasi acilmadi");
        extentTest.pass("Kullanici Newsletters sayfasinin acildigini test eder");
        softAssert.assertAll();
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }



}
