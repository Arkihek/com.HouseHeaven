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

public class US42_TC001 extends TestBaseReport {



    @Test
    public void test01(){
        AdminDashBoard_RealEstate_Properties adminDashBoardRealEstateProperties=new AdminDashBoard_RealEstate_Properties();
        SoftAssert softAssert=new SoftAssert();
        extentTest = extentReports.createTest("Package login test"," User logs into package");
        // Admin dashboard'a giriş yapılır,
        // Packages sayfasına ulaşılır ve sayfa yüklendiğinde doğru bir şekilde yüklenmelidir.

        // Browser acilir
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        // kullanici adi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminUsername.sendKeys("admin21");
        // kullanici sifresi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesadminPssword.sendKeys("951847");
        // signin nutonuna tıklanır.
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminSigninButonu.click();
        // Packages sayfasina tiklanir ve sayfanin görünür oldugu test edilir.
        ReusableMethods.waitFor(2);
        WebElement packages= Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Packages']"));
        packages.click();
        ReusableMethods.waitFor(2);
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.hauseheaven.com/admin/real-estate/packages"),"Pages are not displayed");

        extentTest.pass("Packages login succsesfull");
    }
}
