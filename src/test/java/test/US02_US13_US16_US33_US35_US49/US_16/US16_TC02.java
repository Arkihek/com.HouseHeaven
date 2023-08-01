package test.US02_US13_US16_US33_US35_US49.US_16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US16_TC02 {

    @Test
    public void kayitliKullaniciHomeHeader() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();

        kullanici.signupButonu.click();
        kullanici.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.loginGiris.click();


        Assert.assertTrue(kullanici.home.isDisplayed());
        Assert.assertTrue(kullanici.listing.isDisplayed());
        Assert.assertTrue(kullanici.projects.isDisplayed());
        Assert.assertTrue(kullanici.agents.isDisplayed());
        Assert.assertTrue(kullanici.blog.isDisplayed());
        Assert.assertTrue(kullanici.contact.isDisplayed());
        Assert.assertTrue(kullanici.signUp.isDisplayed());
        Assert.assertTrue(kullanici.addProperty.isDisplayed());
        Assert.assertTrue(kullanici.team5Team5.isDisplayed());
        Assert.assertTrue(kullanici.logout.isDisplayed());

    }
}
