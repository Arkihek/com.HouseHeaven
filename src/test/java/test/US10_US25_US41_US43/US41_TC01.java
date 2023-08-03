package test.US10_US25_US41_US43;

import com.aventstack.extentreports.reporter.configuration.Theme;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.TestBaseReport;

public class US41_TC01 extends TestBaseReport {

    @Test
    public void test01() throws InterruptedException {

        //Bu alani faker ile yap

        extentTest = extentReports.createTest("opening a new account test",
                       "Visitor should be able to open a new account");



        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get("https://qa.hauseheaven.com/");
        WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-call-to-act']"));
        JSUtilities.scrollToBottom(Driver.getDriver());
        Thread.sleep(2000);
        signUpButton.click();
        Faker faker = new Faker();
        WebElement firstNameElementi = Driver.getDriver().findElement(By.name("first_name"));
        String firstName = faker.name().firstName();
        firstNameElementi.sendKeys(firstName);

        WebElement lastNameElementi = Driver.getDriver().findElement(By.name("last_name"));
        String lastNameFaker = faker.name().lastName();
        lastNameElementi.sendKeys(lastNameFaker);

        WebElement emailElementiFaker = Driver.getDriver().findElement(By.id("email"));

        String emailAdressFaker= faker.internet().emailAddress();
        emailElementiFaker.sendKeys(emailAdressFaker);

        WebElement usernameElementiFaker = Driver.getDriver().findElement(By.id("username"));
        String userNameFaker = faker.name().username();
        usernameElementiFaker.sendKeys(userNameFaker);
        WebElement passwordFirstElementi = Driver.getDriver().findElement(By.id("password"));
        String passwordElementiFaker = faker.internet().password(6,7);
        passwordFirstElementi.sendKeys(passwordElementiFaker);
        WebElement passwordConfirmElemeti = Driver.getDriver().findElement(By.id("password-confirm"));
        passwordConfirmElemeti.sendKeys(passwordElementiFaker);
        WebElement registerButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit'][1]"));

        registerButton.submit();
        Thread.sleep(2000);
        softAssert.assertAll();

        Driver.closeDriver();


        // extentTest.pass("\n" +
         //       "Visitor should be able to create an account");



    }
}
