package test.US01_US04_US19_US32_US42;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashBoard_RealEstate_Properties;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class US32_TC002 extends TestBaseReport {


    @Test
    public void test02(){
        AdminDashBoard_RealEstate_Properties adminDashBoardRealEstateProperties=new AdminDashBoard_RealEstate_Properties();
        SoftAssert softAssert=new SoftAssert();
        // Testimoniels sayfasına ulaşılabilmeli ve düzgün bir şekilde görüntülenmelidir.

        extentTest = extentReports.createTest("Testimonials login test"," User should be able to click on admin testimonials and view");
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
        ReusableMethods.waitFor(2);
        // Sayfanin gorunurlugu test edilir.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.hauseheaven.com/admin/testimonials"),"The testimonials page could not be displayed");

        extentTest.pass("User page displayed");

    }
}
