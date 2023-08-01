package test.US02_US13_US16_US33_US35_US49.US_13;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import utilities.ConfigReader;
import utilities.Driver;

public class US13_TC03 {

    @Test
    public void settingsErisebilirlik(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();


        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();


        Assert.assertTrue(kullanici.settings.isDisplayed());
        kullanici.settings.click();

        Assert.assertTrue(kullanici.accountInformation.isDisplayed());
    }
}

