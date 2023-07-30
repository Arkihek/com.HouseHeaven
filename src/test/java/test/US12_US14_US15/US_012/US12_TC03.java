package test.US12_US14_US15.US_012;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import utilities.*;

public class US12_TC03 extends TestBaseReport {


    //İlan formunu doldurabilmeliyim, resim yukleyebilmeliyim,
    //features kismindaki boxlari secebildigimi ve iki farkli yolla
    //save edebildigimi dogrulamaliyim.

    @Test
    public void addPropertSayfasi(){

        extentTest = extentReports.createTest("Raporlu add Property Form dolfurma tetsi","Kullanıcı add property sayfasında gerekli kutuları doldurabilmeli");
        SoftAssert softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AccountPage_Property kullanici = new AccountPage_Property();
        extentTest.info("Kullanıcı hauseheaven anasayfasına gıder");

        // Kullanici sisteme login için bilgilerini dolduruyor
        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("Kullanıcı dogru kullanıcı adı ve şifreyi girdikten sonra login butonuna tıklar");

        // Kullanıcı add property lınkıne tıklar ve ilgili kutucukları doldurablıdıgını test eder
        kullanici.addProperty.click();
        extentTest.info("Kullanıcı add property lınkıne tıklar");
        kullanici.title.sendKeys("Satlık Ev");
        String actualGirilenVeri = kullanici.title.getAttribute("value");
        Assert.assertEquals(actualGirilenVeri,"Satlık Ev");

        kullanici.description.sendKeys("6+2 Müstakil 2 Katlı");
        actualGirilenVeri = kullanici.description.getAttribute("value");
        Assert.assertEquals(actualGirilenVeri,"6+2 Müstakil 2 Katlı");

        JSUtilities.scrollToElement(Driver.getDriver(),kullanici.description);
        ReusableMethods.waitFor(2);

        kullanici.content.sendKeys("Büyük bir garaja sahip , bahçesi büyük ve yeni yapı 2 yıllık");
        actualGirilenVeri = kullanici.content.getAttribute("value");
        //String expectedGi
        Assert.assertEquals(actualGirilenVeri ,"Büyük bir garaja sahip , bahçesi büyük ve yeni yapı 2 yıllık");
        ReusableMethods.waitFor(2);
        JSUtilities.scrollToElement(Driver.getDriver(),kullanici.content);

        kullanici.propertyLocation.sendKeys("Newark");
        actualGirilenVeri = kullanici.propertyLocation.getAttribute("value");
        Assert.assertEquals(actualGirilenVeri,"Newark");
        ReusableMethods.waitFor(2);
        JSUtilities.scrollToElement(Driver.getDriver(),kullanici.propertyLocation);

        kullanici.numberBedrooms.sendKeys("2");
        actualGirilenVeri = kullanici.numberBedrooms.getAttribute("value");
        Assert.assertEquals(actualGirilenVeri,"2");
        ReusableMethods.waitFor(2);

        kullanici.numberBathrooms.sendKeys("2");
        actualGirilenVeri = kullanici.numberBathrooms.getAttribute("value");
        Assert.assertEquals(actualGirilenVeri,"2");
        JSUtilities.scrollToElement(Driver.getDriver(),kullanici.numberBathrooms);

        kullanici.numberFloors.sendKeys("2");
        actualGirilenVeri = kullanici.numberFloors.getAttribute("value");
        Assert.assertEquals(actualGirilenVeri,"2");

        kullanici.square.sendKeys("315");
        actualGirilenVeri = kullanici.square.getAttribute("value");
        Assert.assertEquals(actualGirilenVeri,"315");


     //   if (actualGirilenVeri.equals("Test Kullanıcısı")) {
     //       System.out.println("Form alanı başarıyla dolduruldu.");
     //   } else {
     //       System.out.println("Form alanı doldurulamadı.");
     //   }

        //Kullanıcı resim yükleyebildigini test eder




        //Kullanıcı features kısmındakı boxları secebıldıgını test edebılmelı
        kullanici.wifi.click();
        Assert.assertTrue(kullanici.wifi.isSelected());
        extentTest.pass("wifi box'u seçilebilir");
        kullanici.parking.click();
        Assert.assertTrue(kullanici.parking.isSelected());
        extentTest.pass("parking box'u seçilebilir");
        kullanici.swimmingPool.click();
        Assert.assertTrue(kullanici.swimmingPool.isSelected());
        extentTest.pass("swimmingPool box'u seçilebilir");
        kullanici.balcony.click();
        Assert.assertTrue(kullanici.balcony.isSelected());
        extentTest.pass("balcony box'u seçilebilir");
        kullanici.garden.click();
        Assert.assertTrue(kullanici.garden.isSelected());
        extentTest.pass("garden box'u seçilebilir");
        kullanici.security.click();
        Assert.assertTrue(kullanici.security.isSelected());
        extentTest.pass("security box'u seçilebilir");
        kullanici.fitnessCenter.click();
        Assert.assertTrue(kullanici.fitnessCenter.isSelected());
        extentTest.pass("fitnessCenter box'u seçilebilir");
        kullanici.airConditioning.click();
        Assert.assertTrue(kullanici.airConditioning.isSelected());
        extentTest.pass("airConditioning box'u seçilebilir");
        kullanici.centralHeating.click();
        Assert.assertTrue(kullanici.centralHeating.isSelected());
        extentTest.pass("centralHeating box'u seçilebilir");
        kullanici.laundryRoom.click();
        Assert.assertTrue(kullanici.laundryRoom.isSelected());
        extentTest.pass("laundryRoom box'u seçilebilir");
        kullanici.petsAllow.click();
        Assert.assertTrue(kullanici.petsAllow.isSelected());
        extentTest.pass("petsAllow box'u seçilebilir");
        kullanici.spaMassage.click();
        Assert.assertTrue(kullanici.spaMassage.isSelected());
        extentTest.pass("spaMassage box'u seçilebilir");
        kullanici.landscapedBackyard.click();
        Assert.assertTrue(kullanici.landscapedBackyard.isSelected());
        extentTest.pass("landscapedBackyard box'u seçilebilir");
        kullanici.coveredPatio.click();
        Assert.assertTrue(kullanici.coveredPatio.isSelected());
        extentTest.pass("coveredPatio box'u seçilebilir");
        kullanici.fireplace.click();
        Assert.assertTrue(kullanici.fireplace.isSelected());
        extentTest.pass("fireplace box'u seçilebilir");
        kullanici.landscapedYard.click();
        Assert.assertTrue(kullanici.landscapedYard.isSelected());
        extentTest.pass("landscapedYard box'u seçilebilir");
        kullanici.attachedGarage.click();
        Assert.assertTrue(kullanici.attachedGarage.isSelected());
        extentTest.pass("attachedGarage box'u seçilebilir");
        kullanici.rooftopDeck.click();
        Assert.assertTrue(kullanici.rooftopDeck.isSelected());
        extentTest.pass("rooftopDeck box'u seçilebilir");
        kullanici.privateBalcony.click();
        Assert.assertTrue(kullanici.privateBalcony.isSelected());
        extentTest.pass("privateBalcony box'u seçilebilir");
        kullanici.walkinCloset.click();
        Assert.assertTrue(kullanici.walkinCloset.isSelected());
        extentTest.pass("walkinCloset box'u seçilebilir");
        kullanici.backyard.click();
        Assert.assertTrue(kullanici.backyard.isSelected());
        extentTest.pass("backyard box'u seçilebilir");
        kullanici.lowMaintenanceLandscaping.click();
        Assert.assertTrue(kullanici.lowMaintenanceLandscaping.isSelected());
        extentTest.pass("lowMaintenanceLandscaping box'u seçilebilir");
        kullanici.soaringCeilings.click();
        Assert.assertTrue(kullanici.soaringCeilings.isSelected());
        extentTest.pass("soaringCeilings box'u seçilebilir");
        kullanici.wellMaintainedGarden.click();
        Assert.assertTrue(kullanici.wellMaintainedGarden.isSelected());
        extentTest.pass("wellMaintainedGarden box'u seçilebilir");
        kullanici.highCeilings.click();
        Assert.assertTrue(kullanici.highCeilings.isSelected());
        extentTest.pass("highCeilings box'u seçilebilir");
        kullanici.privateBackyard.click();
        Assert.assertTrue(kullanici.privateBackyard.isSelected());
        extentTest.pass("privateBackyard box'u seçilebilir");
        kullanici.privateElevator.click();
        Assert.assertTrue(kullanici.privateElevator.isSelected());
        extentTest.pass("privateElevator box'u seçilebilir");
        kullanici.highEndKitchenAppliances.click();
        Assert.assertTrue(kullanici.highEndKitchenAppliances.isSelected());
        extentTest.pass("highEndKitchenAppliances box'u seçilebilir");
        kullanici.rooftopTerraceWithJacuzzi.click();
        Assert.assertTrue(kullanici.rooftopTerraceWithJacuzzi.isSelected());
        extentTest.pass("rooftopTerraceWithJacuzzi box'u seçilebilir");
        kullanici.gatedCommunityWithSecurity.click();
        Assert.assertTrue(kullanici.gatedCommunityWithSecurity.isSelected());
        extentTest.pass("gatedCommunityWithSecurity box'u seçilebilir");
        kullanici.fitnessCenterAndSpa.click();
        Assert.assertTrue(kullanici.fitnessCenterAndSpa.isSelected());
        extentTest.pass("fitnessCenterAndSpa box'u seçilebilir");
        kullanici.smartHomeTechnology.click();
        Assert.assertTrue(kullanici.smartHomeTechnology.isSelected());
        extentTest.pass("smartHomeTechnology box'u seçilebilir");
        kullanici.smartHomeAutomation.click();
        Assert.assertTrue(kullanici.smartHomeAutomation.isSelected());
        extentTest.pass("smartHomeAutomation box'u seçilebilir");
        kullanici.wineCellar.click();
        Assert.assertTrue(kullanici.wineCellar.isSelected());
        extentTest.pass("wineCellar box'u seçilebilir");
        kullanici.infinityPool.click();
        Assert.assertTrue(kullanici.infinityPool.isSelected());
        extentTest.pass("infinityPool box'u seçilebilir");
        kullanici.rooftopDeckWithCityViews.click();
        Assert.assertTrue(kullanici.rooftopDeckWithCityViews.isSelected());
        extentTest.pass("rooftopDeckWithCityViews box'u seçilebilir");
        kullanici.securityAndConciergeServices.click();
        Assert.assertTrue(kullanici.securityAndConciergeServices.isSelected());
        extentTest.pass("securityAndConciergeServices box'u seçilebilir");
        kullanici.privateLanai.click();
        Assert.assertTrue(kullanici.privateLanai.isSelected());
        extentTest.pass("privateLanai box'u seçilebilir");
        kullanici.chefsKitchenWithHighEndAppliances.click();
        Assert.assertTrue(kullanici.chefsKitchenWithHighEndAppliances.isSelected());
        extentTest.pass("chefsKitchenWithHighEndAppliances box'u seçilebilir");
        kullanici.outdoorBarbecueArea.click();
        Assert.assertTrue(kullanici.outdoorBarbecueArea.isSelected());
        extentTest.pass("outdoorBarbecueArea box'u seçilebilir");
        kullanici.resortStylePoolAndClubhouse.click();
        Assert.assertTrue(kullanici.resortStylePoolAndClubhouse.isSelected());
        extentTest.pass("resortStylePoolAndClubhouse box'u seçilebilir");
        kullanici.gourmetKitchenWithQuartzCountertops.click();
        Assert.assertTrue(kullanici.gourmetKitchenWithQuartzCountertops.isSelected());
        extentTest.pass("gourmetKitchenWithQuartzCountertops box'u seçilebilir");
        kullanici.homeTheaterAndGameRoom.click();
        Assert.assertTrue(kullanici.homeTheaterAndGameRoom.isSelected());
        extentTest.pass("homeTheaterAndGameRoom box'u seçilebilir");
        kullanici.gatedCommunityWithSecurity45.click();
        Assert.assertTrue(kullanici.gatedCommunityWithSecurity45.isSelected());
        extentTest.pass("gatedCommunityWithSecurity45 box'u seçilebilir");
        kullanici.privateRooftopDeckWithInfinityPool.click();
        Assert.assertTrue(kullanici.privateRooftopDeckWithInfinityPool.isSelected());
        extentTest.pass("privateRooftopDeckWithInfinityPool box'u seçilebilir");
        kullanici.chefsKitchenWithPremiumAppliances.click();
        Assert.assertTrue(kullanici.chefsKitchenWithPremiumAppliances.isSelected());
        extentTest.pass("chefsKitchenWithPremiumAppliances box'u seçilebilir");
        kullanici.privateHotTubAndOutdoorFireplace.click();
        Assert.assertTrue(kullanici.privateHotTubAndOutdoorFireplace.isSelected());
        extentTest.pass("privateHotTubAndOutdoorFireplace box'u seçilebilir");
        kullanici.homeOffice.click();
        Assert.assertTrue(kullanici.homeOffice.isSelected());
        extentTest.pass("homeOffice box'u seçilebilir");
        kullanici.skiinSkiOutAccess.click();
        Assert.assertTrue(kullanici.skiinSkiOutAccess.isSelected());
        extentTest.pass("skiinSkiOutAccess box'u seçilebilir");
        kullanici.privateRooftopTerraceWithinfinityPool.click();
        Assert.assertTrue(kullanici.privateRooftopTerraceWithinfinityPool.isSelected());
        extentTest.pass("privateRooftopTerraceWithinfinityPool box'u seçilebilir");
        kullanici.stateoftheartKitchenWithPremiumAppliances.click();
        Assert.assertTrue(kullanici.stateoftheartKitchenWithPremiumAppliances.isSelected());
        extentTest.pass("stateoftheartKitchenWithPremiumAppliances box'u seçilebilir");
        kullanici.spainspiredBathrooms.click();
        Assert.assertTrue(kullanici.spainspiredBathrooms.isSelected());
        extentTest.pass("spainspiredBathrooms box'u seçilebilir");
        kullanici.yogaStudio.click();
        Assert.assertTrue(kullanici.yogaStudio.isSelected());
        extentTest.pass("yogaStudio box'u seçilebilir");
        kullanici.securityAndValetServices.click();
        Assert.assertTrue(kullanici.securityAndValetServices.isSelected());
        extentTest.pass("securityAndValetServices box'u seçilebilir");
        kullanici.homeTheaterAndGameRoom56.click();
        Assert.assertTrue(kullanici.homeTheaterAndGameRoom56.isSelected());
        extentTest.pass("homeTheaterAndGameRoom56 box'u seçilebilir");



        // Kullanıcı 2 farklı yolla save edebilmeli
        kullanici.save.click();
        kullanici.saveExit.click();

    }

}