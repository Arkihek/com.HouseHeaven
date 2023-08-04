package test.US02_US13_US16_US33_US35_US49.US_35;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class US35_TC01 {

    //Admin dashboard'a giriş yapılmalıdır.

    @Test
    public void Test01() {
        AdminDashboard adminDashboard = new AdminDashboard();

        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));

        adminDashboard.adminEMail.sendKeys("admin21"+ Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847"+Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        Driver.closeDriver();
    }
}
