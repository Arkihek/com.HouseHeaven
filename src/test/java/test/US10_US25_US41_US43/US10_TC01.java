package test.US10_US25_US41_US43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US10_TC01 extends TestBaseReport {

    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("The contact page accessible test",
                " Visiter should be able to verify that can access the contact page");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        WebElement contactButonu = Driver.getDriver().findElement(By.linkText("Contact"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactButonu.isDisplayed());
        softAssert.assertTrue(contactButonu.isEnabled());
        contactButonu.click();
        Thread.sleep(2000);
        softAssert.assertAll();
        extentTest.pass("\n" +
                "User can access the contact page");
    }
}
