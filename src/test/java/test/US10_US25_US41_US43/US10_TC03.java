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
                " User should be able to verify that can access the contact page and addresses should match");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        WebElement contactButonu = Driver.getDriver().findElement(By.linkText("Contact"));
        contactButonu.click();
        WebElement address1 = Driver.getDriver().findElement(By.xpath("//*[text()=' 4655 Wild Indigo St Houston Tx 77027-7080 Usa']"));



        System.out.println(address1.getText().substring(0,19));
        JSUtilities.scrollToBottom(Driver.getDriver());
        Thread.sleep(3000);
        JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);




        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.tagName("iframe")));



        // (By.xpath("//*[starts-with(@id,'lst')]"));
        WebElement ifaddress2 =Driver.getDriver()
                .findElement(By.xpath("//div[@class='address']"));
       // JSUtilities.scrollToElement(Driver.getDriver(),ifaddress2);
       // System.out.println(ifaddress2.getText());
        System.out.println(ifaddress2.getText().substring(0,19));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(ifaddress2.equals(address1));
        Driver.getDriver().switchTo().defaultContent();
        //JSUtilities.scrollToTop(Driver.getDriver());
        Thread.sleep(3000);


       // softAssert.assertAll();

       // extentTest.pass("\n" +
        //                "");

    }
}
