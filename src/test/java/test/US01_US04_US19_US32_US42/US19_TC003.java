package test.US01_US04_US19_US32_US42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomepage;
import utilities.*;

import java.util.Set;

public class US19_TC003 extends TestBaseReport {


    @Test
    public void test01(){
        SoftAssert softAssert=new SoftAssert();
        UserHomepage userHomepage=new UserHomepage();
        extentTest = extentReports.createTest("Active Footer test"," User tests that Footer part takes to correct address");
        // Kayıtlı kullanıcı girişi yaparak Footer bölümündeki linkler istenilen dogru adreslere yönlendirmelidir

        //url ye gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Signup butonuna tıklanır
        userHomepage.signupButonu.click();
        // Kullanici adi girilir
        userHomepage.usernamegiris.sendKeys(ConfigReader.getProperty("userMail"));
        // Sifre girilir
        userHomepage.passwordGiris.sendKeys(ConfigReader.getProperty("userPass"));
        // login'e tıklanir
        userHomepage.loginGiris.click();

        // Sırayla Footer bolumundeki ogelere tıklanarak doğru adrese gotutrup goturmedigi kontrol edilir.
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.waitFor(2);
        WebElement abaouUs=Driver.getDriver().findElement(By.xpath("//a[@href='https://qa.hauseheaven.com/about-us']"));

        abaouUs.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.hauseheaven.com/about-us"));

        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.waitFor(2);

        WebElement contact=Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Contact us']"));
        contact.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.hauseheaven.com/contact"));

        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.waitFor(2);
        WebElement tearms=Driver.getDriver().findElement(By.xpath("//a[@title='Terms & Conditions']"));
        tearms.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.hauseheaven.com/terms-amp-conditions"));

        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.waitFor(2);
        WebElement allProperties=Driver.getDriver().findElement(By.xpath("//span[normalize-space()='All properties']"));
        allProperties.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.hauseheaven.com/properties"));

        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.waitFor(2);
        WebElement houseForSale=Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Houses for sale']"));
        houseForSale.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.hauseheaven.com/properties?type=sale"));

        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.waitFor(2);
        WebElement houseForRent=Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Houses for rent']"));
        houseForRent.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.hauseheaven.com/properties?type=rent"));

        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.waitFor(2);
        String ilkWHDDegeri=Driver.getDriver().getWindowHandle();
        WebElement theBenefist=Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'The Benefits Of Investing In Emerging Real Estate ')])[1]"));
        theBenefist.click();
        Set<String> wHDSeti = Driver.getDriver().getWindowHandles();
        String ikinciSafyaHandle="";
        for (String each: wHDSeti
        ) {
            if (!each.equals(ilkWHDDegeri)){
                ikinciSafyaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSafyaHandle);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hauseheaven.com/news/benefit-of-investing"));
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(ilkWHDDegeri);

        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'A Guide To Negotiating The Best Deal On Your Dream')])[1]")).click();

        Set<String> wHDSeti2 = Driver.getDriver().getWindowHandles();
        String ucuncuSafyaHandle="";
        for (String each: wHDSeti2
        ) {
            if (!each.equals(ilkWHDDegeri)){
                ucuncuSafyaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(ucuncuSafyaHandle);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hauseheaven.com/news/a-guide-to-negotiating"));
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(ilkWHDDegeri);


        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'The Rise Of Sustainable Homes: Building For A Gree')])[1]")).click();

        Set<String> wHDSeti3 = Driver.getDriver().getWindowHandles();
        String dorduncuSafyaHandle="";
        for (String each: wHDSeti3
        ) {
            if (!each.equals(ilkWHDDegeri)){
                dorduncuSafyaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(dorduncuSafyaHandle);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hauseheaven.com/news/the-rise-of-sutainable-homes"));
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(ilkWHDDegeri);


        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'How to Stage Your Home for a Quick and Profitable ')])[1]")).click();

        Set<String> wHDSeti4 = Driver.getDriver().getWindowHandles();
        String besinciSafyaHandle="";
        for (String each: wHDSeti4
        ) {
            if (!each.equals(ilkWHDDegeri)){
                besinciSafyaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(besinciSafyaHandle);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hauseheaven.com/news/how-to-stage-your-home-for-sale"));
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(ilkWHDDegeri);


        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Investing in Vacation Rental Properties: A Lucrati')])[1]")).click();

        Set<String> wHDSeti5 = Driver.getDriver().getWindowHandles();
        String altinciSafyaHandle="";
        for (String each: wHDSeti5
        ) {
            if (!each.equals(ilkWHDDegeri)){altinciSafyaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(altinciSafyaHandle);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hauseheaven.com/news/investing-in-vacation"));
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(ilkWHDDegeri);


        ReusableMethods.waitFor(2);
        WebElement appStore=Driver.getDriver().findElement(By.xpath("//i[@class='lni-apple theme-cl']"));
        JSUtilities.clickWithJS(Driver.getDriver(),appStore);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://www.apple.com/app-store/"));
        Driver.getDriver().navigate().back();

        // Bu link belirtilen adrese gitmiyor farklı bir adrese gidiyor.D olayısıyla burada bir hatalı kod yazilmis.

        ReusableMethods.waitFor(2);
        WebElement googlePlayStore=Driver.getDriver().findElement(By.xpath("//div[@class='footer-widget']//div[1]//div[1]//a[1]"));
        JSUtilities.clickWithJS(Driver.getDriver(),googlePlayStore);
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://play.google.com/store/games?hl=tr&gl=US"));

        extentTest.pass("User can access the website");
    }
}
