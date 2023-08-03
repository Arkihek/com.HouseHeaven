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
import java.util.Arrays;
import java.util.List;

public class US51 extends TestBaseReport {
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
        Assert.assertEquals(actualUrl,expectedUrl);

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

        JSUtilities.clickWithJS(Driver.getDriver(),adminDashboard.mediaList);
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

        adminDashboard.mediaButton.click();
        ReusableMethods.waitFor(2);

    }


    @Test
    public void test22() {

        //Admin logs to the system with its user name and password.
        //The user logins to "https://qa.hauseheaven.com/admin/login" page.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        //Admin logs to the system with its user name and password.
        adminDashboard.textBoxAdminUserNameOnLogInPage.sendKeys(ConfigReader.getProperty("admin01"));
        adminDashboard.textBoxAdminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLogInButton.click();
        //It is successfully directed to Dashboard.
        Assert.assertTrue(adminDashboard.adminDasboardButton.isDisplayed());
        //It accesses the "Media" page via menu or l
        // Links on the page.
        adminDashboard.mediaButton.click();
        //It successfully accesses the "Media" page.
        Assert.assertTrue(adminDashboard.mediaButton.isEnabled());
        ReusableMethods.wait(1);
        // team5 directory select
        //actions.doubleClick(adminDashboard.team5File).perform();
        //Make the "File" path dynamic.
        String filesPath = System.getProperty("user.dir") + "src/test/java/test/US03_US17_US18_US46_US51/houseV.jpg";
        //Assert.assertTrue(Files.exists(Paths.get("files/hause.jpg")));
        Assert.assertTrue(Files.exists(Paths.get(filesPath)));

        WebElement uploadProcess = Driver.getDriver().findElement(By.xpath("//*[@type='file']"));
        //String js = "arguments[0].style.visibility = 'visible';";
        //jsExecutor.executeScript(js, uploadProcess);
        ReusableMethods.wait(1);
        // File Uploading
        uploadProcess.sendKeys(filesPath);
        ReusableMethods.wait(1);
        // "File uploaded" message locate
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.xpath("//span[text()='hause.jpg']"));
        // Verify the File uploaded
        Assert.assertTrue(fileUploadedMessage.isDisplayed());
        // page refresh
        Driver.getDriver().navigate().refresh();
        // Click Download for internet upload
        WebElement buttonDownload = Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-success js-download-action']"));
        buttonDownload.click();
        //file path on internet and Enter
        WebElement textareaDownload = Driver.getDriver().findElement(By.xpath("//*[@name='urls']"));
        textareaDownload.click();
        actions.sendKeys(textareaDownload, "https://qa.hauseheaven.com/storage/team1.png").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        // Verify the File uploaded
        Assert.assertTrue(adminDashboard.labelBlogPostDeleteConfirm.isDisplayed());
        ReusableMethods.wait(2);
        //Click the "Create New Folder" button.
        adminDashboard.createFolderButton.click();
        ReusableMethods.wait(1);
        //The folder entered the name and completes the creation process.
        WebElement folderNameInputTextbox = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Folder name']"));
        actions.sendKeys(folderNameInputTextbox, "Erasable").sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        //Verify new Folder succesfully
        Assert.assertTrue(adminDashboard.labelBlogPostDeleteConfirm.isDisplayed());
        // page refresh
        Driver.getDriver().navigate().refresh();
        // Select Filter menu
        adminDashboard.filterButton.click();
        //Selects one of the filtration options.(images)
        adminDashboard.filterImageButton.click();
        ReusableMethods.wait(1);
        // images List
        List<WebElement> imagesList = Driver.getDriver().findElements(By.xpath("(//li[@data-context='file']/div/div/img)"));
        List<WebElement> videosList = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-video']"));
        List<WebElement> dokumentsList = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-alt']"));
        System.out.println("==============================");
        System.out.println("== Image === Video === Dokument ==");
        System.out.print("    " + imagesList.size());
        System.out.print("         " + videosList.size());
        System.out.print("           " + dokumentsList.size() + "\n");
        Assert.assertTrue(imagesList.size() > 0);
        Assert.assertFalse(videosList.size() > 0);
        Assert.assertFalse(dokumentsList.size() > 0);
        // Select Filter menu
        adminDashboard.filterButton.click();
        //Selects one of the filtration options.(videos)
        adminDashboard.filterVideoButton.click();
        ReusableMethods.wait(1);
        List<WebElement> imagesList2 = Driver.getDriver().findElements(By.xpath("(//li[@data-context='file']/div/div/img)"));
        List<WebElement> videosList2 = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-video']"));
        List<WebElement> dokumentsList2 = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-alt']"));
        System.out.print("    " + imagesList2.size());
        System.out.print("         " + videosList2.size());
        System.out.print("           " + dokumentsList2.size() + "\n");
        Assert.assertFalse(imagesList2.size() > 0);
        Assert.assertTrue(videosList2.size() > 0);
        Assert.assertFalse(dokumentsList2.size() > 0);
        // Select Filter menu
        adminDashboard.filterButton.click();
        //Selects one of the filtration options.(docs)
        adminDashboard.filterDocumentButton.click();
        List<WebElement> imagesList3 = Driver.getDriver().findElements(By.xpath("(//li[@data-context='file']/div/div/img)"));
        List<WebElement> videosList3 = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-video']"));
        List<WebElement> dokumentsList3 = Driver.getDriver().findElements(By.xpath("//*[@class='far fa-file-alt']"));
        System.out.print("    " + imagesList3.size());
        System.out.print("         " + videosList3.size());
        System.out.print("           " + dokumentsList3.size() + "\n==============================");
        Assert.assertFalse(imagesList3.size() > 0);
        Assert.assertFalse(videosList3.size() > 0);
        Assert.assertTrue(dokumentsList3.size() > 0);
        //Files matching the selected filter are displayed successfully.
        Driver.getDriver().navigate().refresh();
        //He selects one of the options to change the displayed section.
        adminDashboard.wiewInButton.click();
        ReusableMethods.wait(1);
        adminDashboard.wiewInTrashButton.click();
        ReusableMethods.wait(1);
        //The displayed section is successfully modified and the corresponding files are displayed.
        Assert.assertTrue(adminDashboard.wiewInTrashButton.isDisplayed());
        Driver.closeDriver();
    }

}
