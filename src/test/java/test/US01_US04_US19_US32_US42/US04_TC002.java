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

public class US04_TC002 extends TestBaseReport {

    // Footer bölümündeki fonksiyonların kullanılabilir olduğu kontrol edilmelidir.



    @Test
    public void test01() {
        UserHomepage userHomepage = new UserHomepage();
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("Footer section active","The user should test that the Footer section is active");
        // URL'ye gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Footer bölümündeki ogelerin aktif oldugu kontrol edilir.
        List<WebElement> footerList = Driver.getDriver().findElements(By.xpath("//*[@class='footer-widget']"));

        for (WebElement fotterEach : footerList
        ) {
            softAssert.assertTrue(fotterEach.isEnabled(), "The menus in the Footer section are not isEnabled");
        }
        extentTest.pass("The user should test that the Footer section is active");
    }
}
