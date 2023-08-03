package test.US02_US13_US16_US33_US35_US49.US_13;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US13_TC05 {

    @Test
    public void securityErisebilirlik(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage = new UserHomepage();

        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();


        JSUtilities.clickWithJS(Driver.getDriver(), userHomepage.team5Team5);
        Assert.assertTrue(kullanici.securitybody.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(kullanici.securitybody.isEnabled());
        JSUtilities.clickWithJS(Driver.getDriver(), kullanici.securitybody);


        kullanici.updatePassword.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(kullanici.Successfull.isDisplayed());
        ReusableMethods.waitFor(3);
        Driver.closeDriver();



    }
}
