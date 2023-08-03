package test.US01_US04_US19_US32_US42;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashBoard_RealEstate_Properties;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class US42_TC003 extends TestBaseReport {


    @Test
    public void test01(){
        AdminDashBoard_RealEstate_Properties adminDashBoardRealEstateProperties=new AdminDashBoard_RealEstate_Properties();
        SoftAssert softAssert=new SoftAssert();

        Actions actions=new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("New packages test"," User adds new packages\n");

        //Yeni packages eklenmeli ve ekleme başarıyla gerçekleşmelidir.

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
        // Yeni bir Package eklenir.
        Driver.getDriver().findElement(By.xpath("//span[@data-action='create']")).click();
        ReusableMethods.waitFor(2);
        WebElement adKutusu=Driver.getDriver().findElement(By.xpath("//input[@id='name']"));

        actions.click(adKutusu)
                .sendKeys("abubakar")
                .sendKeys(Keys.TAB)
                .sendKeys("2000000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("25")
                .sendKeys(Keys.TAB)
                .sendKeys("5")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .perform();
        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//div[@class='widget-body']//button[@name='submit'][normalize-space()='Save & Exit']")).click();
        ReusableMethods.waitFor(2);

        extentTest.pass("New Packages succsesfull");

    }
}
