package test.US02_US13_US16_US33_US35_US49.US_02;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US02_TC03 {

    @Test
    public void homeHeader(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();

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
        Assert.assertTrue(kullanici.forgotYourPassword.isDisplayed());
        kullanici.signIn.click();
        Assert.assertTrue(kullanici.rememberMe.isDisplayed());
        kullanici.addProperty.click();
        Assert.assertTrue(kullanici.registerANewAccount.isDisplayed());
    }
}
