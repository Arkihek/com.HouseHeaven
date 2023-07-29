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

public class US25_TC03 extends TestBaseReport {

    @Test
    public void test03() throws InterruptedException {

        //Internetin yavas oldugu durumlarda thread.sleep'lerin bekleme sureleri artirilmalidir
        // iframe'in gorunur olmasi icin bir kac saniye gerekebilir

        extentTest = extentReports.createTest("Sending message test for registered user",
                "Registered user should be able send a message through the contact page");

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

        JSUtilities.scrollToBottom(Driver.getDriver());
        Thread.sleep(3000);
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);




        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.tagName("iframe")));




        WebElement ifaddress2 =Driver.getDriver()
                .findElement(By.xpath("//div[text()='4655 Wild Indigo St, Houston, TX 77027, USA']"));
        JSUtilities.scrollToElement(Driver.getDriver(),ifaddress2);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(ifaddress2.equals(address1));
        Driver.getDriver().switchTo().defaultContent();
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);
        softAssert.assertTrue(address1.isDisplayed());

    }
}
