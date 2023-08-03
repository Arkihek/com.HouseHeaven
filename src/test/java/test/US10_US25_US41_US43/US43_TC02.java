package test.US10_US25_US41_US43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

import java.util.List;


public class US43_TC02 extends TestBaseReport {






    @Test
    public void test01() throws InterruptedException {

      // BUG BUG BUG!!!----> Delete butonu gorunmuyor eklenen oge delete edilemiyor
        extentTest = extentReports.createTest("Checking contacts by Admin Test", "Admin should be able to check the contacts");

        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get("https://qa.hauseheaven.com/admin/login");
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("admin21");
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("951847");
        Driver.getDriver().findElement(By.xpath("//span[@class='signin']")).click();

        WebElement contactNumbersVisibility = Driver.getDriver().findElement(By.xpath("//span[@class='badge badge-default']"));
        contactNumbersVisibility.click();
        Thread.sleep(2000);
        softAssert.assertTrue(contactNumbersVisibility.isDisplayed());
        softAssert.assertTrue(contactNumbersVisibility.isEnabled());



        WebElement contactNumbers = Driver.getDriver().findElement(By.xpath("//span[@class='badge badge-success menu-item-count unread-contacts']"));
        contactNumbers.click();
        Thread.sleep(3000);




        // softAssert.assertTrue(contactNumbers.isDisplayed());

        List<WebElement> contactsInformations = Driver.getDriver().findElements(By.xpath("//span[@class='badge badge-success menu-item-count unread-contacts']"));
        for (WebElement eachinformation : contactsInformations) {
            softAssert.assertTrue(eachinformation.isDisplayed(), "Contact information is not displayed");


            WebElement editButton = Driver.getDriver().findElement(By.xpath("//td[@class=' text-center']"));
            editButton.click();


            Thread.sleep(2000);
           WebElement ddownMenu= Driver.getDriver().findElement(By.id("status"));
           Select select = new Select(ddownMenu);
            select.selectByIndex(0);
            ddownMenu.submit();

           WebElement saveExit = Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
            JSUtilities.clickWithJS(Driver.getDriver(),saveExit);
           Thread.sleep(3000);



            //WebElement saveOnly = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-success'][1]"));
            // saveOnly.click();

           // WebElement contactNumberss = Driver.getDriver().findElement(By.xpath("//span[@class='badge badge-success menu-item-count unread-contacts']"));
           // contactNumberss.click();

            WebElement contactSayisi2 = Driver.getDriver().findElement(By.xpath("//span[@class='dt-length-records']"));
            softAssert.assertTrue(contactSayisi2.isDisplayed(),"contact numbers are not displayed");


            Thread.sleep(3000);
            softAssert.assertAll();

            extentTest.info("\n" +
                    "Admin can edit the new contacts");

            extentTest.fail("\n" +
                    "Admin can not delete the contact, delete button doesn't exist");

        }
    }
    }


