package test.US07_US022_US036_US037_US038;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.RealEstateTypes;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.time.Duration;

public class US_038 extends TestBaseReport {
    @Test
    public void TC01() {
        RealEstateTypes realEstateTypes = new RealEstateTypes();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("By logging in as admin, the Types page is accessed", "It is tested that the items on the Types page are visible and active, adding/editing and deleting new types.");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateTypes.realEstateButonu.click();
        realEstateTypes.TypesButton.click();
        softAssert.assertTrue(realEstateTypes.TypesButton.isEnabled(), "Types Link item is not visible");
        softAssert.assertTrue(realEstateTypes.numberOfTypes.isDisplayed(), "The number of types could not be displayed");
        WebElement allTypesTable = Driver.getDriver().findElement(By.xpath("//tbody"));
        System.out.println(allTypesTable.getText());
        softAssert.assertTrue(allTypesTable.isDisplayed(), "Could not display all types table");
        extentTest.pass("Verifies that Types can be displayed and the number of Types can be displayed.");
        Driver.closeDriver();

    }

    @Test
    public void TC02() {
        RealEstateTypes realEstateTypes = new RealEstateTypes();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("By logging in as admin, the Types page is accessed", "It is tested that the items on the Types page are visible and active, adding/editing and deleting new types.");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateTypes.realEstateButonu.click();
        realEstateTypes.TypesButton.click();
        softAssert.assertTrue(realEstateTypes.dropdownButtonBulkActions.isDisplayed(), "Bulk action item is not visible");
        softAssert.assertTrue(realEstateTypes.searchButtonTypes.isDisplayed(), "Search item is not visible");
        softAssert.assertTrue(realEstateTypes.createButtonTypes.isDisplayed(), "Create item is not visible");
        softAssert.assertTrue(realEstateTypes.reloadButtonTypes.isDisplayed(), "Reload item is not visible");
        softAssert.assertTrue(realEstateTypes.editButtonTypes.isDisplayed(), "Edit item is not visible");
        softAssert.assertTrue(realEstateTypes.deleteButtonTypes.isDisplayed(), "Delete item is not visible");
        softAssert.assertTrue(realEstateTypes.filtersButtonTypes.isDisplayed(), "Filters item is not visible");
        realEstateTypes.filtersButtonTypes.click();
        softAssert.assertTrue(realEstateTypes.selectFieldButtonTypes.isDisplayed(), "Select Field item is not visible");
        softAssert.assertTrue(realEstateTypes.isEqualToButtonTypes.isDisplayed(), "Is equal to item is not visible");
        softAssert.assertTrue(realEstateTypes.valueButtonTypes.isDisplayed(), "Value item is not visible");
        softAssert.assertTrue(realEstateTypes.addAdditionalFilterButton.isDisplayed(), "Add additional filter item is not visible");
        softAssert.assertTrue(realEstateTypes.applyTypes.isDisplayed(), "Apply item is not visible");
        realEstateTypes.applyTypes.click();
        softAssert.assertTrue(realEstateTypes.resetButtonTypes.isDisplayed(), "Reset item is not visible");
        softAssert.assertTrue(realEstateTypes.TypesButton.isDisplayed(), "Reset icon item is not visible");
        extentTest.pass("Verify that all elements on the page are visible and active");
        Driver.closeDriver();
    }

    @Test
    public void TC03() {
        RealEstateTypes realEstateTypes = new RealEstateTypes();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("By logging in as admin, the Types page is accessed", "It is tested that the items on the Types page are visible and active, adding/editing and deleting new types.");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateTypes.realEstateButonu.click();
        realEstateTypes.TypesButton.click();
        realEstateTypes.createButtonTypes.click();
        actions.click(realEstateTypes.createNameButtonTypes)
                .sendKeys("For Rent").sendKeys(Keys.TAB).sendKeys("rent").sendKeys(Keys.TAB).sendKeys("rent").sendKeys(Keys.TAB).sendKeys("1").perform();
        realEstateTypes.saveButtonTypes.click();
        ReusableMethods.wait(5);
        realEstateTypes.saveExitButtonTypes.click();
        softAssert.assertTrue(realEstateTypes.success.isDisplayed(), "No registration with new types information");
        extentTest.pass("Verify that new types are entered and saved");
        Driver.closeDriver();
    }

    @Test
    public void TC04() {
        RealEstateTypes realEstateTypes = new RealEstateTypes();
        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("By logging in as admin, the Types page is accessed", "It is tested that the items on the Types page are visible and active, adding/editing and deleting new types.");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("adminUser4"));
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("adminPass"));
        adminDashboard.AdminSigninButon.click();
        extentTest.info("Admin dashboard must be logged in.");
        realEstateTypes.realEstateButonu.click();
        realEstateTypes.TypesButton.click();
        realEstateTypes.editButtonTypes.click();
        actions.click(realEstateTypes.createNameButtonTypes)
                .sendKeys("For Sale").sendKeys(Keys.TAB).sendKeys("sale").sendKeys(Keys.TAB).sendKeys("sale").sendKeys(Keys.TAB).sendKeys("0").perform();
        realEstateTypes.saveButtonTypes.click();
        ReusableMethods.wait(3);
        realEstateTypes.saveExitButtonTypes.click();
        softAssert.assertTrue(realEstateTypes.success.isDisplayed(), "Could not edit new types information");
        realEstateTypes.deleteButtonTypes.click();
        ReusableMethods.wait(3);
        softAssert.assertTrue(realEstateTypes.confirmDelete.isDisplayed(), "Could not delete newly added Type");
        realEstateTypes.confirmDelete.click();
        extentTest.pass("It has been confirmed that editing and deletion has been done on the recorded Types.");
        Driver.closeDriver();
    }

}
