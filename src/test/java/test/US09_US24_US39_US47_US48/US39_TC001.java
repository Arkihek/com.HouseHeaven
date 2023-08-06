package test.US09_US24_US39_US47_US48;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class US39_TC001 extends TestBaseReport {

    @Test
    public void TC001 (){
        extentTest = extentReports.createTest("Newsletter abonesi ekleyebilme testi",
                "Anasayfada footer alaninda Subscribe bolumune giris yapilmali");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomepage userHomepage = new UserHomepage();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(userHomepage.subscribeTextbox.isDisplayed(),"Subscribe textbox gorunmuyor");
        extentTest.pass("Subscribe textbox gorunurlulugunu test eder");
        softAssert.assertTrue(userHomepage.subscribeTextbox.isEnabled(),"Subscribe textbox aktif degil");
        extentTest.pass("Subscribe textbox aktifligini test eder");
        softAssert.assertTrue(userHomepage.subscribeButon.isDisplayed(),"Subscribe butonu gorunmuyor");
        extentTest.pass("Subscribe butonunun gorunurlulugunu test eder");
        softAssert.assertTrue(userHomepage.subscribeButon.isEnabled(),"Subscribe butonu aktif degil");
        extentTest.pass("Subscribe butonunun aktifligini test eder");

        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        String fakerEmail = faker.internet().emailAddress();
        System.out.println(fakerEmail);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        ReusableMethods.waitFor(2);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].value='"+fakerEmail+"';",userHomepage.subscribeTextbox);
        ReusableMethods.waitFor(2);
        userHomepage.subscribeButon.click();
        ReusableMethods.waitFor(5);
        extentTest.info("Kullanici mail adresini girer ve Subscribe butonuna basar");
        String actualSubscribeAlert = userHomepage.subscribeAlert.getText();
        String expectedSubscribeAlert = "Subscribe to newsletter successfully!";
        softAssert.assertEquals(actualSubscribeAlert,expectedSubscribeAlert,"Gecersiz mail adresi veya kayitli mail adresi girilmistir");
        extentTest.pass("Newsletter abonesinin basariyla kaydedildigini test eder");
        softAssert.assertAll();
        Driver.getDriver().close();
        extentTest.info("Sayfayi kapatir");

    }

}
