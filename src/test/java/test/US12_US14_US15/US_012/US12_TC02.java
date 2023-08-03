package test.US12_US14_US15.US_012;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US12_TC02 extends TestBaseReport {


    @Test
    public void addPropertyLinki() {

        AccountPage_Property kullanici = new AccountPage_Property();
        SoftAssert softAssert = new SoftAssert();


        extentTest = extentReports.createTest("Reported add Property tetsi","The user should be able to see the add property link and go to the relevant page when clicked");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User hauseheaven goes to homepage");

        // User fills in their information to log in to the system
        kullanici.signIn.click();
        extentTest.info("clicks on the sign in link to log in");
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        extentTest.info("Enters username");
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("enters his password and logs in to the page");

        // verify that the add property link appears
        softAssert.assertTrue(kullanici.addProperty.isDisplayed(),"The add Property link should appear");
        extentTest.pass("tests that the add Property link is displayed");

        // click on the add property link and confirm that you are directed to the relevant page
        kullanici.addProperty.click();
        softAssert.assertTrue(kullanici.title.isDisplayed(),"tiitle should appear after clicking add property");
        extentTest.pass("clicks on the add property link and tests that you go to the relevant page");
        softAssert.assertAll();



    }

}
