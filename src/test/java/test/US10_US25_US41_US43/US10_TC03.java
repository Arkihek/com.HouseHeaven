package test.US10_US25_US41_US43;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US10_TC03 extends TestBaseReport {

    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("The contact page accessiblity and address equality test",
                " User should be able to verify that can access the contact page and addresses should match");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        WebElement contactButonu = Driver.getDriver().findElement(By.linkText("Contact"));
        contactButonu.click();
        WebElement address1 = Driver.getDriver().findElement(By.xpath("//div[@class='cn-info-content']"));

        JSUtilities.scrollToBottom(Driver.getDriver(),Driver.getDriver());
        Thread.sleep(3000);
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);




        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.tagName("iframe")));




        WebElement ifaddress2 =Driver.getDriver()
                .findElement(By.xpath("//div[text()='4655 Wild Indigo St, Houston, TX 77027, USA']"));
        JSUtilities.scrollToElement(Driver.getDriver(),ifaddress2);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(ifaddress2.equals(address1));
        Driver.getDriver().switchTo().defaultContent();
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);
        softAssert.assertTrue(address1.isDisplayed());


    }


}
