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

public class US_07 {
    @Test
    public void TC01() {
       HeaderProjects headerProjects=new HeaderProjects();
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
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
        Driver.closeDriver();
    }


}
