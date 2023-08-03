package test.US01_US04_US19_US32_US42;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US01_TC001 extends TestBaseReport {

    // Bir ziyaretçi olarak siteyi kullanabilmek icin web sitesine erişebildiğimi doğrulayabilmeliyim.

    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void test01(){
        extentTest = extentReports.createTest("The website is accessible test"," User should be able to verify that I can access the website");
        //Browser acilir
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // Website ye erişilebildiği kontrol edilir.
        String ecpected="https://qa.hauseheaven.com/";

        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actual,ecpected);
        extentTest.pass("User can access the website");
        // Giriş testi yapılmiştır

    }

}


