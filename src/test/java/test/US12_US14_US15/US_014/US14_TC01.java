package test.US12_US14_US15.US_014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US14_TC01 {


    @Test
    public void accountErisebilirlik(){

        //
        //User goes to hauseheaven homepage
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage = new UserHomepage();


        //User fills in information for login to the system
        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        WebElement girisBilgii=Driver.getDriver().findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
        girisBilgii.click();


        // scrolls down for the properties link to appear
        ReusableMethods.waitFor(1);
        WebElement sayfaKaydir=Driver.getDriver().findElement(By.xpath("//h4[text()='Your Current Credits: ']"));
        JSUtilities.scrollToElement(Driver.getDriver(),sayfaKaydir);
        ReusableMethods.waitFor(1);
        kullanici.properties.click();

        // The user has verified that he has accessed the account properties page
        WebElement createaccounproperty=Driver.getDriver().findElement(By.xpath("//span[@data-action='create']"));
        Assert.assertTrue(createaccounproperty.isDisplayed());
        Driver.getDriver().close();



    }

}
