package test.US02_US13_US16_US33_US35_US49.US_35;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US35_TC05 {


    // yeni features ekleyip, düzeneleyip silebildiğini doğrulayabilmelidir.

    @Test
    public void test05(){
        AdminDashboard adminDashboard = new AdminDashboard();

        //Kullanici Hause Heaven Admin sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));

        adminDashboard.adminEMail.sendKeys("admin21"+ Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847"+Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();


        adminDashboard.realEstate.click();
        adminDashboard.realEstateBasligindakiler.isEnabled();
        adminDashboard.features.click();
        adminDashboard.create.click();
        adminDashboard.title.click();
        adminDashboard.icon.click();
        adminDashboard.save.click();
        adminDashboard.features.click();
        adminDashboard.edit.click();
        adminDashboard.features.click();
        adminDashboard.delete.click();

        Driver.closeDriver();
    }

}
