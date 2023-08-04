package test.US01_US04_US19_US32_US42;

import org.testng.annotations.Test;
import pages.AdminDashBoard_RealEstate_Properties;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US32_TC001 extends TestBaseReport {

    // Admin Dashboard' a giriş yapılmalı.




    @Test
    public void test01(){
        AdminDashBoard_RealEstate_Properties adminDashBoardRealEstateProperties=new AdminDashBoard_RealEstate_Properties();
        extentTest = extentReports.createTest("Admin dashboard login test"," User must login to Admin Dashboard page.");

        // Browser acilir
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        // kullanici adi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminUsername.sendKeys("admin21");
        // kullanici sifresi girilir
        adminDashBoardRealEstateProperties.RealEstatePropertiesadminPssword.sendKeys("951847");
        // signin nutonuna tıklanır.
        adminDashBoardRealEstateProperties.RealEstatePropertiesAdminSigninButonu.click();

        extentTest.pass("User can login test");

    }


}
