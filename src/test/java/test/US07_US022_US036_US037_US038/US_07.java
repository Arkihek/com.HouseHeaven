package test.US07_US022_US036_US037_US038;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HeaderProjects;
import utilities.*;

import java.util.List;

public class US_07 extends TestBaseReport {
    @Test
    public void TC01() {
        HeaderProjects headerProjects = new HeaderProjects();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("Must be able to access Project page as a visitor", "As a visitor, you should be able to click on the Projects link and access the advertisements and their details.");
        headerProjects.projectsCookies.click();
        headerProjects.projectsLink.click();
        headerProjects.numberOfProjects.isDisplayed();
        List<WebElement> allProjectList = Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("allProjects")));
        for (WebElement eachAllProjects : allProjectList) {
            softAssert.assertTrue(eachAllProjects.isDisplayed(), "Not all projects displayed");
        }
        ReusableMethods.wait(3);
        headerProjects.allProcets1.click();
        softAssert.assertTrue(headerProjects.ilanDetails.isEnabled(), "Ad details could not be found");
        extentTest.pass("Ad details reached");
        Driver.getDriver().navigate().back();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(headerProjects.countryDropdown).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(3);
        actions.click(headerProjects.stateDropdown).sendKeys(Keys.ENTER).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(3);
        actions.click(headerProjects.cityDropdown).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(3);
        actions.click(headerProjects.categoryDropdown).sendKeys(Keys.ENTER).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(3);
        headerProjects.searchButton.click();
        extentTest.info("As a visitor, the number of advertisements and the details of the advertisements can be accessed.");
        Driver.closeDriver();
    }


}
