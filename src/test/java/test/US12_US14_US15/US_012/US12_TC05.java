package test.US12_US14_US15.US_012;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage_Property;
import pages.AdminDashboard;
import pages.UserHomepage;
import utilities.*;

public class US12_TC05 extends TestBaseReport {


    @Test
    public void dogruMulkIlani(){


    extentTest = extentReports.createTest("Correct loading test with details of loaded property with report",
            "The information the user enters to upload the property should appear in the property details after uploading in the same way");


    //User goes to hauseheaven homepage
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    AccountPage_Property kullanici = new AccountPage_Property();
    UserHomepage userHomepage =new UserHomepage();
    AdminDashboard adminDashboard=new AdminDashboard();
    Actions actions = new Actions(Driver.getDriver());
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
        kullanici.title.sendKeys("For Sale Villa Admin2");
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


    //Login with admin username and password
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.adminSignIn.click();
        extentTest.info("Go to admin page and login with correct username and password");
        ReusableMethods.waitFor(1);
        adminDashboard.realEstate.click();
        ReusableMethods.waitFor(1);
        adminDashboard.realEstateProperties.click();
        adminDashboard.yukklenenIlanIDAdminEdit.click();
        ReusableMethods.waitFor(1);
        adminDashboard.moderationStatus.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        adminDashboard.adminModernStatusUstuSaveExit.click();
        extentTest.info("Converts the posting from pending to approwed in realEstate and saves it");
        Assert.assertTrue(adminDashboard.pendingAprowed.isDisplayed());
        extentTest.pass("pending ad converted to approwed");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        userHomepage.listing.click();
        String ilkUrunTitle=kullanici.listingIlkUrun.getText();
        extentTest.info("The user goes to the url and tests that it is loaded");
        String yuklenenIlanTitle="For Sale Villa Admin2";
        ReusableMethods.waitFor(1);
        WebElement sayfaAssagiKaydirma=Driver.getDriver().findElement(By.xpath("//h1[@class='ipt-title']"));
        JSUtilities.scrollToElement(Driver.getDriver(),sayfaAssagiKaydirma);
        ReusableMethods.waitFor(1);
        kullanici.listingIlkUrun.click();
        Assert.assertEquals(ilkUrunTitle,yuklenenIlanTitle);
        extentTest.pass("Seen by other users on the listing page");
        ReusableMethods.waitFor(1);

        String expectedMulkFiayat="$150,000";
        String actualMulkfiyat=kullanici.yuklenenMulkFiyat.getText();
        Assert.assertEquals(actualMulkfiyat,expectedMulkFiayat);
        extentTest.info("The property price has been correctly uploaded to the site.");

        String expected="by the sea";
        String actual=kullanici.yuklenenMulkDescription.getText();
        Assert.assertTrue(actual.contains(expected));
        extentTest.info("Description correctly uploaded to the site");

        extentTest.info("Uploaded Mulk has been uploaded to the site correctly with details");
        extentTest.info("The browser is closed");




    }
}
