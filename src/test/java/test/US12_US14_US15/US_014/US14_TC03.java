package test.US12_US14_US15.US_014;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.*;

public class US14_TC03 extends TestBaseReport {


    @Test
    public void mulkEklemeDuzenleme(){


        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage =new UserHomepage();


        extentTest = extentReports.createTest("Reported property adding and editing testing",
                                             "Registered user should be able to add and edit property");


        //User goes to hauseheaven homepage
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User goes to hauseheaven homepage");


        //User fills in information for login to the system
        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("The user logs into the page with the correct username and password");



        //User gets credit to give property ad
        kullanici.addProperty.click();
        kullanici.buyCredits.click();
        kullanici.credits5puan.click();
        extentTest.info("User buys credit to add property ad");



        //user enters card information //
        ReusableMethods.waitFor(1);
        kullanici.cardNumber.sendKeys(ConfigReader.getProperty("cardNumber"));
        kullanici.cardName.sendKeys(ConfigReader.getProperty("cardName"));
        kullanici.cardYilGun.sendKeys(ConfigReader.getProperty("cardYilGun"));
        kullanici.cardCVC.sendKeys(ConfigReader.getProperty("cardCVC"));
        ReusableMethods.waitFor(1);
        kullanici.cookies.click();
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.cardNumber);
        ReusableMethods.waitFor(2);
        kullanici.checkout.click();
        extentTest.info("Enters card information and clicks checkout link");


        //After the user completes the card transaction, she goes to the add property page where she can add the
        // property and fills in the required fields.
        ReusableMethods.waitFor(2);
        kullanici.addProperty.click();
        extentTest.info("After the user completes the card transaction, she clicks on the add property link");
        kullanici.title.sendKeys("For Sale 6+2 Villa");
        kullanici.description.sendKeys("2 years new building for sale from owner");
        kullanici.content.sendKeys("by the sea \n 315 m2 \n has a large garage");

        ReusableMethods.waitFor(1);
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.images);
        ReusableMethods.waitFor(1);
        kullanici.city.click();
        kullanici.cityClicktenSonraYeniKutu.sendKeys(Keys.ENTER);
        kullanici.propertyLocation.sendKeys("Newark");
        kullanici.latitude.sendKeys("2.17403");
        kullanici.longitude.sendKeys("2.1740338");
        kullanici.numberBedrooms.sendKeys("2");
        kullanici.numberBathrooms.sendKeys("2");
        kullanici.numberFloors.sendKeys("2");
        kullanici.square.sendKeys("315");
        kullanici.price.sendKeys("150000");
        ReusableMethods.waitFor(1);
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.typeForSale);
        ReusableMethods.waitFor(1);
        kullanici.wifi.click();
        kullanici.wineCellar.click();
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.title);
        ReusableMethods.waitFor(1);
        kullanici.category.click();
        ReusableMethods.waitFor(1);
        kullanici.categoryClicktenSonraYeniKutu.click();
        kullanici.categoryClicktenSonraYeniKutu.sendKeys("V" + Keys.ENTER);
        ReusableMethods.waitFor(1);
        extentTest.info("The user fills in all the necessary information for the ad.");



        //User saves information entered
        ReusableMethods.waitFor(2);
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.wishlist);
        ReusableMethods.waitFor(2);
        kullanici.saveExit.click();
        extentTest.info("After the user fills in her information, she presses the save button to save.");
        ReusableMethods.waitFor(2);

        // tests that the property is loaded
        Assert.assertTrue(kullanici.yuklenenMulk.isDisplayed());
        extentTest.pass("Tests that the property is loaded");


        //Tests that you can edit the uploaded property
        kullanici.addProperty.click();
        JSUtilities.scrollToElement(Driver.getDriver(),kullanici.title);
        kullanici.properties.click();
        kullanici.mulkDuzenleme.click();
        Assert.assertTrue(kullanici.title.isDisplayed());
        extentTest.pass("Tests that you can edit the loaded property");
        extentTest.info("Closes the Browser");

    }
}




