package test.US12_US14_US15.US_012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.*;

public class US12_TC06 extends TestBaseReport {

    @Test
    public void mulkSahibineMesajGonderme(){


        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage=new UserHomepage();


        // User navigates to the given URL
        extentTest = extentReports.createTest("Test to send a message to a reported property owner","user should be able to send messages to property owners");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User hauseheaven goes to homepage");

        // User fills in their information to log in to the system
        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("Registered user logs in with the correct password and password");
        ReusableMethods.waitFor(3);

        //User clicks on any property listing from the listing page
        userHomepage.listing.click();
        ReusableMethods.waitFor(1);
        kullanici.mulkIlani.click();
        ReusableMethods.waitFor(1);
        extentTest.info("After logging in, click on any property advertisement from the lisstinf page");


        // scrolls the page down
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.nameIletisim);
        ReusableMethods.waitFor(1);

        // and enters the information and the message they want to send in the relevant box to send the message to
        kullanici.nameIletisim.sendKeys("Serkan");
        kullanici.PhoneIletisim.sendKeys("06485266491");
        kullanici.emailIletisim.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.messageIletisim.sendKeys("I want to buy the house in your ad");

        // clicks the send message button after entering the information
        kullanici.sendMessageIletisim.click();
        extentTest.info("name , phone , email , message , enters information");
        extentTest.info("makes you click on the send mesaage button");
        ReusableMethods.waitFor(1);

        // tests that the message went through successfully
        Assert.assertTrue(kullanici.sendMessageIletisimOnay.isDisplayed());
        extentTest.pass("message sent successfully");






    }

}
