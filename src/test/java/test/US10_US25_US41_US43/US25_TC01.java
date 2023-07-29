package test.US10_US25_US41_US43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US25_TC01 extends TestBaseReport {

    @Test
    public void test01() throws InterruptedException {

        //Kayitli kullanici contact sayfasindan
        //iletisim bilgilerini
        //goruntuleyebilmeli

        extentTest = extentReports.createTest("Visibility of contact information test for registered user",
                "Registered user should be able to log in and contact informations should match ");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici hauseheaven anasayfaya gider");
        AccountPage_Property kullanici = new AccountPage_Property();

        // Kullanici sisteme login için bilgilerini dolduruyor
        kullanici.signIn.click();
        extentTest.info("giriş yapmak için sign ın linkine tıklar");
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        extentTest.info("Kullanıcı adını girer");
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("password'unu girer ve sayfaya login olur");


        WebElement contactButonu = Driver.getDriver().findElement(By.linkText("Contact"));
        contactButonu.click();
        WebElement address1 = Driver.getDriver().findElement(By.xpath("//div[@class='cn-info-content']"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(address1.isDisplayed());

        JSUtilities.scrollToBottom(Driver.getDriver(),Driver.getDriver());
        Thread.sleep(3000);
        JSUtilities.scrollToTop(Driver.getDriver());

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.tagName("iframe")));

        WebElement ifaddress2 =Driver.getDriver()
                .findElement(By.xpath("//div[text()='4655 Wild Indigo St, Houston, TX 77027, USA']"));
        JSUtilities.scrollToElement(Driver.getDriver(),ifaddress2);

        softAssert.assertTrue(ifaddress2.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);
        softAssert.assertTrue(address1.isDisplayed());


    }
}
