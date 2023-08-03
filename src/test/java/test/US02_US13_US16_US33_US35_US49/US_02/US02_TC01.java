package test.US02_US13_US16_US33_US35_US49.US_02;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US02_TC01 {


    @Test
    public void homeHeader(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();



        Assert.assertTrue(kullanici.home.isDisplayed());
        Assert.assertTrue(kullanici.listing.isDisplayed());
        Assert.assertTrue(kullanici.projects.isDisplayed());
        Assert.assertTrue(kullanici.agents.isDisplayed());
        Assert.assertTrue(kullanici.blog.isDisplayed());
        Assert.assertTrue(kullanici.contact.isDisplayed());
        Assert.assertTrue(kullanici.signUp.isDisplayed());
        Assert.assertTrue(kullanici.signIn.isDisplayed());
        Assert.assertTrue(kullanici.addProperty.isDisplayed());


    }

}
