package test.US12_US14_US15.US_015;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.*;

public class US15_TC01 extends TestBaseReport {


    @Test
    public void accountPropertyErisebilirlik(){


        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage = new UserHomepage();


        extentTest = extentReports.createTest("Report Account Accessibility Test",
                                            "After logging into the registered user page, they should be able to access the account and go to the propetries");
        //
        //User goes to hauseheaven homepage
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User goes to hauseheaaven homepage");


        //User fills in information for login to the system
        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("Registered user enters correct username and password and clicks login link");
        kullanici.girisYaptiginaDairBilgi.click();
        extentTest.info("Click on profile after login");


        // scrolls down for the properties link to appear
        ReusableMethods.waitFor(1);
        WebElement sayfaKaydirmakicinYazilanElement=Driver.getDriver().findElement(By.xpath("//h4[text()='Your Current Credits: ']"));
        JSUtilities.scrollToElement(Driver.getDriver(),sayfaKaydirmakicinYazilanElement);
        extentTest.info("Scrolls down the page to see the Properties link");
        ReusableMethods.waitFor(1);
        kullanici.properties.click();
        extentTest.info("Clicks the Properties link");

        // The user has verified that he has accessed the account properties page
        Assert.assertTrue(kullanici.createaccounproperty.isDisplayed());
        extentTest.pass("Tests that you can access the Account Properties page");
        extentTest.info("Closes the Browser");



    }

}


