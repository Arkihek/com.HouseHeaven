package test.US10_US25_US41_US43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import java.awt.dnd.DragGestureEvent;
import java.util.List;

public class US41_TC02 extends TestBaseReport {
    @Test
    public void test02() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        extentTest = extentReports.createTest("Admin Control Test"," Admin should be able to check the elements");
        Driver.getDriver().get("https://qa.hauseheaven.com/admin/login");
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("admin21");
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("951847");
        Driver.getDriver().findElement(By.xpath("//span[@class='signin']")).click();

        WebElement accountsButton=Driver.getDriver().findElement(By.xpath("//*[@class='fa fa-users']"));

        softAssert.assertTrue(accountsButton.isDisplayed());
        accountsButton.click();

        WebElement dashboardTitle = Driver.getDriver().findElement(By.xpath("//span[@class='title'][1]"));
        softAssert.assertTrue(dashboardTitle.isDisplayed());
        softAssert.assertTrue(dashboardTitle.isEnabled());
        dashboardTitle.isEnabled();

        WebElement blogButton = Driver.getDriver().findElement(By.xpath("//*[@id='cms-plugins-blog']"));
        blogButton.click();
        softAssert.assertTrue(blogButton.isDisplayed());
        softAssert.assertTrue(blogButton.isEnabled());
        Thread.sleep(2000);

        WebElement postButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-blog-post']"));
        softAssert.assertTrue(postButton.isDisplayed());
        softAssert.assertTrue(postButton.isEnabled());

        WebElement categoriesButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-blog-categories']"));
        softAssert.assertTrue(categoriesButton.isDisplayed());
        softAssert.assertTrue(categoriesButton.isEnabled());

        WebElement tagButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-blog-tags']"));
        softAssert.assertTrue(tagButton.isDisplayed());
        softAssert.assertTrue(tagButton.isEnabled());

        WebElement realEstateButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-real-estate']"));
        realEstateButton.click();
        softAssert.assertTrue(realEstateButton.isDisplayed());
        softAssert.assertTrue(realEstateButton.isEnabled());


        WebElement propertiesButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-property']"));
        softAssert.assertTrue(propertiesButton.isDisplayed());
        softAssert.assertTrue(propertiesButton.isEnabled());

        WebElement futuresButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-re-feature']"));
        softAssert.assertTrue(futuresButton.isDisplayed());
        softAssert.assertTrue(futuresButton.isEnabled());

        WebElement facilitiesButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-facility']"));
        softAssert.assertTrue(facilitiesButton.isDisplayed());
        softAssert.assertTrue(facilitiesButton.isEnabled());

        WebElement typesButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-real-estate-type']"));
        softAssert.assertTrue(typesButton.isDisplayed());
        softAssert.assertTrue(typesButton.isEnabled());

        WebElement newslettersButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-newsletter']"));
        softAssert.assertTrue(newslettersButton.isDisplayed());
        softAssert.assertTrue(newslettersButton.isEnabled());

        WebElement consultsButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-consult']"));
        softAssert.assertTrue(consultsButton.isDisplayed());
        softAssert.assertTrue(consultsButton.isEnabled());

        WebElement accountssButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-real-estate-account']"));
        softAssert.assertTrue(accountssButton.isDisplayed());
        softAssert.assertTrue(accountssButton.isEnabled());

        WebElement packagesButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-package']"));
        softAssert.assertTrue(packagesButton.isDisplayed());
        softAssert.assertTrue(packagesButton.isEnabled());

        WebElement contactButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-contact']"));
        softAssert.assertTrue(contactButton.isDisplayed());
        softAssert.assertTrue(contactButton.isEnabled());

        WebElement paymentsButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-payments']"));
        paymentsButton.click();

        softAssert.assertTrue(paymentsButton.isDisplayed());
        softAssert.assertTrue(paymentsButton.isEnabled());

        WebElement transactionsButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-payments-all']"));
        softAssert.assertTrue(transactionsButton.isDisplayed());
        softAssert.assertTrue(transactionsButton.isEnabled());

        WebElement locationsButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-location']"));
        locationsButton.click();
        softAssert.assertTrue(locationsButton.isDisplayed());
        softAssert.assertTrue(locationsButton.isEnabled());



        WebElement countriesButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-country']"));
        softAssert.assertTrue(countriesButton.isDisplayed());
        softAssert.assertTrue(countriesButton.isEnabled());

        WebElement statesButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-state']"));
        softAssert.assertTrue(statesButton.isDisplayed());
        softAssert.assertTrue(statesButton.isEnabled());

        WebElement statesButtonu = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-city']"));
        softAssert.assertTrue(statesButtonu.isDisplayed());
        softAssert.assertTrue(statesButtonu.isEnabled());

        WebElement mediaButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-core-media']"));
        softAssert.assertTrue(statesButtonu.isDisplayed());
        softAssert.assertTrue(statesButtonu.isEnabled());

        WebElement registeredAcconuts = Driver.getDriver().findElement(By.xpath("//span[@class='dt-length-records']"));
        String registeredAccounts1 = registeredAcconuts.getText();

        /*
        List<WebElement>emlakcilarinBilgileri=Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("realtorinformation")));
        for (WebElement eachinformation: emlakcilarinBilgileri) {
            softAssert.assertTrue(eachinformation.isDisplayed(),"Realtor information not displayed");
            System.out.println(eachinformation.getText());
        }
         */

        String numeric = registeredAccounts1.substring(21,24);

        int justNumeric = Integer.parseInt(numeric);
        System.out.println(justNumeric);

        List<WebElement> ogeListesi = Driver.getDriver().findElements(By.xpath("//tbody/tr"));
        for (WebElement eachOgeler: ogeListesi
             ) {
            softAssert.assertTrue(eachOgeler.isDisplayed(),"Accounts can not be displayed");
        }


       // System.out.println(registeredAcconuts);






    }

}
