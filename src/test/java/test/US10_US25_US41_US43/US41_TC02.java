package test.US10_US25_US41_US43;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RegisterationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import java.util.List;


public class US41_TC02 extends TestBaseReport {
    RegisterationPage registerationPage = new RegisterationPage();
    @Test
    public void test02() throws InterruptedException {



        SoftAssert softAssert = new SoftAssert();

        extentTest = extentReports.createTest("Admin accounts control Test", " Admin should be able to check and delete the registered accounts");
        Driver.getDriver().get("https://qa.hauseheaven.com/admin/login");
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("admin21");
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("951847");
        Driver.getDriver().findElement(By.xpath("//span[@class='signin']")).click();

        WebElement accountsButton = Driver.getDriver().findElement(By.xpath("//*[@class='fa fa-users']"));

        softAssert.assertTrue(accountsButton.isDisplayed());
        accountsButton.click();

        WebElement registeredAcconuts = Driver.getDriver().findElement(By.xpath("//span[@class='dt-length-records']"));
        String registeredAccounts1 = registeredAcconuts.getText();

        String numeric = registeredAccounts1.substring(21, 23);
        int justNumeric = Integer.parseInt(numeric);
        System.out.println(justNumeric);

        List<WebElement> ogeListesi = Driver.getDriver().findElements(By.xpath("//tbody/tr"));
        for (WebElement eachOgeler : ogeListesi
        ) {
            softAssert.assertTrue(eachOgeler.isDisplayed(), "Accounts can not be displayed");
            softAssert.assertTrue(eachOgeler.isEnabled(),"Accounts can not be enabled");
        }

        Driver.getDriver().navigate().refresh();
        Thread.sleep(3000);

        WebElement deleteAccountButton = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'][1]"));
        deleteAccountButton.click();
        Thread.sleep(3000);
        WebElement finalDeleteButton = Driver.getDriver().findElement(By.xpath("//button[@class='float-end btn btn-danger delete-crud-entry']"));
        finalDeleteButton.click();
        Thread.sleep(3000);

        WebElement deletedPopup = Driver.getDriver().findElement(By.xpath("//div[@class='toast-message']"));
        Thread.sleep(3000);
        deletedPopup.getText();
        String deletedSuccess = new String();
        String expectedResult = "Deleted successfully";
        String actualResult = deletedPopup.getText();
        System.out.println(actualResult);
        softAssert.assertTrue(deletedPopup.isDisplayed());

        softAssert.assertEquals(expectedResult,actualResult);
        Thread.sleep(2000);
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@class='toast-message']"));
        softAssert.assertTrue(successMessage.isDisplayed());
        System.out.println(deletedSuccess);
        softAssert.assertAll();


        extentTest.pass("\n" +
                "Admin can check and delete the accounts");


    }
}
