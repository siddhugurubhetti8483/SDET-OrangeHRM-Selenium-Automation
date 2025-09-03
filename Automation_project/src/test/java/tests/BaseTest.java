package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.ConfigReader;
import utils.DriverManager;

public class BaseTest {
    protected WebDriver driver;
    protected ConfigReader config;

    @BeforeClass
    public void setup(){
        config = new ConfigReader();
        driver = DriverManager.getDriver();
        driver.get(config.getProperty("url"));
    }

    @AfterClass
    public void tearDown(){
        DriverManager.quitDriver();
    }

}
