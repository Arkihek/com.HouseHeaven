package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US01_TC001 {

    // Bir ziyaretçi olarak siteyi kullanabilmek icin web sitesine erişebildiğimi doğrulayabilmeliyim.

    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void test01(){
        // Giriş testi yapılmiştir.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        String ecpected="https://qa.hauseheaven.com/";

        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actual,ecpected);
        Driver.closeDriver();
    }

}


