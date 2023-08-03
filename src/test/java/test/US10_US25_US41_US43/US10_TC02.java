package test.US10_US25_US41_US43;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US10_TC02 extends TestBaseReport {


    @Test
    public void test02() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("The contact page accessiblity test",
                " Visitor should be able to send message");
        Driver.getDriver().get(ConfigReader.getProperty("url"));


        WebElement contactButonu = Driver.getDriver().findElement(By.linkText("Contact"));
        contactButonu.click();
        UserHomepage userHomepage = new UserHomepage();



       WebElement nameKutusu= Driver.getDriver().findElement(By.xpath("//input[@type='text'][1]"));
       nameKutusu.click();
       nameKutusu.sendKeys("Ziyaretci"+ Keys.ENTER);

       WebElement emailKutusu = Driver.getDriver().findElement(By.xpath("//input[@type='email'][1]"));
        emailKutusu.sendKeys("yilmzihsn@gmail.com"+ Keys.ENTER);

        WebElement subjectKutusu = Driver.getDriver().findElement(By.xpath("//input[@name='subject']"));
        subjectKutusu.sendKeys("Konu"+Keys.ENTER);

        WebElement phoneKutusu = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneKutusu.sendKeys("0532"+Keys.ENTER);

        WebElement messageKutusu = Driver.getDriver().findElement(By.xpath("//textarea[@name='content']"));
        messageKutusu.sendKeys("message");

        WebElement sendMessageButonu = Driver.getDriver().findElement(By.xpath("//button[text()='Send message']"));
        sendMessageButonu.submit();


        WebElement yaziElementiSuccess= Driver.getDriver().findElement(By.xpath("//div[@class='contact-message contact-success-message']"));
        yaziElementiSuccess.getText();

        WebElement successMessage = Driver.getDriver().findElement(By.id("alert-container"));
        System.out.println(successMessage.getText());

        softAssert.assertTrue(successMessage.isDisplayed());
        softAssert.assertAll();

        extentTest.pass("\n" +
                "Visitor can send a message through out the contact page.");








    }
}
