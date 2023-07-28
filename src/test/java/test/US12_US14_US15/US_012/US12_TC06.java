package test.US12_US14_US15.US_012;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.*;

public class US12_TC06 extends TestBaseReport {

    @Test
    public void mulkSahibineMesajGonderme(){


        // Kullanıcı verilen URL'e gider
        extentTest = extentReports.createTest("Raporlu mülk sahibine mesaj gönderme testi","kullanıcı mülk sahiplerine mesaj gonderebılmelı");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage=new UserHomepage();
        extentTest.info("Kullanıcı hauseheaven anasayfaya gider");

        // Kullanici sisteme login için bilgilerini dolduruyor
        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("Kayıtlı kullanıcı dogru şifre ve password ile login olur");
        ReusableMethods.waitFor(3);

        // Kullanıcı listing sayfasından herhangı bır mulk ılanına tıklar
        //userHomepage.listing.click();
        ReusableMethods.waitFor(1);
        kullanici.mulkIlani.click();
        ReusableMethods.waitFor(1);
        extentTest.info("Login olduktan sonra lisstinf sayfasından herhangı bır mulk ılanına click yaapar");


        // sayfayı assagı kaydırır
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.nameIletisim);
        ReusableMethods.waitFor(1);

        // ve mesaj gonderılecek ılgılı kutucuga bılgılerını ve gondermek ıstedıgı mesajı gırer
        kullanici.nameIletisim.sendKeys("Serkan");
        kullanici.PhoneIletisim.sendKeys("06485266491");
        kullanici.emailIletisim.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.messageIletisim.sendKeys("İlanınızdaki evi almak istiyorum");

        // bilgilerini girdikten sonra send message butonun tıklar
        kullanici.sendMessageIletisim.click();
        extentTest.info("name , phone . email , message bilgilerini girer");
        extentTest.info("send mesaage butonuna click yapar");
        ReusableMethods.waitFor(1);

        // mesajın başarılı bır şekilde gittiğini test eder
        Assert.assertTrue(kullanici.sendMessageIletisimOnay.isDisplayed());
        extentTest.pass("mesaj başarıyla gönderılmıştır");






    }

}
