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

    UserHomepage userHomepage=new UserHomepage();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        userHomepage.signupButonu.click();

        userHomepage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));

        userHomepage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));

        userHomepage.loginGiris.click();

        List<WebElement>footerList=Driver.getDriver().findElements(By.xpath("(//div[@class='row'])[11]"));

        for (WebElement fotterEach:footerList
        ) {
            softAssert.assertTrue(fotterEach.isDisplayed(),"The menus in the Footer section are not displayed");

        }


    }
}
