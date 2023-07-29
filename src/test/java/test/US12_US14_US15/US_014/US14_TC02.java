package test.US12_US14_US15.US_014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US14_TC02 {

    @Test
    public void accountPropertyMevcutIlanListe(){


            //User goes to hauseheaven homepage
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            AccountPage_Property kullanici = new AccountPage_Property();
            UserHomepage userHomepage = new UserHomepage();


            //User fills in information for login to the system
            kullanici.signIn.click();
            kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
            kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
            kullanici.login.click();
            WebElement girisBilgii=Driver.getDriver().findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
            girisBilgii.click();


            // scrolls down for the properties link to appear
            ReusableMethods.waitFor(1);
            WebElement sayfaKaydir=Driver.getDriver().findElement(By.xpath("//h4[text()='Your Current Credits: ']"));
            JSUtilities.scrollToElement(Driver.getDriver(),sayfaKaydir);
            ReusableMethods.waitFor(1);
            kullanici.properties.click();


            //test that properties are listed
            WebElement bilgi1= Driver.getDriver().findElement(By.xpath("//span[@class='dt-length-records']"));
            Assert.assertTrue(bilgi1.isDisplayed());
            Driver.getDriver().close();




    }



}
