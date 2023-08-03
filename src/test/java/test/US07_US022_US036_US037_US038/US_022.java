package test.US07_US022_US036_US037_US038;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HeaderProjects;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class US_022 extends TestBaseReport {

    @Test
    public void TC01() {
        HeaderProjects headerProjects = new HeaderProjects();
        UserHomepage userHomepage = new UserHomepage();
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("Must be able to access Project page as a registered user", "As a registered user, you should be able to click on the Projects link and access the advertisements and their details.");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        userHomepage.signupButonu.click();
        userHomepage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        userHomepage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        userHomepage.loginGiris.click();
        headerProjects.projectsLink.click();
        softAssert.assertTrue(headerProjects.projectsLink.isDisplayed(), "Failed to click on Projects link in header of page");
        softAssert.assertTrue(headerProjects.numberOfProjects.isDisplayed(), "Failed to display all project counts on Projects page");
        headerProjects.palmParadiseResidences.click();
        softAssert.assertTrue(headerProjects.ilanDetails.isDisplayed(), "The details of the property announcement could not be reached.");
        ReusableMethods.wait(3);
        extentTest.info("As a registered user, the number of advertisements and the details of the advertisements can be accessed.");
        Driver.getDriver().navigate().back();
    }

    @Test
    public void TC02() {
        HeaderProjects headerProjects = new HeaderProjects();
        UserHomepage userHomepage = new UserHomepage();
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("Must be able to access Project page as a registered user", "As a registered user, you should be able to click on the Projects link and access the advertisements and their details.");
        userHomepage.signupButonu.click();
        userHomepage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        userHomepage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        userHomepage.loginGiris.click();
        headerProjects.projectsLink.click();
        ReusableMethods.wait(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(headerProjects.countryDropdown).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        actions.click(headerProjects.stateDropdown).sendKeys(Keys.ENTER).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        actions.click(headerProjects.cityDropdown).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        actions.click(headerProjects.categoryDropdown).sendKeys(Keys.ENTER).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        headerProjects.searchButton.click();
        extentTest.pass("Must be able to search and see search results as a registered user");
        Driver.closeDriver();
    }

}
