package test.US02_US13_US16_US33_US35_US49.US_16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US16_TC01 {

    @Test
    public void kayitliKullaniciHomeHeader(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();

        kullanici.signupButonu.click();
        kullanici.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.loginGiris.click();



    }
}