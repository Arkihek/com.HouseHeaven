package test.US01_US04_US19_US32_US42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashBoard_RealEstate_Properties;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.util.List;

public class US42_TC002 extends TestBaseReport {



    @Test
    public void test01() {
        AdminDashBoard_RealEstate_Properties adminDashBoardRealEstateProperties = new AdminDashBoard_RealEstate_Properties();
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("Packages displayed test"," User tests that the package is visible");
        //Packages sayfasındaki ögeler sayfa yüklendiğinde görünür ve aktif olmalıdır

        // Browser acilir
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        // kullanici adi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminUsername.sendKeys("admin21");
        // kullanici sifresi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesadminPssword.sendKeys("951847");
        // signin nutonuna tıklanır.
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminSigninButonu.click();
        // Packages sayfasina tiklanir.
        ReusableMethods.waitFor(2);
        WebElement packages = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Packages']"));
        packages.click();
        // Packages'deki ogelerin gorunur oldugu dogrulanir.
        List<WebElement> packagesOgeler = Driver.getDriver().findElements(By.xpath("//tr[@class='odd']//td[@class='text-start no-sort dtr-control']"));
        for (WebElement each : packagesOgeler) {
            softAssert.assertTrue(each.isDisplayed(), "Packages are not displayed");
            System.out.println(each.getText());

            extentTest.pass("Packages is Displayed");
        }
    }
}
