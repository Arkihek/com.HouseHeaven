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
        // Adresler bana gore eslesmiyor. Ihsan hocayla gorus.
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
        Thread.sleep(3000);



        WebElement contactButonu = Driver.getDriver().findElement(By.linkText("Contact"));
        contactButonu.click();
        WebElement address1 = Driver.getDriver().findElement(By.xpath("(//div[@class='cn-info-content'])[1]"));
        String addressText  = address1.getText();



        JSUtilities.scrollToBottom(Driver.getDriver());
        Thread.sleep(3000);
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);
        System.out.println(addressText);


        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.tagName("iframe")));


        WebElement ifaddress2 =Driver.getDriver()
                .findElement(By.xpath("//div[@class='place-name']"));
        JSUtilities.scrollToElement(Driver.getDriver(),ifaddress2);
        String ifaddressText = ifaddress2.getText();
        System.out.println(ifaddressText);

        softAssert.assertTrue(ifaddress2.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);
        softAssert.assertTrue(address1.isDisplayed());
        softAssert.assertTrue(addressText.contains(ifaddressText));
        softAssert.assertAll();

       // extentTest.pass("\n" +
        //        "");




/*
        WebElement ifaddress2 =Driver.getDriver()
                .findElement(By.xpath("//*[text()='4655 Wild Indigo St, Houston, TX 77027, USA']"));
        String ifaddress = new String();
        ifaddress = ifaddress2.getText().substring(0,16);
                //.toString().substring(0,16);




        JSUtilities.scrollToElement(Driver.getDriver(),ifaddress2);




        softAssert.assertTrue(address.equals(ifaddress));
        Driver.getDriver().switchTo().defaultContent();


        JSUtilities.scrollToTop(Driver.getDriver());
        System.out.println(ifaddress);
        Thread.sleep(3000);

        // String streetName = address.split(" ")[1];
        softAssert.assertAll();


 */
    }
}
