package test.US01_US04_US19_US32_US42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import java.util.List;

public class US19_TC001 extends TestBaseReport {

    //Kayıtlı kullanıcı girişi yaparak
    // Footer bölümündeki tüm ögeler (örneğin; linkler,adresler ve düğmeler)
    // sayfa yüklendiğinde görünür olmalıdır.



    @Test
    public void test01(){
        UserHomepage userHomepage=new UserHomepage();
        SoftAssert softAssert=new SoftAssert();
        extentTest = extentReports.createTest("Footer section visibility","The user should test that the Footer section is visible.");
       // URL'ye gidilir
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // Signup butonuna tıklanır
        userHomepage.signupButonu.click();
        // Kullanici adi girilir
        userHomepage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        // Sifre girilir
        userHomepage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        // login'e tıklanir
        userHomepage.loginGiris.click();
        // Footer bolumundeki ogelerin gorunurlugu kontrol edilir.
        List<WebElement>footerList=Driver.getDriver().findElements(By.xpath("(//div[@class='row'])[11]"));

        for (WebElement fotterEach:footerList
        ) {
            softAssert.assertTrue(fotterEach.isDisplayed(),"The menus in the Footer section are not displayed");

        }

        extentTest.pass("User can access the website");
    }
}
