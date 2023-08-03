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

public class US19_TC002 extends TestBaseReport {


    SoftAssert softAssert=new SoftAssert();
    UserHomepage userHomepage=new UserHomepage();

    @Test
    public void test01(){
        extentTest = extentReports.createTest("\n" +
                "Active Footer test"," User tests that the Footer section is active");
        // Kayıtlı kullanıcı girişi yaparak Footer bölümündeki tüm ögeler aktif olmalıdır.

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // Signup butonuna tıklanır
        userHomepage.signupButonu.click();
        // Kullanici adi girilir
        userHomepage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        // Sifre girilir
        userHomepage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        // login'e tıklanir
        userHomepage.loginGiris.click();
        // Footer bolumundeki ogelerin aktif oldugu kontrol edilir.
        List<WebElement> footerList=Driver.getDriver().findElements(By.xpath("(//div[@class='row'])[11]"));

        for (WebElement fotterEach:footerList
        ) {
            softAssert.assertTrue(fotterEach.isEnabled(),"The menus in the Footer section are not Enabled");

        }
        extentTest.pass("User can access Footer is Enabled");
    }
}
