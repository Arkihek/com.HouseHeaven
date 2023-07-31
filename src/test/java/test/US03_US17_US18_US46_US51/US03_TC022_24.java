package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Body;
import utilities.*;

public class US03_TC022_24 extends TestBaseReport {

    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();
    Actions actions = new Actions(Driver.getDriver());




    @Test
    public void test22(){
        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test","On the home page Find Accessible Homes To Rent of the search sectionvisible and active" );
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_ Find Accessible Homes To Rent is confirmed to be visible.
        softAssert.assertTrue(userHomePageBody.findAccesibleHomesToRent.isDisplayed(),"Find Accessible Homes To Rent is not visible");
        extentTest.pass("Find Accessible Homes To Rent is visible");

        //03_Search for location type yozgat and press the search button
        actions.click(userHomePageBody.searchForLocationBox).sendKeys("Yozgat").click(userHomePageBody.searchResultBox).perform();
        ReusableMethods.waitFor(3);

        //04_Confirm that there are no results.
        String expectedResult = "0 Results";
        String actuelResult = userHomePageBody.findByElementResultProperties.getText();
        System.out.println(actuelResult);
        softAssert.assertTrue(actuelResult.contains(expectedResult));
        extentTest.fail("More than 0 results = " + actuelResult);

        //05_Browser is closed.

    }
}
