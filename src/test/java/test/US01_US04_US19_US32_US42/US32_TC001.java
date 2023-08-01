package test.US01_US04_US19_US32_US42;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US32_TC001 extends TestBaseReport {

    // Admin Dashboard' a giriş yapılmalı.

    UserHomepage userHomepage=new UserHomepage();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test01(){
        // Browser acilir
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));


    }
}
