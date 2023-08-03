package test.US02_US13_US16_US33_US35_US49.US_16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US16_TC03 {

    @Test
    public void kayitliKullaniciHomeHeader() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();

        kullanici.signupButonu.click();
        kullanici.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.loginGiris.click();

        Assert.assertTrue(kullanici.home.isDisplayed());
        kullanici.home.click();
        Assert.assertTrue(kullanici.listing.isDisplayed());
        kullanici.listing.click();
        Assert.assertTrue(kullanici.projects.isDisplayed());
        kullanici.projects.click();
        Assert.assertTrue(kullanici.agents.isDisplayed());
        kullanici.agents.click();
        Assert.assertTrue(kullanici.blog.isDisplayed());
        kullanici.blog.click();
        Assert.assertTrue(kullanici.contact.isDisplayed());
        kullanici.contact.click();
        Assert.assertTrue(kullanici.signUp.isDisplayed());
        kullanici.signUp.click();
        Assert.assertTrue(kullanici.addProperty.isDisplayed());
        kullanici.addProperty.click();
        Assert.assertTrue(kullanici.team5Team5.isDisplayed());
        kullanici.team5Team5.click();
        Assert.assertTrue(kullanici.logout.isDisplayed());
        kullanici.logout.click();
    }
}
