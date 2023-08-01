package test.US02_US13_US16_US33_US35_US49.US_13;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US13_TC02 {

    @Test
    public void settingsErisebilirlik(){
        SoftAssert softAssert=new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();


        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();


        Assert.assertTrue(kullanici.settings.isDisplayed());
        Assert.assertTrue(kullanici.settings.isEnabled());

        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.settings);
        ReusableMethods.waitFor(3);

        kullanici.save.click();
        Assert.assertTrue(kullanici.successful.isDisplayed());



    }
}
