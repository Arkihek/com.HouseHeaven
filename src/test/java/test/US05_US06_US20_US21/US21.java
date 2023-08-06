package test.US05_US06_US20_US21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ListingPage;
import pages.UserHomepage;
import utilities.*;

import java.util.List;

public class US21 extends TestBaseReport {

    @Test
    public void TC01() {
        extentTest = extentReports.createTest("posting test");
        ListingPage listingPage = new ListingPage();

        // Details of properties on the listing page should be able to reach
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage userHomepage = new UserHomepage();
        userHomepage.signupButonu.click();
        userHomepage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        userHomepage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.usernamegiris);
        ReusableMethods.waitFor(3);
        userHomepage.loginGiris.click();
        listingPage.listLink.click();
        listingPage.listSayfacookies.click();
        ReusableMethods.waitFor(3);
        //The registered user should be able to access the details of
        //the properties by clicking the listing link on the top bar of the homepage.

        List<WebElement> ilanDetaylari = Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("ilanDetay2")));
        for (WebElement eachilan : ilanDetaylari) {
            Assert.assertTrue(eachilan.isDisplayed(), "Liste goruntulenemedi");
            // System.out.println(eachilan.getText());

        }
        Driver.closeDriver();
    }

    @Test
    public void TC02() {
        //Browser opens, go to URL
        ListingPage listingPage = new ListingPage();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage userHomepage = new UserHomepage();

        //Click on the "Sign In" button at the top of the homepage
        userHomepage.signupButonu.click();

        //Valid "username" and "password" on the login page
        //Enter the values and click the "Login" button.
        userHomepage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        userHomepage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.usernamegiris);
        ReusableMethods.waitFor(3);
        userHomepage.loginGiris.click();
        ReusableMethods.waitFor(5);
        listingPage.listLink.click();
        JSUtilities.scrollToElement(Driver.getDriver(), listingPage.scrollTime);
        ReusableMethods.waitFor(3);
        listingPage.houseclick.click();
        ReusableMethods.waitFor(3);
        //The ad must be shareable from the social media addons on the Share link.
        softAssert.assertTrue(listingPage.twitter.isEnabled());
        softAssert.assertTrue(listingPage.linkedin.isEnabled());
        listingPage.wishlist.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(3);
        // extentTest.info("your ad be shareable from the social media addons on the Share link.");
        // The ad must be added to the wishlist.
        softAssert.assertTrue(listingPage.alertElement.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void Test03() {
        ListingPage listingPage = new ListingPage();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        UserHomepage userHomepage = new UserHomepage();
        userHomepage.signupButonu.click();
        userHomepage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        userHomepage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.usernamegiris);
        ReusableMethods.waitFor(3);
        userHomepage.loginGiris.click();
        ReusableMethods.waitFor(5);
        listingPage.listLink.click();
        JSUtilities.scrollToElement(Driver.getDriver(), listingPage.scrollTime);
        ReusableMethods.waitFor(3);
        listingPage.houseclick.click();

       //Service can be given 3 points, Value for Money 4 points, Location 2 points, Cleanlinnes 5 points, and
        // Verify that the average Rating' is calculated
        listingPage.propertyWriteReview3Star.get(0).sendKeys(Keys.ENTER);
        listingPage.propertyWriteReview4Star.get(1).sendKeys(Keys.ENTER);
        listingPage.propertyWriteReview2Star.get(2).sendKeys(Keys.ENTER);
        listingPage.propertyWriteReview5Star.get(3).sendKeys(Keys.ENTER);
        String expectedAverageRaiting="3.50";
        String actualAveragaRaiting=listingPage.propertyWriteReviewAverageRaitingElement.getText();
        Assert.assertEquals(actualAveragaRaiting,expectedAverageRaiting);

        //Verify that the "Messages" box is visible
        JSUtilities.scrollToElement(Driver.getDriver(), listingPage.messageTextBox);
        ReusableMethods.waitFor(2);
        //Verifies that text can be written in the Messages box
        listingPage.messageTextBox.sendKeys("Your message was created successfully");
        ReusableMethods.waitFor(2);

        //Verifies that the "Submit Review" button is visible
        listingPage.submitReviev.isDisplayed();
        ReusableMethods.waitFor(2);
        //Click the "Submit Review" button
        listingPage.submitReviev.click();
        ReusableMethods.waitFor(2);
        //It is verified that a comment has been added to the advertisement page.
        softAssert.assertTrue(listingPage.messageAlert.isDisplayed());
       // extentTest.info("your message has been sent successfully");

        Driver.closeDriver();
    }

}


