package test.US03_US17_US18_US46_US51;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage_Property;
import pages.AdminDashboard;
import pages.RegisterationPage;
import pages.UserHomePage_Body;
import utilities.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class US51_TC001_TC10 extends TestBaseReport {
    SoftAssert softAssert = new SoftAssert();
    UserHomePage_Body userHomePageBody = new UserHomePage_Body();
    Actions actions = new Actions(Driver.getDriver());
    AccountPage_Property accountPageProperty = new AccountPage_Property();
    RegisterationPage registerationPage = new RegisterationPage();
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void test01() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "Media title should be active and visible on the admin dashboard");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(3);

        //02_As an administrator, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");

        //03_Confirms that the media section is active and visible in the dashbord menu
        softAssert.assertTrue(adminDashboard.mediaButton.isDisplayed());
        extentTest.info("media section is visible");
        softAssert.assertTrue(adminDashboard.mediaButton.isEnabled());
        extentTest.info("media section is enable");

        //04_Click on Media and confirm that the media page opens
        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);
        String expectedUrl = "https://qa.hauseheaven.com/admin/media";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

        //05_Browser is closed.
    }

    @Test
    public void test02() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "Your buttons should be active and visible on the Media page on the admin dashboard");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(3);

        //02_As an administrator, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");

        //03_The buttons on the media page are tested to be active and visible.
        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);

        softAssert.assertTrue(adminDashboard.uploadButton.isDisplayed());
        extentTest.info("upload button is visible");
        softAssert.assertTrue(adminDashboard.uploadButton.isEnabled());
        extentTest.info("upload button is enable");

        softAssert.assertTrue(adminDashboard.downloadButton.isDisplayed());
        extentTest.info("download button is visible");
        softAssert.assertTrue(adminDashboard.downloadButton.isEnabled());
        extentTest.info("download button is enable");

        softAssert.assertTrue(adminDashboard.createFolderButton.isDisplayed());
        extentTest.info("create Folder button is visible");
        softAssert.assertTrue(adminDashboard.createFolderButton.isEnabled());
        extentTest.info("create Folder button is enable");

        softAssert.assertTrue(adminDashboard.refreshButton.isDisplayed());
        extentTest.info("refresh button is visible");
        softAssert.assertTrue(adminDashboard.refreshButton.isEnabled());
        extentTest.info("refresh button is enable");


        softAssert.assertTrue(adminDashboard.filterButton.isDisplayed());
        extentTest.info("filter button is visible");
        softAssert.assertTrue(adminDashboard.filterButton.isEnabled());
        extentTest.info("filter button is enable");
        adminDashboard.filterButton.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);


        softAssert.assertTrue(adminDashboard.wiewInButton.isDisplayed());
        extentTest.info("wiewIn button is visible");
        softAssert.assertTrue(adminDashboard.wiewInButton.isEnabled());
        extentTest.info("wiewIn button is enable");
        adminDashboard.wiewInButton.click();
        ReusableMethods.waitFor(2);


        softAssert.assertTrue(adminDashboard.shortButton.isDisplayed());
        extentTest.info("short button is visible");
        softAssert.assertTrue(adminDashboard.shortButton.isEnabled());
        extentTest.info("short button is enable");
        adminDashboard.shortButton.click();
        ReusableMethods.waitFor(2);

        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.mediaList);
        softAssert.assertTrue(adminDashboard.actionsButton.isDisplayed());
        extentTest.info("actions button is visible");
        softAssert.assertTrue(adminDashboard.actionsButton.isEnabled());
        extentTest.info("actions button is enable");
        adminDashboard.actionsButton.click();
        ReusableMethods.waitFor(2);

        softAssert.assertTrue(adminDashboard.wiewSelect1Button.isDisplayed());
        extentTest.info("wiew button is visible");
        softAssert.assertTrue(adminDashboard.wiewSelect1Button.isEnabled());
        extentTest.info("wiew button is enable");
        adminDashboard.wiewSelect1Button.click();
        ReusableMethods.waitFor(2);
        adminDashboard.wiewSelect2Button.click();
        ReusableMethods.waitFor(2);
        extentTest.pass("Elements under the Media heading are active and visible in the admin control panel");
        //04_browser is closed.

        softAssert.assertAll();
    }

    @Test
    public void test03() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "Image should be uploaded from the media page with the upload button");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(3);

        //02_As an administrator, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");

        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);

        //03_Media must confirm that the upload button on the page can be used to upload images
        String filesPath = System.getProperty("user.dir") + "/src/test/java/test/US03_US17_US18_US46_US51/houseV.jpg";
        System.out.println(filesPath);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(Files.exists(Paths.get(filesPath)));

        WebElement uploadProcess = Driver.getDriver().findElement(By.xpath("//*[@type='file']"));
        ReusableMethods.wait(1);
        uploadProcess.sendKeys(filesPath);
        ReusableMethods.wait(1);
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.xpath("//span[text()='houseV.jpg']"));
        Assert.assertTrue(fileUploadedMessage.isDisplayed());

        //04_browser is closed.
    }

    @Test
    public void test04() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "Image should be uploaded from the media page with the upload button");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(3);

        //02_As an administrator, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");

        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);

        adminDashboard.downloadButton.click();
        //file path on internet and Enter
        WebElement textSpaceDownload = Driver.getDriver().findElement(By.xpath("//*[@name='urls']"));
        textSpaceDownload.click();
        actions.sendKeys(textSpaceDownload, "https://qa.hauseheaven.com/storage/team1.png").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        // Verify the File uploaded
        Assert.assertTrue(adminDashboard.labelBlogPostDeleteConfirm.isDisplayed());

    }

    @Test
    public void test05() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "Image should be uploaded from the media page with the create folder button");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(3);

        //02_As an administrator, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");

        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);

        //03_Confirm that a new folder can be created with the create folder button on the Media page
        ReusableMethods.wait(2);
        adminDashboard.createFolderButton.click();
        ReusableMethods.wait(1);
        WebElement folderNameInputTextbox = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Folder name']"));
        actions.sendKeys(folderNameInputTextbox, "Team5").sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);

        Assert.assertTrue(adminDashboard.labelBlogPostDeleteConfirm.isDisplayed());
        extentTest.pass("Creating a folder from the media page");

        //04_browser is closed.

    }

    @Test
    public void test06() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "The filter button on the media page should be changed to image");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(3);

        //02_As an administrator, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");

        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);
        //03_Click image from the filter button on the media page
        adminDashboard.filterButton.click();
        adminDashboard.filterImageButton.click();
        ReusableMethods.wait(1);

        //04_Confirms that the filter button returns to the image
        softAssert.assertTrue(adminDashboard.filterImageButton.isDisplayed());

        List<WebElement> imagesList = Driver.getDriver().findElements(By.xpath("(//li[@data-context='file']/div/div/img)"));
        List<WebElement> videosList = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-video']"));
        List<WebElement> dokumentsList = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-alt']"));

        softAssert.assertTrue(imagesList.size() > 0);
        softAssert.assertFalse(videosList.size() > 0);
        softAssert.assertFalse(dokumentsList.size() > 0);

        //05_Browser is closed.

    }

    @Test
    public void test07() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "The filter button on the media page should be changed to video");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(3);

        //02_As an administrator, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");

        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);

        //03_Click the video from the filter button on the media page
        adminDashboard.filterButton.click();
        adminDashboard.filterVideoButton.click();
        ReusableMethods.wait(1);

        //04_Confirms that the filter button turns to video
        softAssert.assertTrue(adminDashboard.filterVideoButton.isDisplayed());
        List<WebElement> imagesList = Driver.getDriver().findElements(By.xpath("(//li[@data-context='file']/div/div/img)"));
        List<WebElement> videosList = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-video']"));
        List<WebElement> dokumentsList = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-alt']"));

        Assert.assertFalse(imagesList.size() > 0);
        Assert.assertTrue(videosList.size() > 0);
        Assert.assertFalse(dokumentsList.size() > 0);

        //05_Browser is closed.

    }

    @Test
    public void test08() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "The filter button on the media page should be changed to document");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(3);

        //02_As an administrator, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");

        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);

        //03_Click on the video from the document button on the media page
        adminDashboard.filterButton.click();
        adminDashboard.filterDocumentButton.click();
        ReusableMethods.wait(1);

        //04_Filter confirms that the button turns to document
        softAssert.assertTrue(adminDashboard.filterDocumentButton.isDisplayed());
        List<WebElement> imagesList = Driver.getDriver().findElements(By.xpath("(//li[@data-context='file']/div/div/img)"));
        List<WebElement> videosList = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-video']"));
        List<WebElement> dokumentsList = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-alt']"));

        Assert.assertFalse(imagesList.size() > 0);
        Assert.assertTrue(videosList.size() > 0);
        Assert.assertFalse(dokumentsList.size() > 0);

        //05_Browser is closed.

    }

    @Test
    public void test09() {

        //01_Browser is open and the visitor goes to the homepage https://qa.hauseheaven.com.
        extentTest = extentReports.createTest("Hauseheaven test", "From the media page, the view in button should be switched to all media - thrash - recent - favourites");
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.waitFor(3);

        //02_As an administrator, log in with the correct username and password from the signin button
        adminDashboard.adminEMail.sendKeys("admin21" + Keys.TAB);
        adminDashboard.adminPassword.sendKeys("951847" + Keys.TAB);
        adminDashboard.adminRemember.click();
        adminDashboard.adminSignIn.click();
        adminDashboard.adminGirisKontrol.isDisplayed();
        extentTest.info("Admin login successful");

        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);

        //03_Confirm that the Wiew in button on the media page is all media
        softAssert.assertTrue(adminDashboard.wiewInButton.isDisplayed());

        //04_On the Media page, click thrash from the View in button and verify
        adminDashboard.wiewInButton.click();
        ReusableMethods.wait(1);
        adminDashboard.wiewInTrashButton.click();
        ReusableMethods.wait(1);
        softAssert.assertTrue(adminDashboard.wiewInTrashButton.isDisplayed());

        //05_Media page, click recent from the View in button and confirm
        adminDashboard.wiewInButton.click();
        ReusableMethods.wait(1);
        adminDashboard.wiewInRecentButton.click();
        ReusableMethods.wait(1);
        softAssert.assertTrue(adminDashboard.wiewInRecentButton.isDisplayed());

        //06_Click favourites from the View in button on the Media page and confirm
        adminDashboard.wiewInButton.click();
        ReusableMethods.wait(1);
        adminDashboard.wiewInFavoriteButton.click();
        ReusableMethods.wait(1);
        softAssert.assertTrue(adminDashboard.wiewInFavoriteButton.isDisplayed());

        //07_Browser is closed.

    }

}
