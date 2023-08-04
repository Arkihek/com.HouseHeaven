package test.US02_US13_US16_US33_US35_US49.US_35;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US35_TC03 {

    //Bu sayfadaki Feautres'ların görüntülenebildiğini

    @Test
    public void test03(){
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
        JSUtilities.clickWithJS(Driver.getDriver(),adminDashboard.page1);
        JSUtilities.clickWithJS(Driver.getDriver(),adminDashboard.page2);
        JSUtilities.clickWithJS(Driver.getDriver(),adminDashboard.page3);
        JSUtilities.clickWithJS(Driver.getDriver(),adminDashboard.page4);
        JSUtilities.clickWithJS(Driver.getDriver(),adminDashboard.page5);
        JSUtilities.clickWithJS(Driver.getDriver(),adminDashboard.page6);
        Driver.closeDriver();

    }
}
