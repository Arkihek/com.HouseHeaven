package test.US11_US28_US29_US30_US31;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.RegisterationPage;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US11_TC01 extends TestBaseReport {


    //Body bolumundeki Sign Up Today butonunun gorunur ve aktif oldugunu dogrulayabilmeli
    RegisterationPage registerationPage=new RegisterationPage();

    @Test
    public void Test01(){
        extentTest = extentReports.createTest("Sign Up Today button visibility test",
               " Be able to verify that the Sign Up Today button in the Body section is visible and active");

        //Kullanici Hause Heaven anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User goes to Hause Heaven homepage");

        //Header bolumundeki Sign In butonuna basar
        registerationPage.sigInButonu.click();
        extentTest.info("Press the Sign In button in the header section");



        //login girisi altindaki "Register a new account" butonuna basar
        registerationPage.registerNewAccount.click();

        //Register altindaki kutucuklari doldurur

        Faker faker=new Faker();
        registerationPage.registerFirstName.sendKeys(faker.name().firstName()+Keys.TAB);
        registerationPage.registerLastName.sendKeys(faker.name().lastName()+Keys.TAB);
        registerationPage.registerEMail.sendKeys(faker.internet().emailAddress()+Keys.TAB);
        registerationPage.registerUserName.sendKeys(faker.name().username()+Keys.TAB);
        registerationPage.registerPassword.sendKeys("asdf456."+Keys.TAB);
        registerationPage.registerPasswordConfirm.sendKeys("asdf456."+Keys.TAB);
        registerationPage.registerButon.click();
        extentTest.info("Correct information is entered");















    }
}
