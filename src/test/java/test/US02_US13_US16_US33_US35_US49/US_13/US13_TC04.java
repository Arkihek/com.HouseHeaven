package test.US02_US13_US16_US33_US35_US49.US_13;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import utilities.ConfigReader;
import utilities.Driver;

public class US13_TC04 {

    @Test
    public void buyCreditsErisebilirlik() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();


        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();

        kullanici.buyCredits.click();

        Assert.assertTrue(kullanici.credits5puan.isDisplayed());
        kullanici.credits5puan.click();
        Assert.assertTrue(kullanici.credits6puan.isDisplayed());
        kullanici.credits6puan.click();
        Assert.assertTrue(kullanici.credits7puan.isDisplayed());
        kullanici.credits7puan.click();
        Assert.assertTrue(kullanici.credits8puan.isDisplayed());
        kullanici.credits8puan.click();
    }
}
