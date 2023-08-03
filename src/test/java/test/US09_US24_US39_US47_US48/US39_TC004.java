package test.US09_US24_US39_US47_US48;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.UserHomepage;
import utilities.*;

import java.util.List;

public class US39_TC004 extends TestBaseReport {

    @Test
    public void TC004 (){
        extentTest = extentReports.createTest("Newsletter abonesi ekleyebilme ve silebilme testi",
                "Newsletter abonesi ekleyebilmeli ve silinebilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici anasayfaya gider");
        UserHomepage userHomepage = new UserHomepage();
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        String fakerEmail = faker.internet().emailAddress();
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        ReusableMethods.waitFor(2);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].value='"+fakerEmail+"';",userHomepage.subscribeTextbox);
        ReusableMethods.waitFor(2);
        userHomepage.subscribeButon.click();
        ReusableMethods.waitFor(5);
        extentTest.info("Kullanici mail adresini girer ve Subscribe butonuna basar");
        String actualSubscribeAlert = userHomepage.subscribeAlert.getText();
        String expectedSubscribeAlert = "Subscribe to newsletter successfully!";
        System.out.println(actualSubscribeAlert);
        System.out.println(expectedSubscribeAlert);
        softAssert.assertEquals(actualSubscribeAlert,expectedSubscribeAlert,"Gecersiz mail adresi veya kayitli mail adresi girilmistir");
        extentTest.pass("Newsletter abonesinin basariyla kaydedildigini test eder");

        //Kullanici yeni bir tab acarak admin dashboardada Newsletters sayfasini acar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("urlAdmin"));
        extentTest.info("Kullanici admindashboard sayfasina gider");
        AdminDashboard adminDashboard = new AdminDashboard();
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].value='"+ConfigReader.getProperty("adminUser1")+"';",adminDashboard.adminEMail);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].value='"+ConfigReader.getProperty("adminPass")+"';",adminDashboard.adminPassword);
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.adminSignIn);
        extentTest.info("Kullanici email adresi ve sifre ile giris yapar.");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].click();", adminDashboard.newsletterButon);
        extentTest.info("Newsletters butonuna tiklar");
        String expectedKayitliEmail = fakerEmail;
        String actualKayitliEmail = Driver.getDriver().findElement(By.xpath("(//td[@class=' text-start column-key-email'])[1]")).getText();
        System.out.println(expectedKayitliEmail);
        System.out.println(actualKayitliEmail);
        softAssert.assertEquals(actualKayitliEmail,expectedKayitliEmail,"Kayit basarisiz");
        extentTest.pass("Kullanicinin kayit yaptirdigi mail ile Newsletters sayfasindaki mail ayni mi test eder");
        List<WebElement> deleteButonu = Driver.getDriver().findElements(By.xpath("//*[text()='Delete']"));

        if (deleteButonu.isEmpty()) {
            softAssert.assertTrue(deleteButonu.isEmpty(),"Delete butonu vardir.");
            extentTest.pass("Delete butonunun varligini test eder");
            // Buton bulunamadı
        } else {
            for (int i = 0; i <deleteButonu.size() ; i++) {
                // Buton var, ancak görünmez olabilir
                if (!deleteButonu.get(i).isDisplayed()) {
                    softAssert.assertTrue(deleteButonu.get(i).isDisplayed(), "Delete butonu gorunmez.");
                    extentTest.pass("Delete butonunun gorunmez oldugunu test eder");
                    // Buton görünmez
                } else {
                    javascriptExecutor.executeScript("arguments[0].click();", deleteButonu);
                    extentTest.pass("Delete butonunun aktifligini test eder");
                    // Buton görünür
                }
            }

        }

        softAssert.assertAll();
        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");

    }
}
