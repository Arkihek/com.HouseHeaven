package test;

import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US01_TC001 {

    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

}


