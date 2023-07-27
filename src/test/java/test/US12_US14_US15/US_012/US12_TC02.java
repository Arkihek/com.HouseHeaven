package test.US12_US14_US15.US_012;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US12_TC02 extends TestBaseReport {


    // Kayıtlı kullanıcı olarak sıte anasayfasının header bolumunden add property lınkının gorunur oldugunu
    // ve tıklandıgında yenı mulk ılanı acacagım saayfaya yonlendırdıgı dogrulanır

    @Test
    public void addPropertyLinki() {

        extentTest = extentReports.createTest("Raporlu add Property tetsi","Kullanici add property linkini görebilmeli ve tıkladıgında ilgili sayfaya gidebilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanıcı hauseheaven anasayfaya gider");
        AccountPage_Property kullanici = new AccountPage_Property();

        // Kullanici sisteme login için bilgilerini dolduruyor
        kullanici.signIn.click();
        extentTest.info("giriş yapmak için sign ın lınkıne tıklar");
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        extentTest.info("Kullanıcı adını girer");
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("password'unu girer ve sayfaya login olur");

        // add property lınkının gozuktugu dogrulanır
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(kullanici.addProperty.isDisplayed(),"add Property lınki gözükmelidir");
        extentTest.pass("add Property lınkının görüntülendiğini test eder");

        // add property lınkıne tıklanır ve ilgili sayfaya yönlendırıldıgı dogrulanır
        kullanici.addProperty.click();
        softAssert.assertTrue(kullanici.title.isDisplayed(),"add property'e tıklandıktan sonra tiitle gözükmelıdır");
        extentTest.pass("add property linkıne tıklar ve ılgılı sayfaya gittiğiniz test eder");
        softAssert.assertAll();



    }

}
