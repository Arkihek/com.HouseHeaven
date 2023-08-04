package test.US12_US14_US15.US_012;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.UserHomepage;
import utilities.*;

public class US12_TC03 extends TestBaseReport {


    @Test
    public void addPropertSayfasi(){

        AccountPage_Property kullanici = new AccountPage_Property();
        UserHomepage userHomepage =new UserHomepage();


        extentTest = extentReports.createTest("report add property page test",
                "The user should be able to select the relevant boxes, upload images, and select the boxes in the feature section.");

        //User goes to hauseheaven homepage
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        extentTest.info("User goes to hauseheaven homepage");


        //User fills in information for login to the system
        kullanici.signIn.click();
        kullanici.mailKutusu.sendKeys(ConfigReader.getProperty("userMail"));
        kullanici.password.sendKeys(ConfigReader.getProperty("userPass"));
        kullanici.login.click();
        extentTest.info("The user logs into the page with the correct username and password");



        //User gets credit to give property ad
        kullanici.addProperty.click();
        kullanici.buyCredits.click();
        kullanici.credits5puan.click();
        extentTest.info("User buys credit to add property ad");



        //user enters card information //
        ReusableMethods.waitFor(1);
        kullanici.cardNumber.sendKeys(ConfigReader.getProperty("cardNumber"));
        kullanici.cardName.sendKeys(ConfigReader.getProperty("cardName"));
        kullanici.cardYilGun.sendKeys(ConfigReader.getProperty("cardYilGun"));
        kullanici.cardCVC.sendKeys(ConfigReader.getProperty("cardCVC"));
        ReusableMethods.waitFor(1);
        kullanici.cookies.click();
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.cardNumber);
        ReusableMethods.waitFor(2);
        kullanici.checkout.click();
        extentTest.info("Enters card information and clicks checkout link");


        //After the user completes the card transaction, she goes to the add property page where she can add the
        // property and fills in the required fields.
        ReusableMethods.waitFor(2);
        kullanici.addProperty.click();
        extentTest.info("After the user completes the card transaction, she clicks on the add property link");
        kullanici.title.sendKeys("For Sale 6+2 Villa");
        kullanici.description.sendKeys("2 years new building for sale from owner");
        kullanici.content.sendKeys("by the sea \n 315 m2 \n has a large garage");

        ReusableMethods.waitFor(1);
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.images);
        ReusableMethods.waitFor(1);
        kullanici.city.click();
        kullanici.cityClicktenSonraYeniKutu.sendKeys(Keys.ENTER);
        kullanici.propertyLocation.sendKeys("Newark");
        kullanici.latitude.sendKeys("2.17403");
        kullanici.longitude.sendKeys("2.1740338");
        kullanici.numberBedrooms.sendKeys("2");
        kullanici.numberBathrooms.sendKeys("2");
        kullanici.numberFloors.sendKeys("2");
        kullanici.square.sendKeys("315");
        kullanici.price.sendKeys("150000");
        ReusableMethods.waitFor(1);
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.typeForSale);
        ReusableMethods.waitFor(1);
        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.title);
        ReusableMethods.waitFor(1);
        kullanici.category.click();
        ReusableMethods.waitFor(1);
        kullanici.categoryClicktenSonraYeniKutu.click();
        kullanici.categoryClicktenSonraYeniKutu.sendKeys("V" + Keys.ENTER);
        ReusableMethods.waitFor(1);
        extentTest.info("The user fills in all the necessary information for the ad.");


        // user should be able to add image
        extentTest.fail("user cannot add image");

        //Should be able to test that she can select the boxes in the user properties area

        JSUtilities.scrollToElement(Driver.getDriver(), kullanici.typeForSale);
        ReusableMethods.waitFor(2);
        kullanici.wifi.click();
        Assert.assertTrue(kullanici.wifi.isSelected());
        extentTest.pass("wifi box can be selected");
        kullanici.parking.click();
        Assert.assertTrue(kullanici.parking.isSelected());
        extentTest.pass("parking box can be selected");
        kullanici.swimmingPool.click();
        Assert.assertTrue(kullanici.swimmingPool.isSelected());
        extentTest.pass("swimmingPool box can be selected");
        kullanici.balcony.click();
        Assert.assertTrue(kullanici.balcony.isSelected());
        extentTest.pass("balcony box can be selected");
        kullanici.garden.click();
        Assert.assertTrue(kullanici.garden.isSelected());
        extentTest.pass("garden box can be selected");
        kullanici.security.click();
        Assert.assertTrue(kullanici.security.isSelected());
        extentTest.pass("security box can be selected");
        kullanici.fitnessCenter.click();
        Assert.assertTrue(kullanici.fitnessCenter.isSelected());
        extentTest.pass("fitnessCenter box can be selected");
        kullanici.airConditioning.click();
        Assert.assertTrue(kullanici.airConditioning.isSelected());
        extentTest.pass("airConditioning box can be selected");
        kullanici.centralHeating.click();
        Assert.assertTrue(kullanici.centralHeating.isSelected());
        extentTest.pass("centralHeating box can be selected");
        kullanici.laundryRoom.click();
        Assert.assertTrue(kullanici.laundryRoom.isSelected());
        extentTest.pass("laundryRoom box can be selected");
        kullanici.petsAllow.click();
        Assert.assertTrue(kullanici.petsAllow.isSelected());
        extentTest.pass("petsAllow box can be selected");
        kullanici.spaMassage.click();
        Assert.assertTrue(kullanici.spaMassage.isSelected());
        extentTest.pass("spaMassage box can be selected");
        kullanici.landscapedBackyard.click();
        Assert.assertTrue(kullanici.landscapedBackyard.isSelected());
        extentTest.pass("landscapedBackyard box can be selected");
        kullanici.coveredPatio.click();
        Assert.assertTrue(kullanici.coveredPatio.isSelected());
        extentTest.pass("coveredPatio box can be selected");
        kullanici.fireplace.click();
        Assert.assertTrue(kullanici.fireplace.isSelected());
        extentTest.pass("fireplace box can be selected");
        kullanici.landscapedYard.click();
        Assert.assertTrue(kullanici.landscapedYard.isSelected());
        extentTest.pass("landscapedYard box can be selected");
        kullanici.attachedGarage.click();
        Assert.assertTrue(kullanici.attachedGarage.isSelected());
        extentTest.pass("attachedGarage box can be selected");
        kullanici.rooftopDeck.click();
        Assert.assertTrue(kullanici.rooftopDeck.isSelected());
        extentTest.pass("rooftopDeck box can be selected");
        kullanici.privateBalcony.click();
        Assert.assertTrue(kullanici.privateBalcony.isSelected());
        extentTest.pass("privateBalcony box can be selected");
        kullanici.walkinCloset.click();
        Assert.assertTrue(kullanici.walkinCloset.isSelected());
        extentTest.pass("walkinCloset box can be selected");
        kullanici.backyard.click();
        Assert.assertTrue(kullanici.backyard.isSelected());
        extentTest.pass("backyard box can be selected");
        kullanici.lowMaintenanceLandscaping.click();
        Assert.assertTrue(kullanici.lowMaintenanceLandscaping.isSelected());
        extentTest.pass("lowMaintenanceLandscaping box can be selected");
        kullanici.soaringCeilings.click();
        Assert.assertTrue(kullanici.soaringCeilings.isSelected());
        extentTest.pass("soaringCeilings box can be selected");
        kullanici.wellMaintainedGarden.click();
        Assert.assertTrue(kullanici.wellMaintainedGarden.isSelected());
        extentTest.pass("wellMaintainedGarden box can be selected");
        kullanici.highCeilings.click();
        Assert.assertTrue(kullanici.highCeilings.isSelected());
        extentTest.pass("highCeilings box can be selected");
        kullanici.privateBackyard.click();
        Assert.assertTrue(kullanici.privateBackyard.isSelected());
        extentTest.pass("privateBackyard box can be selected");
        kullanici.privateElevator.click();
        Assert.assertTrue(kullanici.privateElevator.isSelected());
        extentTest.pass("privateElevator box can be selected");
        kullanici.highEndKitchenAppliances.click();
        Assert.assertTrue(kullanici.highEndKitchenAppliances.isSelected());
        extentTest.pass("highEndKitchenAppliances box can be selected");
        kullanici.rooftopTerraceWithJacuzzi.click();
        Assert.assertTrue(kullanici.rooftopTerraceWithJacuzzi.isSelected());
        extentTest.pass("rooftopTerraceWithJacuzzi box can be selected");
        kullanici.gatedCommunityWithSecurity.click();
        Assert.assertTrue(kullanici.gatedCommunityWithSecurity.isSelected());
        extentTest.pass("gatedCommunityWithSecurity box can be selected");
        kullanici.fitnessCenterAndSpa.click();
        Assert.assertTrue(kullanici.fitnessCenterAndSpa.isSelected());
        extentTest.pass("fitnessCenterAndSpa box can be selected");
        kullanici.smartHomeTechnology.click();
        Assert.assertTrue(kullanici.smartHomeTechnology.isSelected());
        extentTest.pass("smartHomeTechnology box can be selected");
        kullanici.smartHomeAutomation.click();
        Assert.assertTrue(kullanici.smartHomeAutomation.isSelected());
        extentTest.pass("smartHomeAutomation box can be selected");
        kullanici.wineCellar.click();
        Assert.assertTrue(kullanici.wineCellar.isSelected());
        extentTest.pass("wineCellar box can be selected");
        kullanici.infinityPool.click();
        Assert.assertTrue(kullanici.infinityPool.isSelected());
        extentTest.pass("infinityPool box can be selected");
        kullanici.rooftopDeckWithCityViews.click();
        Assert.assertTrue(kullanici.rooftopDeckWithCityViews.isSelected());
        extentTest.pass("rooftopDeckWithCityViews box can be selected");
        kullanici.securityAndConciergeServices.click();
        Assert.assertTrue(kullanici.securityAndConciergeServices.isSelected());
        extentTest.pass("securityAndConciergeServices box can be selected");
        kullanici.privateLanai.click();
        Assert.assertTrue(kullanici.privateLanai.isSelected());
        extentTest.pass("privateLanai box can be selected");
        kullanici.chefsKitchenWithHighEndAppliances.click();
        Assert.assertTrue(kullanici.chefsKitchenWithHighEndAppliances.isSelected());
        extentTest.pass("chefsKitchenWithHighEndAppliances box can be selected");
        kullanici.outdoorBarbecueArea.click();
        Assert.assertTrue(kullanici.outdoorBarbecueArea.isSelected());
        extentTest.pass("outdoorBarbecueArea box can be selected");
        kullanici.resortStylePoolAndClubhouse.click();
        Assert.assertTrue(kullanici.resortStylePoolAndClubhouse.isSelected());
        extentTest.pass("resortStylePoolAndClubhouse box can be selected");
        kullanici.gourmetKitchenWithQuartzCountertops.click();
        Assert.assertTrue(kullanici.gourmetKitchenWithQuartzCountertops.isSelected());
        extentTest.pass("gourmetKitchenWithQuartzCountertops box can be selected");
        kullanici.homeTheaterAndGameRoom.click();
        Assert.assertTrue(kullanici.homeTheaterAndGameRoom.isSelected());
        extentTest.pass("homeTheaterAndGameRoom box can be selected");
        kullanici.gatedCommunityWithSecurity45.click();
        Assert.assertTrue(kullanici.gatedCommunityWithSecurity45.isSelected());
        extentTest.pass("gatedCommunityWithSecurity45 box can be selected");
        kullanici.privateRooftopDeckWithInfinityPool.click();
        Assert.assertTrue(kullanici.privateRooftopDeckWithInfinityPool.isSelected());
        extentTest.pass("privateRooftopDeckWithInfinityPool box can be selected");
        kullanici.chefsKitchenWithPremiumAppliances.click();
        Assert.assertTrue(kullanici.chefsKitchenWithPremiumAppliances.isSelected());
        extentTest.pass("chefsKitchenWithPremiumAppliances box can be selected");
        kullanici.privateHotTubAndOutdoorFireplace.click();
        Assert.assertTrue(kullanici.privateHotTubAndOutdoorFireplace.isSelected());
        extentTest.pass("privateHotTubAndOutdoorFireplace box can be selected");
        kullanici.homeOffice.click();
        Assert.assertTrue(kullanici.homeOffice.isSelected());
        extentTest.pass("homeOffice box can be selected");
        kullanici.skiinSkiOutAccess.click();
        Assert.assertTrue(kullanici.skiinSkiOutAccess.isSelected());
        extentTest.pass("skiinSkiOutAccess box can be selected");
        kullanici.privateRooftopTerraceWithinfinityPool.click();
        Assert.assertTrue(kullanici.privateRooftopTerraceWithinfinityPool.isSelected());
        extentTest.pass("privateRooftopTerraceWithinfinityPool box can be selected");
        kullanici.stateoftheartKitchenWithPremiumAppliances.click();
        Assert.assertTrue(kullanici.stateoftheartKitchenWithPremiumAppliances.isSelected());
        extentTest.pass("stateoftheartKitchenWithPremiumAppliances box can be selected");
        kullanici.spainspiredBathrooms.click();
        Assert.assertTrue(kullanici.spainspiredBathrooms.isSelected());
        extentTest.pass("spainspiredBathrooms box can be selected");
        kullanici.yogaStudio.click();
        Assert.assertTrue(kullanici.yogaStudio.isSelected());
        extentTest.pass("yogaStudio box can be selected");
        kullanici.securityAndValetServices.click();
        Assert.assertTrue(kullanici.securityAndValetServices.isSelected());
        extentTest.pass("securityAndValetServices box can be selected");



        //The user saves after filling in the required fields.
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.wishlist);
        ReusableMethods.waitFor(1);
        kullanici.saveExit.click();
        kullanici.yuklenenMulkEdit.click();
        kullanici.title.sendKeys("current villa");
        kullanici.saveExit.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(kullanici.yuklenenMulkEditSaveKontol.isDisplayed());
        extentTest.pass("The user can fill out the advertisement form.");

        extentTest.info("browser is closed");

    }

}