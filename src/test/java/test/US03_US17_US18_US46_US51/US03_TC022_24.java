package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage_Body;
import utilities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US03_TC022_24 extends TestBaseReport {

    @Test
    public void test22() {
        SoftAssert softAssert = new SoftAssert();
        UserHomePage_Body userHomePageBody = new UserHomePage_Body();
        Actions actions = new Actions(Driver.getDriver());

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Find Accessible Homes To Rent of the search sectionvisible and active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_ Find Accessible Homes To Rent is confirmed to be visible.
        softAssert.assertTrue(userHomePageBody.findAccesibleHomesToRent.isDisplayed(), "Find Accessible Homes To Rent is not visible");
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
        softAssert.assertAll();

        //05_Browser is closed.

    }

    @Test
    public void test23() {
        SoftAssert softAssert = new SoftAssert();
        UserHomePage_Body userHomePageBody = new UserHomePage_Body();
        Actions actions = new Actions(Driver.getDriver());

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Find Accessible Homes To Rent of the search section visible and active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);

        //02_no min 1000, no max 2000 sequil and press the Search button
        actions.click(userHomePageBody.minPriceBox).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
        ReusableMethods.waitFor(3);
        actions.click(userHomePageBody.maxPriceBox).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).click(userHomePageBody.searchResultBox).perform();
        ReusableMethods.waitFor(3);

        //03_Confirms that the prices of the results are between 1000 and 2000 dollars
        // WebElement[] priceElementArray = {userHomePageBody.priceElement1, userHomePageBody.priceElement2, userHomePageBody.priceElement3};
        List<WebElement> priceList = Driver.getDriver().findElements(By.xpath("//*[@class='listing-card-info-price']"));

        int no = 1;
        for (WebElement eachPrice : priceList) {
            System.out.println(eachPrice.getText());
            int intPrice = Integer.parseInt(eachPrice.getText().replaceAll("[^\\d]", ""));
            if (intPrice >= 1000 && intPrice <= 2000) {
                extentTest.pass(no + ". product between 1000 and 2000 dollars");
                no++;
            } else {
                extentTest.fail(no + ". the product is not between 1000 and 2000 dollars");
                no++;
            }
        }
        extentTest.pass("On the home page Find Accessible Homes To Rent of the search section visible and active");
        softAssert.assertAll();
        //04_browser is closed.
    }

    @Test
    public void test24() {
        SoftAssert softAssert = new SoftAssert();
        UserHomePage_Body userHomePageBody = new UserHomePage_Body();
        Actions actions = new Actions(Driver.getDriver());

        //02_Search kismindaki butun form doldurulmali
        //03_Cikan sonuclarin dogru sonucu getirdigi dogrulanmali.
        //04_Browser kapatilir.

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "On the home page Find Accessible Homes To Rent of the search section visible and active");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);


        //02_Fill out the entire form in the search section - search for a location samsun -Min price 500 - Max price 50000 - Property Type apartment - BedRooms 3
        actions.click(userHomePageBody.searchForLocationBox).sendKeys("Samsun").click(userHomePageBody.minPriceBox).sendKeys(Keys.ENTER)
                .click(userHomePageBody.maxPriceBox).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER).click(userHomePageBody.propertyTypeBox).sendKeys(Keys.ENTER).click(userHomePageBody.bedRoomsBox).sendKeys(Keys.ENTER).click(userHomePageBody.searchResultBox).perform();
        ReusableMethods.waitFor(3);

        //03_Confirm that the results are correct.
        Assert.assertTrue(userHomePageBody.findByElementResultProperties.isDisplayed());
        String resultNo = "1";
        Assert.assertTrue(userHomePageBody.findByElementResultProperties.getText().contains(resultNo));
        int priceElement = Integer.parseInt(userHomePageBody.priceElement1.getText().replaceAll("[^\\d]", ""));
        if (priceElement >= 500 && priceElement <= 50000) {
            extentTest.pass("product between 500 and 50000 dollars");
        } else {
            extentTest.fail("the product is not between 500 and 50000 dollars");
        }
        String expectedLocation = "Samsun";
        softAssert.assertTrue(userHomePageBody.locationElement.getText().contains(expectedLocation), "the result is not samsun. Result : " + userHomePageBody.locationElement.getText());
        extentTest.fail("the result is not samsun. Result : " + userHomePageBody.locationElement.getText());
        softAssert.assertAll();

        //04_Browser is closed.


    }

}

