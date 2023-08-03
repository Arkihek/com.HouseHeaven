package test.US02_US13_US16_US33_US35_US49.US_13;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US13_TC01 {

    @Test
    public void dashboardaErisebilirlik(){
        SoftAssert softAssert=new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage = new UserHomepage();


        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();

        JSUtilities.clickWithJS(Driver.getDriver(),userHomepage.team5Team5);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(kullanici.dashboard.isDisplayed());
        Assert.assertTrue(kullanici.dashboard.isEnabled());

        JSUtilities.clickWithJS(Driver.getDriver(),kullanici.dashboard);
        ReusableMethods.waitFor(3);



        String expectedDashboardUrl="https://qa.hauseheaven.com/account/dashboard";
        String actualDashboardUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualDashboardUrl,expectedDashboardUrl);
        Driver.closeDriver();
    }
}
