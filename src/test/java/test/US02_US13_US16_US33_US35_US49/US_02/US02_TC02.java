package test.US02_US13_US16_US33_US35_US49.US_02;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US02_TC02 {

    @Test
    public void homeHeader(){
        SoftAssert softAssert=new SoftAssert();


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();


        Assert.assertTrue(kullanici.home.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.home);
        ReusableMethods.waitFor(3);
        String expectedHomeUrl="https://qa.hauseheaven.com/";
        String actualHomeUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualHomeUrl,expectedHomeUrl);
        Driver.closeDriver();

    }
    @Test
    public void listingTest(){
        SoftAssert softAssert=new SoftAssert();


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();


        Assert.assertTrue(kullanici.listing.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.listing);
        ReusableMethods.waitFor(3);
        String expectedListingUrl="https://qa.hauseheaven.com/properties?layout=sidebar";
        String actualListingUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualListingUrl,expectedListingUrl);
        Driver.closeDriver();


    }
    @Test
    public void projectsTest(){
        SoftAssert softAssert=new SoftAssert();


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();


        Assert.assertTrue(kullanici.projects.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.projects);
        ReusableMethods.waitFor(3);
        String expectedProjectsUrl="https://qa.hauseheaven.com/projects";
        String actualProjectsUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualProjectsUrl,expectedProjectsUrl);
        Driver.closeDriver();
    }
    @Test
    public void agentsTest(){
        SoftAssert softAssert=new SoftAssert();


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();


        Assert.assertTrue(kullanici.agents.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.agents);
        ReusableMethods.waitFor(3);
        String expectedAgentsUrl="https://qa.hauseheaven.com/agents";
        String actualAgentsUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualAgentsUrl,expectedAgentsUrl);
        Driver.closeDriver();
    }
    @Test
    public void blogTest(){
        SoftAssert softAssert=new SoftAssert();


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();


        Assert.assertTrue(kullanici.blog.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.blog);
        ReusableMethods.waitFor(3);
        String expectedBlogUrl="https://qa.hauseheaven.com/blog";
        String actualBlogUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualBlogUrl,expectedBlogUrl);
        Driver.closeDriver();
    }
    @Test
    public void contactTest(){
        SoftAssert softAssert=new SoftAssert();


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();


        Assert.assertTrue(kullanici.contact.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.contact);
        ReusableMethods.waitFor(3);
        String expectedContactUrl="https://qa.hauseheaven.com/contact";
        String actualContactUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualContactUrl,expectedContactUrl);
        Driver.closeDriver();
    }

    @Test
    public void signUpTest(){
        SoftAssert softAssert=new SoftAssert();


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();


        Assert.assertTrue(kullanici.signUp.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.signUp);
        ReusableMethods.waitFor(3);
        String expectedSignUpUrl="https://qa.hauseheaven.com/login";
        String actualSignUpUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualSignUpUrl,expectedSignUpUrl);
        Driver.closeDriver();
    }

    @Test
    public void addPropertyTest(){
        SoftAssert softAssert=new SoftAssert();


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();


        Assert.assertTrue(kullanici.addProperty.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.addProperty);
        ReusableMethods.waitFor(3);
        String expectedAddPropertyUrl="https://qa.hauseheaven.com/login";
        String actualAddPropertyUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualAddPropertyUrl,expectedAddPropertyUrl);
        Driver.closeDriver();
    }

    @Test
    public void signInTest(){
        SoftAssert softAssert=new SoftAssert();


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage kullanici = new UserHomepage();


        Assert.assertTrue(kullanici.signIn.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.signIn);
        ReusableMethods.waitFor(3);
        String expectedSignInUrl="https://qa.hauseheaven.com/login";
        String actualSignInUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualSignInUrl,expectedSignInUrl);
        Driver.closeDriver();
    }


}
