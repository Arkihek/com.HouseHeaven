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

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class US32_TC005 extends TestBaseReport {

    AdminDashBoard_RealEstate_Properties adminDashBoardRealEstateProperties=new AdminDashBoard_RealEstate_Properties();
    SoftAssert softAssert=new SoftAssert();

    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void test01(){
        extentTest = extentReports.createTest("New comment test"," User adds and deletes new comments\n");

        // Yeni yorum ekleme başarılı bir şekilde gerçekleşmelidir ve eklenen yorumun silinip silinmelidir.

        // Browser acilir
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        // kullanici adi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminUsername.sendKeys("admin21");
        // kullanici sifresi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesadminPssword.sendKeys("951847");
        // signin nutonuna tıklanır.
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminSigninButonu.click();
        ReusableMethods.waitFor(2);
        // Testimonials sayfasina giris yapilir
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Testimonials']")).click();
        ReusableMethods.waitFor(2);
        // Yeni yorum eklenir.
        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-secondary action-item']")).click();
        ReusableMethods.waitFor(2);
        WebElement adKutusu=Driver.getDriver().findElement(By.xpath("//input[@id='name']"));
        actions.click(adKutusu)
                .sendKeys("abubakar")
                .sendKeys(Keys.TAB)
                .sendKeys("futbolcu")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("besiktas")
                .perform();
        ReusableMethods.waitFor(2);

        Driver.getDriver().findElement(By.xpath("//div[@class='widget-body']//button[@name='submit'][normalize-space()='Save & Exit']")).click();
        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//body[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/a[2]/i[1]")).click();
        ReusableMethods.waitFor(2);
        // Eklenen yorum daha sonra silinir
        Driver.getDriver().findElement(By.xpath("//button[@class='float-end btn btn-danger delete-crud-entry']")).click();

        extentTest.pass("Adding and deleting a new comment is successful");


    }
}
