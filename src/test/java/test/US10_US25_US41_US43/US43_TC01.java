package test.US10_US25_US41_US43;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US43_TC01 extends TestBaseReport {


    @Test
    public void test01() throws InterruptedException {

        extentTest = extentReports.createTest("New contact test", " Visitor should be able to add new contact");

        Driver.getDriver().get("https://qa.hauseheaven.com/");

        WebElement contackButton =Driver.getDriver().findElement(By.xpath("//*[@id=\"navigation\"]/div[2]/ul[1]/li[6]/a"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contackButton.isDisplayed());
        softAssert.assertTrue(contackButton.isEnabled());
        contackButton.click();





        Actions actions = new Actions(Driver.getDriver());

        WebElement nameArea = Driver.getDriver().findElement(By.xpath("//input[@name='name']"));
        nameArea.click();
        nameArea.sendKeys("Team5");

        WebElement emailArea = Driver.getDriver().findElement(By.xpath("//*[@id=\"contact\"]/div[1]/form/div[1]/div[2]/div/input"));
        emailArea.click();
        emailArea.sendKeys("yilmzihsn@gmail.com");

        WebElement subjectArea = Driver.getDriver().findElement(By.xpath("//input[@name='subject']"));
        subjectArea.click();
        subjectArea.sendKeys("newSubject");

        WebElement phoneArea = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneArea.click();
        phoneArea.sendKeys("0532");

        WebElement messageArea = Driver.getDriver().findElement(By.xpath("//textarea[@name='content']"));
        messageArea.click();
        messageArea.sendKeys("New message from the lord of the tests");

        WebElement sendMessageButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit'][1]"));
        sendMessageButton.submit();

        WebElement successMessage = Driver.getDriver().findElement(By.id("alert-container"));
        System.out.println(successMessage.getText());

        softAssert.assertTrue(successMessage.isDisplayed());

        softAssert.assertAll();

        Thread.sleep(2000);

        extentTest.pass("\n" +
                "Visitor can add a new contact");








    }
}
