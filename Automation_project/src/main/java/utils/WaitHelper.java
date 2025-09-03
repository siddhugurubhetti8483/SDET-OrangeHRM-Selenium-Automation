package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
    WebDriver driver;
    WebDriverWait wait;

    public WaitHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement waitForVisibility(WebElement userName){
        return wait.until(ExpectedConditions.visibilityOf(userName));
    }

    public WebElement waitForClickable(WebElement loginButton){
        return wait.until(ExpectedConditions.elementToBeClickable(loginButton));
    }
}
