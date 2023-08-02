package test.US02_US13_US16_US33_US35_US49.US_16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US16_TC04 {
    // burada hata var düzeltilecek sonradan

    @Test
    public void kayitliKullaniciHomeHeader() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();

        kullanici.signupButonu.click();
        kullanici.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.loginGiris.click();

        kullanici.home.click();
        Assert.assertTrue(kullanici.searchResult.isDisplayed());
        kullanici.listing.click();
        Assert.assertTrue(kullanici.advancedSearch.isDisplayed());
        kullanici.projects.click();
        Assert.assertTrue(kullanici.search.isDisplayed());
        kullanici.agents.click();
        Assert.assertTrue(kullanici.allAgents.isDisplayed());
        kullanici.blog.click();
        Assert.assertTrue(kullanici.Blog.isDisplayed());
        kullanici.contact.click();
        Assert.assertTrue(kullanici.Contact.isDisplayed());
        kullanici.signUp.click();
        //Assert.assertTrue(kullanici.forgotYourPassword.isDisplayed());
        kullanici.addProperty.click();
        //Assert.assertTrue(kullanici.registerANewAccount.isDisplayed());
        kullanici.team5Team5.click();
        Assert.assertTrue(kullanici.yourCurrentCredits.isDisplayed());
        kullanici.logout.click();
        Assert.assertTrue(kullanici.findAccessibleHomes.isDisplayed());
    }
}
