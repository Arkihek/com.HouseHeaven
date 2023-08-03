package test.US07_US022_US036_US037_US038;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.RealEstateCategories;
import pages.RealEstateFacilities;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_037 extends TestBaseRapor {

    @Test
    public void TC01() {
        RealEstateFacilities realEstateFacilities = new RealEstateFacilities();
        RealEstateCategories realEstateCategories = new RealEstateCategories();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("By logging in as admin, the Categories page is accessed","It is tested that the items on the Categories page are visible and active, adding/editing and deleting new categories.");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateCategories.realEstateButonu.click();
        realEstateCategories.realEstateCategoriesLink.click();
        softAssert.assertTrue(realEstateCategories.realEstateCategoriesLink.isEnabled(), "Categories Link item is not visible");
        softAssert.assertTrue(realEstateCategories.numberOfCategories.isDisplayed(), "The number of categories could not be displayed");
        WebElement AllCatoriesTable = Driver.getDriver().findElement(By.xpath("//tbody"));
        System.out.println(AllCatoriesTable.getText());
        softAssert.assertTrue(AllCatoriesTable.isDisplayed(), "Could not display all categories table");
        extentTest.pass("Verifies that Categories can be displayed and the number of Categories can be displayed.");
    }

    @Test
    public void TC02() {
        RealEstateFacilities realEstateFacilities = new RealEstateFacilities();
        RealEstateCategories realEstateCategories = new RealEstateCategories();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateCategories.realEstateButonu.click();
        realEstateCategories.realEstateCategoriesLink.click();
        softAssert.assertTrue(realEstateCategories.dropdownButtonBulkActionsCategories.isDisplayed(), "Bulk action item is not visible");
        softAssert.assertTrue(realEstateCategories.searchButtonCategories.isDisplayed(), "Search item is not visible");
        softAssert.assertTrue(realEstateCategories.createButtonCategories.isDisplayed(), "Create item is not visible");
        softAssert.assertTrue(realEstateCategories.reloadButtonCategories.isDisplayed(), "Reload item is not visible");
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
        realEstateCategories.resetButtonCategories.click();
        softAssert.assertTrue(realEstateFacilities.resetIconFacilities.isDisplayed(), "Reset icon item is not visible");
        extentTest.pass("Verify that all elements on the page are visible and active");
    }

    @Test
    public void TC03() {
        RealEstateFacilities realEstateFacilities = new RealEstateFacilities();
        RealEstateCategories realEstateCategories = new RealEstateCategories();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateCategories.realEstateButonu.click();
        realEstateCategories.realEstateCategoriesLink.click();
        realEstateCategories.createButtonCategories.click();
        realEstateCategories.createNameButtonCategories.sendKeys("Villa");
        realEstateCategories.descriptionCategories.sendKeys("Where luxury and comfort meet.");
        realEstateCategories.orderCategories.sendKeys("1");
        actions.click(realEstateCategories.statusDropdownButtonCategories)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        realEstateCategories.saveButtonCategories.click();
        realEstateCategories.saveExitButtonCategories.click();
        softAssert.assertTrue(realEstateCategories.success.isDisplayed(), "No registration with new categories information");
        extentTest.pass("Verify that new categories are entered and saved");

    }

    @Test
    public void TC04() {
        RealEstateFacilities realEstateFacilities = new RealEstateFacilities();
        RealEstateCategories realEstateCategories = new RealEstateCategories();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateCategories.realEstateButonu.click();
        realEstateCategories.realEstateCategoriesLink.click();
        ReusableMethods.wait(2);
        realEstateCategories.editButtonCategories.click();
        realEstateCategories.createNameButtonCategories.sendKeys("Luxury");
        ReusableMethods.wait(2);
        realEstateCategories.descriptionCategories.sendKeys("A place for everyone.");
        ReusableMethods.wait(2);
        realEstateCategories.orderCategories.sendKeys("0");
        actions.click(realEstateCategories.statusDropdownButtonCategories).sendKeys(Keys.ENTER).perform();
        realEstateCategories.saveButtonCategories.click();
        realEstateCategories.saveExitButtonCategories.click();
        softAssert.assertTrue(realEstateCategories.success.isDisplayed(), "Could not edit new category information");
        realEstateCategories.deleteButtonCategories.click();
        softAssert.assertTrue(realEstateCategories.confirmDelete.isDisplayed(), "Could not delete newly added categories");
        realEstateCategories.confirmDelete.click();
        extentTest.pass("It has been confirmed that editing and deletion has been done on the recorded Categories.");

    }
}
