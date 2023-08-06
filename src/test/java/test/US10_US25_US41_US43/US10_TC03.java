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

public class US10_TC03 extends TestBaseReport {

    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void test01() throws InterruptedException {

        extentTest = extentReports.createTest("The contact page accessiblity and address equality test",
                " Visitor should be able to verify that can access the contact page and addresses should match");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        SoftAssert softAssert = new SoftAssert();
        WebElement contactButonu = Driver.getDriver().findElement(By.linkText("Contact"));
        contactButonu.click();
        WebElement address1 = Driver.getDriver().findElement(By.xpath("(//div[@class='cn-info-content'])[1]"));
        String addressText  = address1.getText();



        JSUtilities.scrollToBottom(Driver.getDriver());
        Thread.sleep(3000);
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);
        System.out.println(addressText);


        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.tagName("iframe")));


        WebElement ifaddress2 =Driver.getDriver()
                .findElement(By.xpath("//div[@class='place-name']"));
        JSUtilities.scrollToElement(Driver.getDriver(),ifaddress2);
        String ifaddressText = ifaddress2.getText();
        System.out.println(ifaddressText);

        softAssert.assertTrue(ifaddress2.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);
        softAssert.assertTrue(address1.isDisplayed());
        softAssert.assertTrue(addressText.contains(ifaddressText));
        softAssert.assertAll();

        extentTest.pass("\n" +
               "Visitor can access the contact page and verifies that addresses match");
    }
}
