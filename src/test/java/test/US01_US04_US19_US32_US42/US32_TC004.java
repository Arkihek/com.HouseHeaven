package test.US01_US04_US19_US32_US42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashBoard_RealEstate_Properties;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import java.util.List;

public class US32_TC004 extends TestBaseReport {
    AdminDashBoard_RealEstate_Properties adminDashBoardRealEstateProperties = new AdminDashBoard_RealEstate_Properties();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test() {
        extentTest = extentReports.createTest("Testimonials comments test"," User should be able to view comments on testimonials page");

        //Mevcut yorumlar sayfa yüklendiğinde görünür olmalı ve doğru şekilde listelenmelidir.

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

        //Yorumların gorunurlugu test edilir.
        List<WebElement> comments = Driver.getDriver().findElements(By.xpath("//td[@class='text-start no-sort dtr-control']"));
        for (WebElement each : comments) {
            softAssert.assertTrue(each.isDisplayed(), "Comments are not displayed");
            System.out.println(each.getText());
        }
        extentTest.pass("Comments displayed");
    }
}
