package test.US11_US28_US29_US30_US31;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US11_TC01 extends TestBaseReport {



    // Sign Up Today butonunun gorunur ve aktif oldugunu dogrulayabilmeli
    //Yeni kullanici kaydi yapılabilmeli

    //Body bolumundeki Sign Up Today butonunun gorunur ve aktif oldugunu dogrulayabilmeli

    RegisterationPage registerationPage=new RegisterationPage();

    @Test
    public void Test01() {
        extentTest = extentReports.createTest("Sign Up Today button visibility test",

                " Verify that the Sign Up  Today button is visible and active and create a new registration");



        registerationPage=new RegisterationPage();

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

        Faker faker=new Faker();
        registerationPage.registerFirstName.sendKeys(faker.name().firstName()+Keys.TAB);
        registerationPage.registerLastName.sendKeys(faker.name().lastName()+Keys.TAB);
        registerationPage.registerEMail.sendKeys(faker.internet().emailAddress()+Keys.TAB);
        registerationPage.registerUserName.sendKeys(faker.name().username()+Keys.TAB);
        registerationPage.registerPassword.sendKeys("asdf456."+Keys.TAB);
        registerationPage.registerPasswordConfirm.sendKeys("asdf456."+Keys.TAB);
        registerationPage.registerButon.click();

        registerationPage.logout.click();

        extentTest.pass("Correct information is entered");

    }


    @Test
    public void Test02(){
        extentTest=extentReports.createTest("Is the Account Dashboard page active",
                "Account Dashboard page functions should be view");

        registerationPage=new RegisterationPage();

        //Kullanici Hause Heaven anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User goes to Hause Heaven homepage");

        //Header bolumundeki Sign In butonuna basar
        registerationPage.sigInButonu.click();
        extentTest.info("Press the Sign In button in the header section");

        //Login altindaki Username ve Password doldurulur ve Login'e basar
        registerationPage.email.sendKeys("register@gmail.com");
        registerationPage.password.sendKeys("asdf456.");
        registerationPage.loginButton.click();
        extentTest.info("User login with correct information");

        registerationPage.user.isDisplayed();
        registerationPage.user.click();

        registerationPage.settingsButton.isDisplayed();
        registerationPage.settingsButton.click();
        registerationPage.buyCredits.isDisplayed();
        registerationPage.buyCredits.click();
        registerationPage.cookies.click();
        registerationPage.properties.isDisplayed();
        registerationPage.properties.click();
        registerationPage.security.isDisplayed();
        registerationPage.dashboardButton.click();
        registerationPage.dashboardButton.isDisplayed();

        registerationPage.approvedProperties.isDisplayed();
        registerationPage.pendingApproved.isDisplayed();
        registerationPage.rejectedProperties.isDisplayed();
        extentTest.pass("Dashboard page checked");

    }

    @Test
    public void test03(){
        extentTest=extentReports.createTest("Can the registered user log in?",
                "Registered user should be able to login again");

        registerationPage=new RegisterationPage();

        //Kullanici Hause Heaven anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User goes to Hause Heaven homepage");

        //Header bolumundeki Sign In butonuna basar
        registerationPage.sigInButonu.isDisplayed();
        registerationPage.sigInButonu.click();
        extentTest.info("Press the Sign In button in the header section");

        //Login altindaki Username ve Password doldurulur ve Login'e basar
        registerationPage.loginButton.isDisplayed();
        registerationPage.email.sendKeys("register@gmail.com");
        registerationPage.password.sendKeys("asdf456.");
        registerationPage.loginButton.click();
        extentTest.info("User login with correct information");

        Assert.assertTrue(registerationPage.user.isDisplayed());

        extentTest.pass("Registered user logged in again");



    }


}
