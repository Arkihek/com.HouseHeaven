package test.US12_US14_US15.US_012;

import com.beust.ah.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomePage_Body;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.sql.ResultSet;

public class US12_TC01 {


    @Test //Save&Exit
    public void mulkEkle() {

        // Kullanıcı hauseheaven anasayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();

        // Kullanici sisteme login için bilgilerini dolduruyor
        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();


        // Kullanici mulk ılanı verebılmek ıcın kredi alıyor
        kullanici.addProperty.click();
        kullanici.buyCredits.click();
        kullanici.credits5puan.click();


        // kullanıcı kart bılgılerını gırıyor //
        ReusableMethods.waitFor(1);
        kullanici.cardNumber.sendKeys(ConfigReader.getProperty("cardNumber"));
        kullanici.cardName.sendKeys(ConfigReader.getProperty("cardName"));
        kullanici.cardYilGun.sendKeys(ConfigReader.getProperty("cardYilGun"));
        kullanici.cardCVC.sendKeys(ConfigReader.getProperty("cardCVC"));
        ReusableMethods.waitFor(1);
        WebElement cookies = Driver.getDriver().findElement(By.xpath("//button[@class='js-cookie-consent-agree cookie-consent__agree']"));
        cookies.click();
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.cardNumber);
        ReusableMethods.waitFor(2);
        kullanici.checkout.click();

        // kullanıcı kart işlemını tamamladıktan sonra mulk ekleyebılecegı add property sayfasına gider ve gereklı alanları doldurur
        ReusableMethods.waitFor(2);
        kullanici.addProperty.click();
        kullanici.title.sendKeys("Satlık 6+2 Villa");
        kullanici.description.sendKeys("2 yıllık yeni yapı sahibinden satlık");
        kullanici.content.sendKeys("Denize sıfır konumda\n 315 m2 \n büyük bir garaja sahip");
        ReusableMethods.waitFor(1);


        // siteye foto yüklemeli //
        JSUtilities.scrollToElement(Driver.getDriver(),kullanici.content);
        ReusableMethods.waitFor(1);
        WebElement imagesElement = Driver.getDriver().findElement(By.xpath("//div[@id='multiple-upload']"));
        ReusableMethods.waitFor(2);
        String dinamikDosyaYolu = "Villa2.webp";
        ReusableMethods.waitFor(5);
        imagesElement.sendKeys(dinamikDosyaYolu);
        ReusableMethods.waitFor(5);




        ReusableMethods.waitFor(1);
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.images);
        ReusableMethods.waitFor(1);
        kullanici.city.click();
        kullanici.cityClicktenSonraYeniKutu.sendKeys(Keys.ENTER);
        kullanici.propertyLocation.sendKeys("Newark");
        kullanici.latitude.sendKeys("2.17403");
        kullanici.longitude.sendKeys("2.1740338");
        kullanici.numberBedrooms.sendKeys("2");
        kullanici.numberBathrooms.sendKeys("2");
        kullanici.numberFloors.sendKeys("2");
        kullanici.square.sendKeys("315");
        kullanici.price.sendKeys("150000");
        ReusableMethods.waitFor(1);
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.typeForSale);
        ReusableMethods.waitFor(1);
        kullanici.wifi.click();
        kullanici.wineCellar.click();
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.title);
        ReusableMethods.waitFor(1);
        kullanici.category.click();
        ReusableMethods.waitFor(1);
        kullanici.categoryClicktenSonraYeniKutu.click();
        kullanici.categoryClicktenSonraYeniKutu.sendKeys("V" + Keys.ENTER);
        ReusableMethods.waitFor(1);


        // 2 farklı save ıle kaydetmeyı unutma
        //kullanici.save.click();
        //kullanici.saveExit.click();
    }
}