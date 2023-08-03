package test.US01_US04_US19_US32_US42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashBoard_RealEstate_Properties;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US32_TC003 extends TestBaseReport {
    AdminDashBoard_RealEstate_Properties adminDashBoardRealEstateProperties=new AdminDashBoard_RealEstate_Properties();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test01(){
        extentTest = extentReports.createTest("Testimonials Number of comments test"," User should be able to view comments on testimonials page");

        // Testimoniels sayfasındaki yorum sayısı kontrol edilmelidir.


        // Browser acilir
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        // kullanici adi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminUsername.sendKeys("admin21");
        // kullanici sifresi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesadminPssword.sendKeys("951847");
        // signin nutonuna tıklanır.
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminSigninButonu.click();
        // Testimonials sayfasina giris yapilir
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Testimonials']")).click();
        // Testimonials sayfasindaki yorum sayisinin görünürlügü test edilir.
        WebElement yorumSayisi =Driver.getDriver().findElement(By.xpath("//span[@class='dt-length-records']"));
        softAssert.assertTrue(yorumSayisi.isDisplayed(),"Comments are not displayed");

        extentTest.pass("Number of comments displayed");

    }
}
