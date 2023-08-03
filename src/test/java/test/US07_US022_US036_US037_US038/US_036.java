package test.US07_US022_US036_US037_US038;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.RealEstateFacilities;
import utilities.*;

import java.util.List;

public class US_036 extends TestBaseRapor {

    @Test
    public void TC01() {
        RealEstateFacilities realEstateFacilities = new RealEstateFacilities();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("By logging in as admin, the Facilities page is accessed","It is tested that the items on the Facilities page are visible and active, adding/editing and deleting new facilities.");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateFacilities.realEstateButonu.click();
        realEstateFacilities.facilitiesButton.click();
        softAssert.assertTrue(realEstateFacilities.facilitiesButton.isEnabled(), "Failed to access Facilities page under Real Estate");
        softAssert.assertTrue(realEstateFacilities.numberOfFacilities.isDisplayed(), "Facilities number could not be displayed and verified");
        WebElement tumBodyElementi = Driver.getDriver().findElement(By.xpath("//tbody"));
        System.out.println(tumBodyElementi.getText());
        softAssert.assertTrue(tumBodyElementi.isDisplayed(), "Could not display all facilities table");
        extentTest.pass("Verifies that Facilities can be displayed and the number of Facilities can be displayed.");

    }

    @Test
    public void TC02() {
        RealEstateFacilities realEstateFacilities = new RealEstateFacilities();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateFacilities.realEstateButonu.click();
        realEstateFacilities.facilitiesButton.click();
        softAssert.assertTrue(realEstateFacilities.dropdownButtonBulkActions.isDisplayed(), "Bulk action item is not visible");
        softAssert.assertTrue(realEstateFacilities.searchButtonFacilities.isDisplayed(), "Search item is not visible");
        softAssert.assertTrue(realEstateFacilities.createButtonFacilities.isDisplayed(), "Create item is not visible");
        softAssert.assertTrue(realEstateFacilities.reloadButtonFacilities.isDisplayed(), "Reload item is not visible");
        softAssert.assertTrue(realEstateFacilities.editButtonFacilities.isDisplayed(), "Edit item is not visible");
        softAssert.assertTrue(realEstateFacilities.deleteButtonFacilities.isDisplayed(), "Delete item is not visible");
        softAssert.assertTrue(realEstateFacilities.filtersButtonFacilities.isDisplayed(), "Filters item is not visible");
        realEstateFacilities.filtersButtonFacilities.click();
        softAssert.assertTrue(realEstateFacilities.selectFieldButtonFacilities.isDisplayed(), "Select Field item is not visible");
        softAssert.assertTrue(realEstateFacilities.isEqualToButtonFacilities.isDisplayed(), "Is equal to item is not visible");
        softAssert.assertTrue(realEstateFacilities.valueButtonFacilities.isDisplayed(), "Value item is not visible");
        softAssert.assertTrue(realEstateFacilities.addAdditionalFilterButton.isDisplayed(), "Add additional filter item is not visible");
        softAssert.assertTrue(realEstateFacilities.applyButtonFacilities.isDisplayed(), "Apply item is not visible");
        realEstateFacilities.applyButtonFacilities.click();
        softAssert.assertTrue(realEstateFacilities.resetButtonFacilities.isDisplayed(), "Reset item is not visible");
        softAssert.assertTrue(realEstateFacilities.resetIconFacilities.isDisplayed(), "Reset icon item is not visible");
        extentTest.pass("Verify that all elements on the page are visible and active");

    }

    @Test
    public void TC03() {
        RealEstateFacilities realEstateFacilities = new RealEstateFacilities();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateFacilities.realEstateButonu.click();
        realEstateFacilities.facilitiesButton.click();
        realEstateFacilities.createButtonFacilities.click();
        realEstateFacilities.createNameButtonFacilities.sendKeys("Home");
        softAssert.assertTrue(realEstateFacilities.createNameButtonFacilities.isEnabled());
        Actions actions = new Actions(Driver.getDriver());
        actions.click(realEstateFacilities.iconDropdownButtonFacilities)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        softAssert.assertTrue(realEstateFacilities.iconDropdownButtonFacilities.isEnabled());
        Actions actions1 = new Actions(Driver.getDriver());
        actions1.click(realEstateFacilities.statusDropdownButtonFacilities)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(3);
        realEstateFacilities.saveButtonFacilities.click();
        ReusableMethods.wait(3);
        realEstateFacilities.saveExitButtonFacilities.click();
        softAssert.assertTrue(realEstateFacilities.success.isDisplayed(), "No registration with new categories information");
        extentTest.pass("Verify that new facilities are entered and saved");

    }

    @Test
    public void TC04() {
        RealEstateFacilities realEstateFacilities = new RealEstateFacilities();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateFacilities.realEstateButonu.click();
        realEstateFacilities.facilitiesButton.click();
        ReusableMethods.wait(3);
        realEstateFacilities.editButtonFacilities.click();
        Actions actions1 = new Actions(Driver.getDriver());
        actions1.click(realEstateFacilities.statusDropdownButtonFacilities)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(3);
        realEstateFacilities.saveButtonFacilities.click();
        ReusableMethods.wait(3);
        realEstateFacilities.saveExitButtonFacilities.click();
        softAssert.assertTrue(realEstateFacilities.success.isDisplayed(),"Could not edit new facilties information");
        realEstateFacilities.deleteButtonFacilities.click();
        softAssert.assertTrue(realEstateFacilities.confirmDelete.isDisplayed(),"Could not delete newly added Facilities");
        realEstateFacilities.confirmDelete.click();
        extentTest.pass("It has been confirmed that editing and deletion has been done on the recorded Facilities.");

    }
}


