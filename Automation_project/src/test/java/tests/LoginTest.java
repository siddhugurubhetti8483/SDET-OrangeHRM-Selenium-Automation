package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.Login;
import pages.Logout;


public class LoginTest extends BaseTest {
    private Login login;
    private Logout logout;

    @BeforeClass()
    public void initPage(){
        super.setup();
        login = new Login(driver);
        logout = new Logout(driver);
    }

    @Test(priority = 1)
    public void invalidLogin() throws InterruptedException{
        login.performLogin(config.getProperty("wronguser"), "wrongpass");
        Thread.sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("Invalid credentials"));
    }
    
    @Test(priority = 2)
    public void emptyCredentialLogin(){
        login.performLogin("", "");
        Assert.assertTrue(driver.getPageSource().contains("Required"));
    }

    @Test (priority = 3)
    public void validLogin(){
        
        login.performLogin(config.getProperty("username"), config.getProperty("password"));

        Assert.assertTrue(
            driver.getCurrentUrl().contains("dashboard"),
            "URL does not contain 'dashboard'"
        );
    }

    @Test(priority = 4, dependsOnMethods = "validLogin")
    public void logout(){
        logout.performLogout();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("login"),
            "Logout failed, user still inside"
        );
    }
}
