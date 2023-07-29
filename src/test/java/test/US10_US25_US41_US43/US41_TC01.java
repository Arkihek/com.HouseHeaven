package test.US10_US25_US41_US43;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RegisterationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US41_TC01 extends TestBaseReport {
    // Sign Up Today butonunun gorunur ve aktif oldugunu dogrulayabilmeli
    //Yeni kullanici kaydi yapılabilmeli

    //Body bolumundeki Sign Up Today butonunun gorunur ve aktif oldugunu dogrulayabilmeli

    RegisterationPage registerationPage = new RegisterationPage();

    @Test
    public void Test01() throws InterruptedException {
        extentTest = extentReports.createTest("Sign Up Today button visibility test",

                " Verify that the Sign Up  Today button is visible and active and create a new registration");



        registerationPage = new RegisterationPage();

        //Kullanici Hause Heaven anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User goes to Hause Heaven homepage");


        //Header bolumundeki Sign In butonuna basar
        registerationPage.sigInButonu.click();
        extentTest.info("Press the Sign In button in the header section");


        //login girisi altindaki "Register a new account" butonuna basar
        registerationPage.registerNewAccount.click();
        extentTest.info("user should be able to register new");

        //Register altindaki kutucuklari doldurur

        Faker faker = new Faker();
        registerationPage.registerFirstName.sendKeys(faker.name().firstName() + Keys.TAB);
        registerationPage.registerLastName.sendKeys(faker.name().lastName() + Keys.TAB);
        registerationPage.registerEMail.sendKeys(faker.internet().emailAddress() + Keys.TAB);
        registerationPage.registerUserName.sendKeys(faker.name().username() + Keys.TAB);
        registerationPage.registerPassword.sendKeys("asdf456." + Keys.TAB);
        registerationPage.registerPasswordConfirm.sendKeys("asdf456." + Keys.TAB);
        registerationPage.registerButon.click();

        registerationPage.logout.click();

        extentTest.pass("Correct information is entered");

    }
}





