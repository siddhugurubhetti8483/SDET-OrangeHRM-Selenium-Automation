package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.Login;
import utils.ConfigReader;


public class LoginTest {
    WebDriver driver;
    Login login;
    ConfigReader config;

    @BeforeClass()
    public void setup(){
        config = new ConfigReader();
        driver = new ChromeDriver();
        driver.get(config.getProperty("url"));
        driver.manage().window().maximize();
        login = new Login(driver);
    }

    @Test
    public void validLogin(){
        
        login.performLogin(config.getProperty("username"), config.getProperty("password"));

        Assert.assertTrue(
            driver.getCurrentUrl().contains("dashboard"),
            "URL does not contain 'dashboard'"
        );
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
