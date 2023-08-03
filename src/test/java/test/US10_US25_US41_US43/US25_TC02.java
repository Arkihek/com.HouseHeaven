package test.US10_US25_US41_US43;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US25_TC02 extends TestBaseReport {

    @Test
    public void test02() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
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
        UserHomepage userHomepage = new UserHomepage();



        WebElement nameKutusu= Driver.getDriver().findElement(By.xpath("//input[@type='text'][1]"));
        nameKutusu.click();
        nameKutusu.sendKeys("Ziyaretci"+ Keys.ENTER);

        WebElement emailKutusu = Driver.getDriver().findElement(By.xpath("//input[@type='email'][1]"));
        emailKutusu.sendKeys("yilmzihsn@gmail.com"+ Keys.ENTER);

        WebElement subjectKutusu = Driver.getDriver().findElement(By.xpath("//input[@name='subject']"));
        subjectKutusu.sendKeys("Konu"+Keys.ENTER);

        WebElement phoneKutusu = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneKutusu.sendKeys("0532"+Keys.ENTER);

        WebElement messageKutusu = Driver.getDriver().findElement(By.xpath("//textarea[@name='content']"));
        messageKutusu.sendKeys("message");

        WebElement sendMessageButonu = Driver.getDriver().findElement(By.xpath("//button[text()='Send message']"));
        sendMessageButonu.submit();

        WebElement successMessagePopup = Driver.getDriver().findElement(By.id("alert-container"));
        System.out.println(successMessagePopup.getText());

        softAssert.assertTrue(successMessagePopup.isDisplayed());
        Thread.sleep(2000);

        softAssert.assertAll();

        extentTest.pass("\n" +
                "Registered user can send a message through out the contact page");
    }
}
