package test.US01_US04_US19_US32_US42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AdminDashBoard_RealEstate_Properties;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class US42_TC004 extends TestBaseReport {
    AdminDashBoard_RealEstate_Properties adminDashBoardRealEstateProperties=new AdminDashBoard_RealEstate_Properties();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void test01(){
        extentTest = extentReports.createTest("New packages delete test"," User deletes newly added packages");

        //Eklenen packages düzenlendikten sonra silinmeli ve silindiği kontrol edilmelidir.

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
        // Yeni eklenen Packages silinir.
        WebElement silmeButonu=Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[2]/i[1]"));
        silmeButonu.click();
        Driver.getDriver().findElement(By.xpath("//button[@class='float-end btn btn-danger delete-crud-entry']")).click();
        ReusableMethods.waitFor(3);

        extentTest.pass("Deletion successful");
    }
}
