package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitHelper;


import utils.WaitHelper;

public class Login {
    // Login Module
    // Valid login test.
    // Invalid login test (wrong username/password).
    // Empty fields validation.
    // Logout functionality.

    WebDriver driver;
    WaitHelper wait;

    @FindBy(name="username")
    WebElement userName;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath = "//button [@type='submit']")
    WebElement loginButton;


    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WaitHelper(driver);
    }

    public void performLogin(String user, String pass){
        wait.waitForVisibility(userName).sendKeys(user);
        wait.waitForVisibility(password).sendKeys(pass);
        wait.waitForClickable(loginButton).click();
    }
}
