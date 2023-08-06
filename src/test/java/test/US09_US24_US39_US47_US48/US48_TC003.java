package test.US09_US24_US39_US47_US48;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.*;

public class US48_TC003 extends TestBaseReport {
    @Test
    public void TC003 (){

        extentTest = extentReports.createTest("Admin DashBoard'da Locations basligi altinda Countries sayfasinda yeni ulke ekleme, duzenleme ve silme testi",
                "Admin DashBoard'da Locations basligi altinda Countries sayfasinda yeni ulke eklenmeli, duzenlenebilmeli ve silinebilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        extentTest.info("Kullanici admindashboard sayfasina gider");
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(Driver.getDriver());
        adminDashboard.adminEMail.sendKeys(ConfigReader.getProperty("adminUser1"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.adminSignIn);
        extentTest.info("Kullanici email adresi ve sifre ile giris yapar.");
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.locationsButon);
        extentTest.info("Locations butonuna basar.");
        adminDashboard.countriesButon.click();
        extentTest.info("Countries butonuna basar.");
        adminDashboard.countriesCreate.click();

        // Yeni ulke ekleme testi
        extentTest.info("Create butonuna basar.");
        adminDashboard.countriesName.sendKeys("Japan");
        extentTest.info("Ulke ismi girer");
        adminDashboard.countriesNationality.sendKeys("Japanese");
        extentTest.info("Milliyetini girer");
        adminDashboard.countriesISOCode.sendKeys("JP");
        extentTest.info("Ulke ISO kodunu girer");
        adminDashboard.countriesDialCode.sendKeys("3166");
        extentTest.info("Ulke Dial kodunu girer");
        adminDashboard.countriesOrder.clear();
        adminDashboard.countriesOrder.sendKeys("7");
        extentTest.info("Order kodunu girer");
        ReusableMethods.waitFor(1);
        adminDashboard.countriesSaveExit.click();
        extentTest.info("Save&Exit butonuna tiklar");
        String expectedNewCreateCountriesMessage = "Created successfully";
        String actualNewCreateCountriesMessage = adminDashboard.countriesSaveMessage.getText();
        softAssert.assertEquals(actualNewCreateCountriesMessage,expectedNewCreateCountriesMessage,"Giris yapilamadi");
        System.out.println(adminDashboard.countriesSaveMessage.getText());
        extentTest.pass("Yeni Countries kayidi yapilmasini test eder");
        ReusableMethods.waitFor(2);

        //Kayit yapilan ulkede degisiklik yapma testi
        Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("(//i[@class='fa fa-edit'])[2]")).click();
        extentTest.info("Kayitli countries'in duzenlenebildigini test etmek icin 'Edit' botununa tiklar. ");
        adminDashboard.countriesName.clear();
        adminDashboard.countriesName.sendKeys("Turkey");
        extentTest.info("Yeni Ulke ismi girer");
        adminDashboard.countriesNationality.clear();
        adminDashboard.countriesNationality.sendKeys("Turkish");
        extentTest.info("Yeni Milliyetini girer");
        adminDashboard.countriesISOCode.clear();
        adminDashboard.countriesISOCode.sendKeys("TR");
        extentTest.info("Yeni Ulke ISO kodunu girer");
        adminDashboard.countriesDialCode.clear();
        adminDashboard.countriesDialCode.sendKeys("1234");
        extentTest.info("Yeni Ulke Dial kodunu girer");
        adminDashboard.countriesOrder.clear();
        adminDashboard.countriesOrder.sendKeys("12");
        extentTest.info("Yeni Order kodunu girer");
        ReusableMethods.waitFor(1);
        adminDashboard.countriesSave.click();
        extentTest.info("Save butonuna tiklar");
        ReusableMethods.waitFor(1);
        String expectedUpdateCreateCountriesMessage = "Updated successfully";
        String actualUpdateCreateCountriesMessage = adminDashboard.countriesSaveMessage.getText();
        softAssert.assertEquals(actualUpdateCreateCountriesMessage,expectedUpdateCreateCountriesMessage,
                "Kayitta degisiklik yapilarak guncellenemedi");
        System.out.println(adminDashboard.countriesSaveMessage.getText());
        extentTest.pass("Kaydin guncellenebildigini test eder");
        ReusableMethods.waitFor(2);

        //Kayit yapilan ulkeyi silme testi
        adminDashboard.countriesSaveExit.click();
        extentTest.info("Save&Exit butonuna tiklayarak 'Countries' sayfasina donulur");
        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("(//i[@class='fa fa-trash'])[1]")).click();
        adminDashboard.countriesDeleteOnay.click();
        ReusableMethods.waitFor(2);
        String expectedDeleteCreateCountriesMessage = "Delete successfully";
        String actualDeleteCreateCountriesMessage = adminDashboard.countriesSaveMessage.getText();
        softAssert.assertEquals(actualDeleteCreateCountriesMessage,expectedDeleteCreateCountriesMessage,
                "Kayit silinemedi");
        System.out.println(adminDashboard.countriesSaveMessage.getText());
        extentTest.pass("Kaydin silinebildigini test eder");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
