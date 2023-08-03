package test.US02_US13_US16_US33_US35_US49.US_13;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US13_TC03 {

    @Test
    public void settingsErisebilirlik(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage = new UserHomepage();


        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();


        JSUtilities.clickWithJS(Driver.getDriver(), userHomepage.team5Team5);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(kullanici.settings.isDisplayed());
        Assert.assertTrue(kullanici.settings.isEnabled());
        kullanici.settings.click();

        Assert.assertTrue(kullanici.accountInformation.isDisplayed());
        Driver.closeDriver();
    }
}

