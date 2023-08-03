package test.US12_US14_US15.US_015;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.*;

public class US15_TC02 extends TestBaseReport {


    @Test
    public void accountPropertyMevcutIlanListele(){


        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage = new UserHomepage();


        extentTest = extentReports.createTest("Existing posting list test with report",
                                            "User account property should be able to view current listing list");

        //User goes to hauseheaven homepage
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User goes to hauseheaven homepage");


        //User fills in information for login to the system
        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("Enters username and password, clicks login link");
        kullanici.girisYaptiginaDairBilgi.click();
        extentTest.info("Click on your profile after login");


        // scrolls down for the properties link to appear
        ReusableMethods.waitFor(1);
        WebElement sayfaKaydirmakIcinYazilanElement=Driver.getDriver().findElement(By.xpath("//h4[text()='Your Current Credits: ']"));
        JSUtilities.scrollToElement(Driver.getDriver(),sayfaKaydirmakIcinYazilanElement);
        ReusableMethods.waitFor(1);
        kullanici.properties.click();
        extentTest.info("To see the properties link, scroll down the page and click on the properties link");


        //test that properties are listed
        Assert.assertTrue(kullanici.ilanSayiBilgi.isDisplayed());
        extentTest.pass("Tests that the currently loaded posting list is displayed");
        extentTest.info("Closes the Browser");


    }

}



